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
package net.comze.driver.rio.layout;

import net.comze.driver.rio.Layout;

/**
 * @author <a href="mailto:gkzhong@gmail.com">GK.ZHONG</a>
 * @since 0.1.0 Jan 14, 2013 4:27:15 PM
 * @version Rev2.java 0.1.0 Jan 14, 2013 4:27:15 PM
 */
public final class Rev2 extends AbstractLayout {

	public static final Layout GPIO27 = new Rev2("gpio27", 27);

	public static final Layout GPIO25 = new Rev2("gpio25", 25);

	public static final Layout GPIO24 = new Rev2("gpio24", 24);

	public static final Layout GPIO23 = new Rev2("gpio23", 23);

	public static final Layout GPIO22 = new Rev2("gpio22", 22);

	public static final Layout GPIO18 = new Rev2("gpio18", 18);

	public static final Layout GPIO17 = new Rev2("gpio17", 17);

	public static final Layout GPIO15 = new Rev2("gpio15", 15);

	public static final Layout GPIO14 = new Rev2("gpio14", 14);

	public static final Layout GPIO11 = new Rev2("gpio11", 11);

	public static final Layout GPIO10 = new Rev2("gpio10", 10);

	public static final Layout GPIO9 = new Rev2("gpio9", 9);

	public static final Layout GPIO8 = new Rev2("gpio8", 8);

	public static final Layout GPIO7 = new Rev2("gpio7", 7);

	public static final Layout GPIO4 = new Rev2("gpio4", 4);

	public static final Layout GPIO3 = new Rev2("gpio3", 3);

	public static final Layout GPIO2 = new Rev2("gpio2", 2);

	private Rev2(String name, int bit) {
		super(name, bit);
	}

	public int version() {
		return 2;
	}

}
