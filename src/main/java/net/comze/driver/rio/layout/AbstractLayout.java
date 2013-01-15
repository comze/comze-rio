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
 * @since 0.1.0 Jan 14, 2013 4:28:07 PM
 * @version AbstractLayout.java 0.1.0 Jan 14, 2013 4:28:07 PM
 */
public abstract class AbstractLayout implements Layout {

	public AbstractLayout(String name, int bit) {
		this.bit = bit;
		this.name = name;
	}

	private int bit;

	private String name;

	@Override
	public int bit() {
		return bit;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public int compareTo(Layout o) {
		return bit() - o.bit();
	}

	@Override
	public boolean equals(Object o) {
		return compareTo((Layout) o) == 0;
	}

	@Override
	public String toString() {
		return String.format("{\"version\"=\"%s\", \"bit\"=\"%s\", \"name\"=\"%s\"}", version(), bit(), name());
	}

}
