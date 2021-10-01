package com.deepblue.jvmdeep_inaction.chapter_03_gc;

/**
 * 分配策略 创建的对象优先在Eden区中分配
 * VM args  -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 分析:
 * 		新生代总容量10M, Eden : Survivor = 8 则 Eden区 占8M, From Survivor区 占1M, To Survivor区 占1M
 * 		老年代总容量10M, 因新生代 + 老年代 = 堆区总容量 = 20M
 */
public class Allocation_01_Eden {

	public static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		System.out.println("Allocation_01_Eden main invoke start");
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB];
	}
}
