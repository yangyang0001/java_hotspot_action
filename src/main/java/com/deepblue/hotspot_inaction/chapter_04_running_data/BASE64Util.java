package com.deepblue.hotspot_inaction.chapter_04_running_data;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;

/**
 * 本类探讨  方法区, 本地内存, 堆  中java程序运行的过程
 */
public class BASE64Util {

	public static String encodeBase64(String message) throws UnsupportedEncodingException {
		BASE64Encoder encoder = new BASE64Encoder();
		String result = encoder.encodeBuffer(message.getBytes("UTF-8"));
		return result;
	}

	public static void main(String[] args) throws Exception {
		long index = 0;
		while(true) {
			System.out.println("base_64_util index = " + index + ", encodeBase64 is " + encodeBase64(String.valueOf(index)));
			index++;
			Thread.currentThread().sleep(1000L);
		}
	}
}
