package com.study.java.lang.file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class FilesTest {
    @Test
    public void testCreateDir() {
        String dir = "D:\\iwhaleCloud\\module\\R9\\CCIP\\entel\\code\\zsmart_home\\cdr\\cdrFile\\20190900\\1302\\eventRecurring";
        File file = new File(dir);
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            if (!mkdirs) {
                System.out.println("error");
            }
        }
        System.out.println("hh");
    }

    @Test
    public void testTimeSpend() throws IOException {
        String file = "D:\\test\\eventRecurring.txt";
        Path path = Paths.get(file);
        long begin = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(100000);
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("13510826813368200,59171673864,736023012762989,850652505,4944,3088,5049,2019-09-01 04:30:21,902,,,,334=200.87.248.10|232=3088|233=5049|235=8137|23=1567327523|356=414|1551=14|1555=14,1301,A,2019-09-01 04:47:22,-1,5044,2,pgw-scz5.entel.huawei.com;3776243097;1332;18360;414;414,1,Y,,\"380248,8137,-1:\",-1,-1,211332522,-1,-1,-1,-1,-1,-1,-1,-1,22975000364,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,0,0,-2096109030,0,0,0,0,0,0,0,0,0,0,8137,0,0,0,0,0,0,0,-2096100893,0,0,0,0,0,,736024372049118,4g.entel,,3100,,,,,1003,0,,,,,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,,0,1,-1,0,,olclpz.entel.bo,,0,0,0,0,8137,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,,0,0,0,0,8137,0,0,0,0,414,,-1,-1,,-1,-1,-1,-1,-1,-1,-1,-1,-1,736,02,,0,,,,,,,,,\n");
        }
        Files.write(path, stringBuilder.toString().getBytes(Charset.defaultCharset()), StandardOpenOption.APPEND);

        long timeValue = System.currentTimeMillis() - begin;
        System.out.println("耗时：" + timeValue + "毫秒");
    }

    /**
     * 1000行一次写入  初始化容量为10000 19毫秒
     * 1000行一次写入  初始化容量为0 14毫秒
     *
     * 1000行 一千次写入  初始化容量为0 206毫秒
     *
     * 10000行一次写入  初始化容量为 0 99毫秒
     * 10000行一次写入  初始化容量为 100000 94毫秒
     *
     *
     * 10000行 一万次写入  初始化容量为0 1657毫秒
     */
}
