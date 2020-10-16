package com.study.java.lang.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;


public class StringParserTest {
    private static final String DATE_FORMAT_1 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String DATE_FORMAT_2 = "yyyy-MM-dd HH:mm:ss";

    public static final String SPLIT_COMMA = ",";

    private static final String ZERO_VALUE = "0";

    private static final String ONE_VALUE = "1";

    private static final String EMPTY_STRING_VALUE = "";

    private static final Set<String> ZERO_AND_ONE_SET = new HashSet<>(Arrays.asList(ZERO_VALUE, ONE_VALUE));


    private static final Set<String> ZERO_SET = new HashSet<>(Collections.singletonList(ZERO_VALUE));

    private static final Set<String> ONE_SET = new HashSet<>(Collections.singletonList(ONE_VALUE));
    /**
     * "0", "1", "" 三种格式集合范围
     */
    private static final Set<String> CORRECT_FORMAT_SET_RANGES = new HashSet<>(Arrays.asList(ZERO_VALUE, ONE_VALUE, EMPTY_STRING_VALUE));
    /**
     *  "" 格式集合
     */
    private static final Set<String> EMPTY_STRING__SET = new HashSet<>(Collections.singletonList(EMPTY_STRING_VALUE));
    @Test
    public void testParseString() {
        String str = ",,,";
        String[] rCodeArray = str.split(SPLIT_COMMA, -1);


        Set<String> rCodeSet = Arrays.stream(rCodeArray)
//                .filter(rcode -> {
//                    return !"".equals(rcode);
//                })
                .collect(Collectors.toSet());

        if (!CORRECT_FORMAT_SET_RANGES.containsAll(rCodeSet)) {
            System.out.println("rCodeSet is :" + rCodeSet);
        }

        if (EMPTY_STRING__SET.containsAll(rCodeSet)) {
            System.out.println("rCodeSet is :" + rCodeSet);
        }
        System.out.println("rCodeSet is :" + rCodeSet);

        String transDate = "2020-09-10T07:10:17Z";
        Date start = formatDate(transDate, DATE_FORMAT_2);
        System.out.println("Start" + start);

        Date end = formatDate("2020-04-15 17:00:00", DATE_FORMAT_2);
        System.out.println("end" + end);

    }

    /**
     * 字符串格式化成日期(带格式)
     *
     * @param date   日期
     * @param format 格式
     * @return 日期
     * @author henry
     */
    public static Date formatDate(String date, String format) {

        SimpleDateFormat simpleDateFormat = getDateFormat(format);
        try {
            return simpleDateFormat.parse(date);
        }
        catch (ParseException e) {
            throw new IllegalArgumentException("the date string " + date + " is not matching format", e);
        }
    }

    private static SimpleDateFormat getDateFormat(String format) {
        return new SimpleDateFormat(format);
    }
}
