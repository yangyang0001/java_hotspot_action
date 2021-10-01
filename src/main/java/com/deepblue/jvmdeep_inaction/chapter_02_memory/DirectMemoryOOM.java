package com.deepblue.jvmdeep_inaction.chapter_02_memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM args: -Xmx20M -XX:MaxDirectMemorySize=20M
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) throws IllegalAccessException {

		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		int i = 0;
		while (true) {
			System.out.println("i = :" + (++i));
			unsafe.allocateMemory(_1MB);
		}

	}
}
