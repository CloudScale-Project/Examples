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

import java.util.ArrayList;
import java.util.List;

/**
 * Garbage.
 * @author Alexander Wert
 *
 */
public class GarbageObjectA {

	private static final int GARBAGE_SIZE = 20;
	List<GarbageObjectB> list = new ArrayList<>();

	/**
	 * Constructor.
	 */
	public GarbageObjectA() {
		for (int i = 0; i < GARBAGE_SIZE; i++) {
			list.add(new GarbageObjectB());
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}
