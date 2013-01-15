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
 * @since 0.1.0 Jan 14, 2013 4:26:02 PM
 * @version Rev1.java 0.1.0 Jan 14, 2013 4:26:02 PM
 */
public class Rev1 extends AbstractLayout {

	public static final Layout GPIO25 = new Rev1("gpio25", 25);

	public static final Layout GPIO24 = new Rev1("gpio24", 24);

	public static final Layout GPIO23 = new Rev1("gpio23", 23);

	public static final Layout GPIO22 = new Rev1("gpio22", 22);

	public static final Layout GPIO21 = new Rev1("pio21", 21);

	public static final Layout GPIO18 = new Rev1("gpio18", 18);

	public static final Layout GPIO17 = new Rev1("gpio17", 17);

	public static final Layout GPIO15 = new Rev1("gpio15", 15);

	public static final Layout GPIO14 = new Rev1("gpio14", 14);

	public static final Layout GPIO11 = new Rev1("gpio11", 11);

	public static final Layout GPIO10 = new Rev1("gpio10", 10);

	public static final Layout GPIO9 = new Rev1("gpio9", 9);

	public static final Layout GPIO8 = new Rev1("gpio8", 8);

	public static final Layout GPIO7 = new Rev1("gpio7", 7);

	public static final Layout GPIO4 = new Rev1("gpio4", 4);

	public static final Layout GPIO1 = new Rev1("gpio1", 1);

	public static final Layout GPIO0 = new Rev1("gpio0", 0);

	private Rev1(String name, int bit) {
		super(name, bit);
	}

	public int version() {
		return 1;
	}

}
