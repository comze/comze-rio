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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author <a href="mailto:gkzhong@gmail.com">GK.ZHONG</a>
 * @since 0.1.0 Jan 14, 2013 5:03:58 PM
 * @version FileSystemMapper.java 0.1.0 Jan 14, 2013 5:03:58 PM
 */
public abstract class FileSystemMapper {

	private static final String DIRECTION = "/sys/class/gpio/%s/direction";

	private static final String VALUE = "/sys/class/gpio/%s/value";

	private static final String EXPORT = "/sys/class/gpio/export";

	private static final String UNEXPORT = "/sys/class/gpio/unexport";

	public static void direction(String name, Direction direction) throws IOException {
		write(new File(String.format(DIRECTION, name)), direction.name());
	}

	public static boolean value(String name) throws IOException {
		return !read(new File(String.format(VALUE, name))).equals("0");
	}

	public static void value(String name, boolean value) throws IOException {
		write(new File(String.format(VALUE, name)), value ? "1" : "0");
	}

	public static void export(String name) throws IOException {
		write(new File(EXPORT), name.substring(4));
	}

	public static void unexport(String name) throws IOException {
		write(new File(UNEXPORT), name.substring(4));
	}

	private static String read(File file) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			int c = -1;
			while ((c = inputStream.read()) != -1) {
				stringBuilder.append((char) c);
			}
		} finally {
			inputStream.close();
		}
		return stringBuilder.toString();
	}

	private static void write(File file, String value) throws IOException {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file, false);
			outputStream.write(value.getBytes());
		} finally {
			outputStream.close();
		}
	}

}
