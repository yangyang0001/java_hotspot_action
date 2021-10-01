package com.deepblue.jvmdeep_inaction.chapter_04_command_tools;

import java.util.ArrayList;
import java.util.List;

/**
 * 死循环校验
 */
public class DeadLoop {

	public static void main(String[] args) {
	    List<Long> list = new ArrayList<Long>();
		Long index = 0L;

		while(true) {
			list.add(index++);
			System.out.println("dead_loop index = :" + index + ", list.size = :" + list.size());
		}
	}
}
