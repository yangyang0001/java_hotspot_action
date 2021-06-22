package com.deepblue.hotspot_inaction.chapter_02_launcher;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

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

//        List<Integer> allCodes0 = Lists.newArrayList(1, 2, 3);
//        List<Integer> allCodes1 = Lists.newArrayList();
//
//        List<Integer> codes0 = Lists.newArrayList(1);
//        List<Integer> codes1 = Lists.newArrayList(1, 2);
//        List<Integer> codes2 = Lists.newArrayList(1, 2, 3);
//        List<Integer> codes3 = Lists.newArrayList(2, 4);
//        List<Integer> codes4 = Lists.newArrayList();
//        List<Integer> codes5 = null;
//
//        System.out.println(allCodes0.containsAll(codes0));
//        System.out.println(allCodes0.containsAll(codes1));
//        System.out.println(allCodes0.containsAll(codes2));
//        System.out.println(allCodes0.containsAll(codes3));
//        System.out.println(allCodes0.containsAll(codes4));
//        System.out.println(allCodes0.containsAll(codes5));

//        System.out.println("1------------------------------------------------------");
//
//        System.out.println(allCodes1.containsAll(codes0));
//        System.out.println(allCodes1.containsAll(codes1));
//        System.out.println(allCodes1.containsAll(codes2));
//        System.out.println(allCodes1.containsAll(codes3));
//        System.out.println(allCodes1.containsAll(codes4));
////        System.out.println(allCodes1.containsAll(codes5));
//
//        System.out.println("2------------------------------------------------------");


//        List<Integer> resultList = Lists.newArrayList(1, 3, 5, 7, 9, 11, 10);
//        System.out.println("resultList before :" + JSON.toJSONString(resultList));
//        List<Integer> expireList = Lists.newArrayList(2, 3, 5);
//        resultList.removeAll(expireList);
//        System.out.println("resultList after  :" + JSON.toJSONString(resultList));

//        User user0 = new User(10, "");
//        User user1 = new User(14, "");
//        User user2 = new User(62, "");
//        User user3 = new User(33, "");
//        User user4 = new User(55, "");
//        User user5 = new User(33, "");

//        List<User> users = Lists.newArrayList(user0, user1, user2, user3, user4, user5);
//        System.out.println("users before :" + JSON.toJSONString(users));

//        decorate(users);
//        System.out.println("users after  :" + JSON.toJSONString(users));

//        sortedNobleUserList(users);
//        System.out.println("users sorted :" + JSON.toJSONString(users));

//        int pageSize = 4;
//        for(int i = 0; i < 10; i++) {
//            int pageIndex = i;
//            List<User> list  = getPageList(users, pageIndex, pageSize);
//
//            System.out.println("list :" + JSON.toJSONString(list));
//        }
//        Long timeMillis = System.currentTimeMillis();
//        Long currentSecond = timeMillis / 1000;
//        System.out.println("timeMillis    :" + timeMillis);
//        System.out.println("currentSecond :" + currentSecond);

        User user = new User();
        System.out.println("user :" + JSON.toJSONString(user));
        decorateUser(user);
        System.out.println("user :" + JSON.toJSONString(user));
    }


    public static void decorateUser(User user) {
        user.setCode(1111);
        user.setDesc("1111");
    }

    public static void decorate(List<User> users) {
        for(User user: users) {
            user.setDesc("user_" + user.getCode());
        }
    }

    public static void sortedNobleUserList(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getCode() - o1.getCode();
            }
        });
    }

    public static List<User> getPageList(List<User> users, int pageIndex, int pageSize) {
        int fromIndex = pageIndex * pageSize;
        if (fromIndex >= users.size()) {
            return Collections.emptyList();
        }

        int toIndex = (pageIndex + 1) * pageSize;
        if (toIndex >= users.size()) {
            toIndex = users.size();
        }
        return users.subList(fromIndex, toIndex);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class User {
        private Integer code;
        private String  desc;
    }



}
