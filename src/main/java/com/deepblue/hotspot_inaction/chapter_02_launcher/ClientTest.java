package com.deepblue.hotspot_inaction.chapter_02_launcher;

import com.google.common.collect.Sets;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Set;

public class ClientTest {

    public static void main(String[] args) {
        ParentInterface pi = new ChildClass();
        pi.access();

        Set<Integer> proxyCodes = Sets.newHashSet();
        System.out.println("proxyCodes.size() :" + proxyCodes.size());

        int count = CollectionUtils.isEmpty(proxyCodes) ? 0 : 1000;
        System.out.println("count             :" + count);
    }
}
