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
 * Represents simple case without any problem.
 *
 * @author C5170547
 *
 */
public final class OK {
	private static final int FIB_NUMBER = 25;
	private static OK instance;

	/**
	 *
	 * @return singleton instance
	 */
	public static OK getInstance() {
		if (instance == null) {
			instance = new OK();
		}
		return instance;
	}

	private OK() {

	}

	public void call() {

		fibonacci(FIB_NUMBER);
	}

	/**
	 *
	 * @param n fib parameter
	 * @return fib(n)
	 */
	private int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}
