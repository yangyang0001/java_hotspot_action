package com.deepblue.jvmdeep_inaction.chapter_02_memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆区内存溢出
 * VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails -XX:SurvivorRatio=8 -verbose:gc -XX:ErrorFile=jvm_crash.log
 *
 */
public class HeapOOM {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true) {
            list.add(new OOMObject());
        }
    }
}
