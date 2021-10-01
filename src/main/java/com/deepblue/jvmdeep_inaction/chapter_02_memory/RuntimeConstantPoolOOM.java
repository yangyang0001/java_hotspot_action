package com.deepblue.jvmdeep_inaction.chapter_02_memory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -XX:PermSize=2M -XX:MaxPermSize=2M
 * 在jdk8中 已经没有这种限制只有MetaSpace的概念了
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {

		String string0 = String.valueOf("AAA").intern();
		String string1 = "AAA";
		System.out.println("equals :" + string0.equals(string1));
		System.out.println("intern :" + (string0.intern() == string1.intern()));

		List<String> list = new ArrayList<String>();
		int index = 0;
		while (true) {
			list.add(String.valueOf("ABCDEFGHIJKLMNOPQISTUVWXYZ0123456789_" + index++).intern());
		}
	}
}
