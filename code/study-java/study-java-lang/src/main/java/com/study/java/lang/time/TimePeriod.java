package com.study.java.lang.time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class TimePeriod {
    @Test
    public void test() {
        Date endDate = new Date();
        Date startDate = DateUtils.addDays(endDate, -32);

        AtomicLong count = new AtomicLong();
        Long aa = count.incrementAndGet();
        Long bb = count.addAndGet(1000L);

        List<Date> dateList = Stream.iterate(startDate, date -> DateUtils.addDays(date, 1)).limit(5).collect(Collectors.toList());
        System.out.println("startDate is" + startDate);
        System.out.println("endDate is" + endDate);
//            .sorted(Comparator.comparing(EventUsageCQueryReader::getStartTime).reversed())

        List<String> sortDate = new ArrayList<>();
        sortDate.add("2020-01-02");
        sortDate.add("2020-01-03");
        sortDate.add("2029-01-03");
        sortDate.add("2019-01-03");
        sortDate.add("2019-02-03");
        List<String> sortDated = sortDate.stream().sorted().collect(Collectors.toList());
        System.out.println("sortDate is" + sortDate);
        System.out.println("sortDated is" + sortDated);


        String aaa = "EVENT_RECURRING_1301";
        String bbb[] = aaa.split("EVENT_RECURRING_");
        System.out.println("sortDated is" + sortDated);

    }

//    public long diffDays(Date from, Date to) {
//        return DateUtil.differDateInDays(from, new Date(to.getTime() - 1), DateConstants.MINUTE);
//    }
}
