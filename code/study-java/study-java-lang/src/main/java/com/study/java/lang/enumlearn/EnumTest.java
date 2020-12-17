package com.study.java.lang.enumlearn;

import org.junit.Test;

public class EnumTest {
    @Test
    public void testEnum() {
        for(EventRecurringFileEnum item : EventRecurringFileEnum.values()) {
            System.out.println("name:" +  item.name() + "    index:" + item.getIndex() + "    ordinal:" + item.ordinal());
        }
    }
}
