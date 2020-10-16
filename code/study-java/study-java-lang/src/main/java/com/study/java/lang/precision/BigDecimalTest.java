package com.study.java.lang.precision;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTest {
    @Test
    public void testBigDecimal() {
        String aaa = "20.5";
        BigDecimal bigDecimal = new BigDecimal(aaa);

        String bd = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).toString();

        System.out.println("The bigDecimal values is:" + bd);

    }
}
