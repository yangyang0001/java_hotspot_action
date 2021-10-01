package com.deepblue.jvmdeep_inaction.chapter_03_gc;

/**
 * 分配策略: 大对象直接进入老年代 使用VM Option  -XX:PretenureSizeThreshold=<byte-size>	这里设置为3M = 3 * 1024KB = 3 * 1024 * 1024 byte
 * VM args: -Xms20M -Xmx20M -Xmn10M -XX:PretenureSizeThreshold=3145728 -XX:+PrintGCDetails -verbose:gc -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 分析:
 * 		新生代总容量10M, Eden : Survivor = 8 则 Eden区 占8M, From Survivor区 占1M, To Survivor区 占1M
 * 		老年代总容量10M, 因新生代 + 老年代 = 堆区总容量 = 20M
 */
public class Allocation_02_Old_Size {

	public static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		System.out.println("Allocation_02_Old main invoke start");
		byte[] allocation1;
		allocation1 = new byte[4 * _1MB];
	}
}
