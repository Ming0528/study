package com.study.java.lang.collection;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HashMapTest {

    @Test
    public void testPutMethod() {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("aaa", "111");
        hashMap.put("aaa", "222");
        hashMap.put("bbb", "333");

        System.out.println("The hashMap values is:" + hashMap);
    }
}
