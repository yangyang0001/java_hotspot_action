package com.deepblue.hotspot_inaction.chapter_00_init;

/**
 * JDK1.7 以后的
 *      支持二进制的书面化 0b 或 0B开头
 *      支持数字以 下划线的 方式分隔了
 */
public class JDK_02_Number {

    public static void main(String[] args) {
        int a = 0b0001;
        int b = 0B0011;
        System.out.println("a :" + a + ", b :" + b);

        long c = 1_0000_0000L;
        int d  = 1_0000_8888;
        System.out.println("c :" + c + ", d :" + d);
    }
}
