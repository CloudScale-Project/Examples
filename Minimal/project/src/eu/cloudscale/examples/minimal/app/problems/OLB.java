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
package eu.cloudscale.examples.minimal.app.problems;

/**
 * Represents the One Lane Bridge problem.
 *
 * @author C5170547
 *
 */
public final class OLB {
	private static final int TIME_TO_SLEEP = 100;
	private static OLB instance = new OLB();

	/**
	 *
	 * @return singleton instance
	 */
	public static OLB getInstance() {
		return instance;
	}

	private OLB() {

	}

	/**
	 * Method leading to a One Lane Bridge.
	 */
	public synchronized void call() {
		try {
			Thread.sleep(TIME_TO_SLEEP);
		} catch (final InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
