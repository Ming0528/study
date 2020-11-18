package com.study.java.lang.variableparam;

import org.junit.Test;

public class VariableParamDemo {

    private void testVariabParam(String... params) {

        for (int i = 0; i < params.length; i++) {
            System.out.println("params is:" + params[i]);
        }

        System.out.println("************************************");

        System.out.println("params is:" + params);
    }

    @Test
    public void test() {
        testVariabParam("1", "2", "3");
    }
}
