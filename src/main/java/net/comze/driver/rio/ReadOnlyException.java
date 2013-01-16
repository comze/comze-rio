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
 * @since 0.1.0 Jan 14, 2013 3:36:48 PM
 * @version ReadOnlyException.java 0.1.0 Jan 14, 2013 3:36:48 PM
 */
public class ReadOnlyException extends IOException {

	private static final long serialVersionUID = -204080077557378451L;

	public ReadOnlyException() {
		super();
	}

	public ReadOnlyException(String message, Throwable cause) {
		super(message, cause);
	}

	public ReadOnlyException(String message) {
		super(message);
	}

	public ReadOnlyException(Throwable cause) {
		super(cause);
	}

}
