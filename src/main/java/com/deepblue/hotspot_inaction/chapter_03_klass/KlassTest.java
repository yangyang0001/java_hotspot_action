package com.deepblue.hotspot_inaction.chapter_03_klass;

public class KlassTest {

	public static void main(String[] args) throws Exception{
		long index = 0;
		while(true) {
			System.out.println("index = " + index ++);
			Thread.currentThread().sleep(1000L);
		}
	}
}
