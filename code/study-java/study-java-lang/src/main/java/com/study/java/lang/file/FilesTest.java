package com.study.java.lang.file;

import java.io.File;

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
}
