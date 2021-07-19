package com.deepblue.hotspot_inaction.chapter_04_running_data;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * 本类探讨  方法区, 本地内存, 堆  中java程序运行的过程
 */
public class BASE64Util {

	private Logger logger = Logger.getLogger(BASE64Util.class.getName());

	public String encodeBase64(String message) throws UnsupportedEncodingException {
		BASE64Encoder encoder = new BASE64Encoder();
		String result = encoder.encodeBuffer(message.getBytes("UTF-8"));
		logger.info("message = " + message);
		logger.info("result  = " + result);
		return result;
	}
}
