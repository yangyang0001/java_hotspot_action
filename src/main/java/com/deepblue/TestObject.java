package com.deepblue;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
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

//        User user = new User();
//        System.out.println("user :" + JSON.toJSONString(user));
//        decorateUser(user);
//        System.out.println("user :" + JSON.toJSONString(user));

//        List<Long> list = Lists.newArrayList();
//        System.out.println(list.contains(200L));
//        System.out.println(list.size());
//        list.add(1000000L);
//        list.add(2000000L);
//        System.out.println(JSON.toJSONString(list));
//
//        String a = "[1000000,2000000]";
//        List<Long> longs = JSONObject.parseArray(null, Long.class);
//        System.out.println(JSON.toJSONString(longs));

//        SimpleDateFormat defaultSDF = new SimpleDateFormat("yyyy-MM-dd");
//        String contractEffectiveTimeStr = defaultSDF.format(new Date());
//        Date contractEffectiveTime = null;
//        try {
//            contractEffectiveTime = defaultSDF.parse(contractEffectiveTimeStr);
//        } catch (ParseException pe) {
//            pe.printStackTrace();
//        }
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(contractEffectiveTime);
//        calendar.add(Calendar.YEAR, 1);
//        calendar.add(Calendar.DATE, -1);
//        Date contractExpirationTime = calendar.getTime();
//
//        SimpleDateFormat mineSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("contractEffectiveTime  :" + mineSDF.format(contractEffectiveTime));
//        System.out.println("contractExpirationTime :" + mineSDF.format(contractExpirationTime));

//        KlassUser klassUser = new KlassUser();
//        klassUser.userList = Lists.newArrayList();
//        klassUser.getUserList().add(new User(100, "100"));
//        klassUser.getUserList().add(new User(200, "200"));
//        klassUser.getUserList().add(new User(300, "300"));
//
//        klassUser.strList  = Lists.newArrayList();
//        klassUser.getStrList().add("11111");
//        klassUser.getStrList().add("22222");
//        klassUser.getStrList().add("33333");
//
//        System.out.println("klassUser :" + JSON.toJSONString(klassUser));

//        ClassState classState = ClassState.OTHER;
//        switch (classState) {
//            case UNPARSABLE_BY_GC:
//                System.out.println("UNPARSABLE_BY_GC");
//                break;
//            case ALLOCATED:
//                System.out.println("ALLOCATED");
//                break;
//            case LOADED:
//                System.out.println("LOADED");
//                break;
//            case LINKED:
//                System.out.println("LINKED");
//                break;
//            case BEING_INITIALIZED:
//                System.out.println("BEING_INITIALIZED");
//                break;
//            case FULLY_INITIALIZED:
//                System.out.println("FULLY_INITIALIZED");
//                break;
//            case INITIALIZATION_ERROR:
//                System.out.println("INITIALIZATION_ERROR");
//                break;
//            default:
//                System.out.println("DEFAULT");
//                break;
//        }

        List<User> userList = Lists.newArrayList();
//        userList.add(new User(100, "100"));
//        userList.add(new User(200, "200"));
//        userList.add(new User(300, "300"));
//        userList.add(new User(400, "400"));

//        User user = null;
//        Optional<User> userOptional = userList.stream().filter(item -> Objects.nonNull(item) && item.getCode().intValue() == 1000).findFirst();
//        if(userOptional.isPresent()) {
//            user = userOptional.get();
//        }
//
//        System.out.println(user);


        long seconds = TimeUnit.DAYS.toSeconds(1);

        long day_sec = 60 * 60 * 24;
        System.out.println(seconds);
        System.out.println(day_sec);
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

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class KlassUser {
        private List<User> userList = Lists.newArrayList();
        private List<String> strList = Lists.newArrayList();
    }

    public enum ClassState {
        UNPARSABLE_BY_GC(1,"UNPARSABLE_BY_GC"),
        ALLOCATED(2,"ALLOCATED"),
        LOADED(3,"LOADED"),
        LINKED(4,"LINKED"),
        BEING_INITIALIZED(5,"BEINGINITIALIZED"),
        FULLY_INITIALIZED(6,"FULLYINITIALIZED"),
        INITIALIZATION_ERROR(7,"INITIALIZATIONERROR"),
        OTHER(8,"OTHER"),
        ;

        private int code;
        private String desc;

        ClassState(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
