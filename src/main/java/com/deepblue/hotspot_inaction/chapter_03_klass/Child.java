package com.deepblue.hotspot_inaction.chapter_03_klass;

public class Child extends ParentK implements ParentI{

	@Override
	public void sayHello() {
		System.out.println("Child sayHello invoked!");
	}

	public static void sayChild() {
		System.out.println("Child sayChild invoked!");
	}

}
