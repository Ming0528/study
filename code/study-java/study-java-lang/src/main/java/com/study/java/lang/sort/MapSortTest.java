package com.study.java.lang.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/11/17 9:16 <br>
 * @package com.study.java.lang.sort <br>
 */
public class MapSortTest {
    @Test
    public void testSort() {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "333");
        map.put(10L, "333333");
        map.put(22L, "336663");
        map.put(13L, "333");

//        map.entrySet().stream()
//            .sorted((x1, x2) -> (x2.getKey().intValue() - x1.getKey().intValue()))
//            .forEach(entry -> {
//                System.out.println("key:" + entry.getKey());
//                System.out.println("value:" + entry.getValue());
//            });

//        List<String> list = new ArrayList<>();
//        map.entrySet().stream()
//            .sorted(Comparator.comparingLong(Entry::getKey))
//            .map(Entry::getValue)
//            .forEach(list::add);


        List<String> list = new ArrayList<>();
        map.entrySet().stream()
            .sorted(Entry.<Long, String>comparingByKey().reversed())
            .map(Entry::getValue)
            .forEach(list::add);

        System.out.println("list" +  list.toString());

    }
}
