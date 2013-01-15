/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.comze.driver.rio;

import java.io.IOException;

/**
 * @author <a href="mailto:gkzhong@gmail.com">GK.ZHONG</a>
 * @since 0.1.0 Jan 15, 2013 3:48:13 PM
 * @version ControllerFactory.java 0.1.0 Jan 15, 2013 3:48:13 PM
 */
public abstract class ControllerFactory {

	public static WritableController writableController(Layout layout) throws IOException {
		return new BCM2835Controller(layout, Direction.OUT);
	}

	public static ReadableController readableController(Layout layout) throws IOException {
		return new BCM2835Controller(layout);
	}

}