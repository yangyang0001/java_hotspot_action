package com.deepblue.jvmdeep_inaction.chapter_04_command_tools;


/**
 * VM args: -Xmx10M  -XX:+UseSerialGC -XX:-UseCompressedOops
 */
public class HSDB_TEST {

	static class TEST {
		static ObjectHolder staticObj = new ObjectHolder();
		ObjectHolder instanceObj = new ObjectHolder();

		void foo() {
			ObjectHolder localObj = new ObjectHolder();
			System.out.println("done"); // debug点
		}
	}

	private static class ObjectHolder {}

	public static void main(String[] args) {
	    TEST test = new HSDB_TEST.TEST();
		test.foo();
	}


}
