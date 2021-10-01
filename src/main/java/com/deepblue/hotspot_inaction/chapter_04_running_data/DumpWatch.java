package com.deepblue.hotspot_inaction.chapter_04_running_data;

public class DumpWatch {

	public static void main(String[] args) throws Exception {
		long index = 0;
		while(true) {
			System.out.println("dump_watch index = " + (index ++) + "\n");
			Thread.currentThread().sleep(1000);

			if(index == 100) {
				throw new OutOfMemoryError("dump_watch throw oome");
			}
		}
	}
}
