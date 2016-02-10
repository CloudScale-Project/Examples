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
public enum EMA {
	INSTANCE;
	
	/**
	 *
	 * @return singleton instance
	 */
	public static EMA getInstance() {
		return INSTANCE;
	}

	public void call() {
        for (int i=0; i < 1000; i++) {
            final byte[] largeArray = new byte[10000];
            OK.getInstance().call();
            doSomething(largeArray);
        }
    }

    private void doSomething(final byte[] data) {
    }

}
