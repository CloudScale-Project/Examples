/**
 * Copyright 2014 SAP AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.cloudscale.examples.minimal.load;

import java.util.Random;

import javax.ws.rs.core.MediaType;

import org.lpe.common.util.web.LpeHTTPUtils;
import org.spotter.ext.workload.simple.ISimpleVUser;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * Simple virtual user script.
 *
 * @author Alexander Wert
 *
 */
public class VUser implements ISimpleVUser {

	private static final int THINK_TIME_MIN = 100;
	private static final int THINK_TIME_MAX = 200;
	private static final int TIMEOUT = 120 * 1000;
	private static final Random random = new Random(System.nanoTime());
	final WebResource webResource;

	/**
	 * Construcotr.
	 */
	public VUser() {
		final Client client = LpeHTTPUtils.getWebClient();
		client.setConnectTimeout(TIMEOUT);
		client.setReadTimeout(TIMEOUT);
		webResource = client.resource("http://localhost:8081/");
	}

	@Override
	public void executeIteration() {
		try {
			// call OLB service
			webResource.path("demo").path("testOLB").accept(MediaType.APPLICATION_JSON).get(String.class);
			Thread.sleep(getNextThinkTime());

			// call EMA service
			webResource.path("demo").path("testEMA").accept(MediaType.APPLICATION_JSON).get(String.class);
			Thread.sleep(getNextThinkTime());
			
			// call Fibonacci service
			webResource.path("demo").path("testOK").accept(MediaType.APPLICATION_JSON).get(String.class);
			Thread.sleep(getNextThinkTime());
		} catch (final Throwable e) {
			// ignoring exception
			e.printStackTrace();
		}
	}

	private long getNextThinkTime() {
		final int r = random.nextInt(THINK_TIME_MAX - THINK_TIME_MIN);
		return THINK_TIME_MIN + r;
	}

}
