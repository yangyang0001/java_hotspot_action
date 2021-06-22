package com.deepblue.hotspot_inaction.chapter_03_klass;

public interface ParentI {

	// 此处可用其他任何一个类代替Thread, 可用Other.java来代替
	public static Thread thread = new Thread() {
		{
			System.out.println("Interface ParentI initialized!");
		}
	};

	public static OtherK other = new OtherK();

	void sayHello();
}
