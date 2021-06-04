package com.deepblue.hotspot_inaction.chapter_02_launcher;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class TestObject {

    public static void main(String[] args) throws Exception{

        long JNI_VERSION_1_1 = 0x00010001;
        long JNI_VERSION_1_2 = 0x00010002;
        long JNI_VERSION_1_4 = 0x00010004;
        long JNI_VERSION_1_6 = 0x00010006;

        System.out.println("JNI_VERSION_1_1 = " + JNI_VERSION_1_1);
        System.out.println("JNI_VERSION_1_2 = " + JNI_VERSION_1_2);
        System.out.println("JNI_VERSION_1_4 = " + JNI_VERSION_1_4);
        System.out.println("JNI_VERSION_1_6 = " + JNI_VERSION_1_6);

    }

}
