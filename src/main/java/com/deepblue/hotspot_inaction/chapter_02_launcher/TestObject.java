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

//        long JNI_VERSION_1_1 = 0x00010001;
//        long JNI_VERSION_1_2 = 0x00010002;
//        long JNI_VERSION_1_4 = 0x00010004;
//        long JNI_VERSION_1_6 = 0x00010006;
//
//        System.out.println("JNI_VERSION_1_1 = " + JNI_VERSION_1_1);
//        System.out.println("JNI_VERSION_1_2 = " + JNI_VERSION_1_2);
//        System.out.println("JNI_VERSION_1_4 = " + JNI_VERSION_1_4);
//        System.out.println("JNI_VERSION_1_6 = " + JNI_VERSION_1_6);


//        Long time = System.currentTimeMillis();
//        System.out.println("time :" + time);
//        int days = 6;
//
//        Calendar calendar0 = getDayEndTime(time);
//        calendar0.add(Calendar.DAY_OF_MONTH, days);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar0.getTime()));
//
//        days = 0;
//        Calendar calendar1 = getDayEndTime(time);
//        calendar1.add(Calendar.DAY_OF_MONTH, days);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar1.getTime()));


//        int startNum = 10;
//        int endNum   = 20;
//        int startBound = startNum < endNum ? startNum : endNum;
//        int endBound = startNum > endNum ? startNum : endNum;
//
//        Random random = new Random();
//        int randomInt = random.nextInt(endBound + 1 - startBound);
//        int num = randomInt + startBound;
//        System.out.println("randomInt = " + randomInt);
//        System.out.println("num       = " + num);
//
//        if (num < startBound) {
//            System.out.println("getRewardNum -- random reward num smaller than startBound, num = " + num + "startBound = " + startBound);
//            num = startNum;
//        } else if (num > endBound) {
//            System.out.println("getRewardNum -- random reward num bigger than endBound, num = " + num + "endBound = " + endBound);
//            num = endBound;
//        }
//
//        System.out.println("num = " + num);

        AutoRewardConfig config = new AutoRewardConfig();
        config.setStartTime("2021-06-03 00:00:00");
        config.setCategory(52L);
        config.setMissionId(208L);
        List<Long> userYids = Lists.newArrayList();
        userYids.add(1306214892L);
        config.setUserYids(userYids);

        String configString = JSON.toJSONString(config);
        System.out.println("configString :" + configString);

        config = JSON.parseObject(configString, AutoRewardConfig.class);
        System.out.println("config       :" + JSON.toJSONString(config));

//        String dateString = "2021-06-03 00:00:00";
//        Long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString).getTime();
//        System.out.println("time :" + time);
//        System.out.println("curr :" + System.currentTimeMillis());
    }

    public static Calendar getDayEndTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar;
    }

    @Data
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AutoRewardConfig {

        // 开始时间  格式:2020-06-03 00:00:00
        private String startTime;

        // 任务分类ID
        private Long category;

        // 任务ID
        private Long missionId;

        // 如果配置, 则只有配置的新人用户做自动送勋章任务, 如果不配置则 所有新人用户都做自动送勋章
        private List<Long> userYids = Lists.newArrayList();
    }
}
