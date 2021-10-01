package com.deepblue.jvmdeep_inaction.chapter_02_memory;


/**
 * StringBuilder 创建的对象在堆中
 */
public class InternTest {

	public static void main(String[] args) {
		String string0 = new StringBuilder("HotSpot").append("实战").toString();
		String string1 = new StringBuilder("ja").append("va").toString();

		System.out.println("string0.intern() == string0 is :" + (string0.intern() == string0));
		System.out.println("string1.intern() == string1 is :" + (string1.intern() == string1));

		String a = "AAA";
		String b = new String("AAA");
		System.out.println("a == b                      is :" + (a == b));
		System.out.println("a.intern() == b.intern()    is :" + (a.intern() == b.intern()));
		System.out.println("a.equals(b)                 is :" + (a.equals(b)));
	}

}
