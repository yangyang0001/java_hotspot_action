package com.deepblue.jvmdeep_inaction.chapter_03_gc;

/**
 * 对象分配策略: 长期存活的对象直接进入老年代中; TODO 在吞吐量的垃圾回收器中 该VMOption -XX:MaxTenuringThreshold= 不支持使用
 * VM args -Xms20M -Xmx20M -Xmn10M -XX:MaxTenuringThreshold=1 -XX:+PrintGCDetails -verbose:gc -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 分析:
 * 		新生代总容量10M, Eden : Survivor = 8 则 Eden区 占8M, From Survivor区 占1M, To Survivor区 占1M
 * 		老年代总容量10M, 因新生代 + 老年代 = 堆区总容量 = 20M
 */
public class Allocation_03_Old_Age {

	public static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		System.out.println("Allocation_03_Old_Age main invoke start");
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[_1MB / 4];
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
}
