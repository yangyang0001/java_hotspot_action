package com.deepblue.jvmdeep_inaction.chapter_04_command_tools;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -Xms100M -Xmx100M -XX:+UseSerialGC
 */
public class JCONSOLE_TEST {

	/**
	 * 内存对象占据 空间64K
	 */
	public static class OOMObject {
		private byte[] placeholder = new byte[64 * 1024];
	}

	public static void fillheap(int num) throws InterruptedException {
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i = 0; i < num; i++) {
			Thread.currentThread().sleep(500L);
			list.add(new OOMObject());
			System.out.println("i = :" + i + ", list.size = :" + list.size());
		}
		System.gc(); // 这句话放到方法外, 可以回收掉 Old区的对象
	}

	public static void main(String[] args) throws Exception{
		fillheap(1000);
	}
}
