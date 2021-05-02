package com.deepblue.hotspot_inaction.chapter_99_test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.*;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class TestObject {

    @Data
    @Builder
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CityConfig {
        /**
         * 城市编号
         */
        private Integer adcode;

        /**
         * 城市名称
         */
        private String city;
    }

    @Data
    @Builder
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostDTO {
        private String name;
        private List<Long> topicIdsIds;
    }


    public static void main(String[] args) {
//        double a = 10d;
//        double b = 11d;
//        System.out.println(new Double(a).compareTo(b));

//        String jsonParam = "[200000, 200001]";
//        List<Long> topicIdList = JSON.parseArray(jsonParam, Long.class);
//        Long[] topicIds = topicIdList.toArray(new Long[topicIdList.size()]);
//        Arrays.stream(topicIds).forEach(System.out::println);


        Map<Long, List<PostDTO>> tempMap = Maps.newHashMap();
        List<PostDTO> dataList = buildList();
        dataList.stream().forEach(postData -> {
            if(CollectionUtils.isNotEmpty(postData.getTopicIdsIds())) {
                postData.getTopicIdsIds().stream().forEach(topicId -> {
                    System.out.println("topicId :" + topicId + ", tempMap valueList is :" + tempMap.get(topicId));
                    if(CollectionUtils.isEmpty(tempMap.get(topicId))) {
                        List<PostDTO> tempList = Lists.newArrayList();
                        tempList.add(postData);
                        tempMap.put(topicId, tempList);
                    } else {
                        tempMap.get(topicId).add(postData);
                    }
                });
            }
        });

        System.out.println("--------------------------------------------------------------------------------------------");

        Map<Long, Long> resultMap = new HashMap<>();
        tempMap.keySet().stream().forEach(item -> {
            resultMap.put(item, Long.valueOf(tempMap.get(item).size()));
        });

        System.out.println(JSON.toJSONString("tempMap    :" + tempMap));
        System.out.println(JSON.toJSONString("resultMap  :" + resultMap));
    }

    private static List<PostDTO> buildList() {
        List<PostDTO> resultList = Lists.newArrayList();

        List<Long> firstIds = Lists.newArrayList();
        firstIds.add(10000L);
        firstIds.add(20000L);
        List<Long> secondIds = Lists.newArrayList();
        secondIds.add(10000L);
        secondIds.add(30000L);
        List<Long> thirdIds = Lists.newArrayList();
        thirdIds.add(10000L);
        thirdIds.add(40000L);

        PostDTO post1 = new PostDTO();
        post1.setName("AAAA");
        post1.setTopicIdsIds(firstIds);

        PostDTO post2 = new PostDTO();
        post2.setName("BBBB");
        post2.setTopicIdsIds(secondIds);

        PostDTO post3 = new PostDTO();
        post3.setName("CCCC");
        post3.setTopicIdsIds(thirdIds);

        PostDTO post4 = new PostDTO();
        post4.setName("DDDD");
        post4.setTopicIdsIds(thirdIds);

        resultList.add(post1);
        resultList.add(post2);
        resultList.add(post3);
        resultList.add(post4);

        return resultList;
    }

}
