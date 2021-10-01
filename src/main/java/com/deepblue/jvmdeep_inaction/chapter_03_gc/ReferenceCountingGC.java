package com.deepblue.jvmdeep_inaction.chapter_03_gc;

import com.alibaba.fastjson.JSON;
import lombok.*;

/**
 * 引用计数的反例: 如果 ObjectA 引用 ObjectB 且 ObjectB 引用 ObjectA, 如果二者在后面的程序中都没有用到, 但是他们的计数器都为1, 这样就会造成引用计数器不能为0造成不能回收!
 *
 * JVM args: -XX:+PrintGCDetails -verbose:gc
 */
public class ReferenceCountingGC {

	public static void main(String[] args) {
		ObjectA objectA = new ObjectA();
		ObjectB objectB = new ObjectB();
		// 这只互相引用
		objectA.setReference(objectB);
		objectB.setReference(objectA);

		System.out.println("objectA :" + JSON.toJSONString(objectA));
		System.out.println("objectB :" + JSON.toJSONString(objectB));

		objectA = null;
		objectB = null;

		// 发生GC后 objectA 和 objectB 是否能够被回收呢?
		System.gc();
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	@Builder
	public static class ObjectA {
		private ObjectB reference;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	@Builder
	public static class ObjectB {
		private ObjectA reference;
	}
}
