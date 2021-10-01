package com.deepblue.jvmdeep_inaction.chapter_02_memory;

/**
 * 虚拟栈溢出测试
 * VM args: -Xss128K	这种递归死循环会抛出 StackOverflowError
 */
public class StackSOF {

	public int deep = 0;

	public void stackLength() {
		deep ++;
		System.out.println("StackSOF deep is :" + deep);
		stackLength();
	}

	public static void main(String[] args) {
		StackSOF sof = new StackSOF();
		sof.stackLength();
	}

}
