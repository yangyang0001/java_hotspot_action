package com.deepblue.hotspot_inaction.chapter_00_init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDK1.7 以后对范型 有了新的简化方式
 */
public class JDK_04_Generic {
    public static void main(String[] args) {
        Map<String, Map<String, List<String>>> map = new HashMap<>();
    }
}
