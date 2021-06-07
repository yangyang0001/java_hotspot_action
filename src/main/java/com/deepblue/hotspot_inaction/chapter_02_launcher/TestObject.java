package com.deepblue.hotspot_inaction.chapter_02_launcher;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class TestObject {

    public static void main(String[] args) throws Exception{

//        long JNI_VERSION_1_1 = 0x00010001;
//        long JNI_VERSION_1_2 = 0x00010002;
//        long JNI_VERSION_1_4 = 0x00010004;
//        long JNI_VERSION_1_6 = 0x00010006;
//
//        System.out.println("JNI_VERSION_1_1 = " + JNI_VERSION_1_1);
//        System.out.println("JNI_VERSION_1_2 = " + JNI_VERSION_1_2);
//        System.out.println("JNI_VERSION_1_4 = " + JNI_VERSION_1_4);
//        System.out.println("JNI_VERSION_1_6 = " + JNI_VERSION_1_6);

        List<String> merchantIds = Lists.newArrayList();
        merchantIds.add("20150211ZH02030651");
        String jsonIds = JSON.toJSONString(merchantIds);
        System.out.println("jsonIds :" + jsonIds);

        List<String> strings = JSON.parseArray(jsonIds, String.class);
        System.out.println("strings :" + JSON.toJSONString(strings));

        String merchantId = "20150211ZH02030651";
        if(CollectionUtils.isNotEmpty(merchantIds) && !merchantIds.contains(merchantId)) {
            // 来疯IOS退款成功订单 消息
            System.out.println("来疯订单");
        } else {
            // TODO doNothing； 不区分来疯IOS和优酷IOS 则什么都不做! 目的就是接入来疯IOS退款成功消息
            System.out.println("do Nothing");
        }

    }

}
