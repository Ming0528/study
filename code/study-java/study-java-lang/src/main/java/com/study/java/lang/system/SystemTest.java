package com.study.java.lang.system;

import java.util.Map;

import org.junit.Test;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/11/17 9:15 <br>
 * @package com.study.java.lang.system <br>
 */
public class SystemTest {

    @Test
    public void testSystemApi() {
        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome is:" + javaHome);
        System.out.println();
        Map<String,String> allEnvMap = System.getenv();
        System.out.println("allEnvMap is:" + allEnvMap);
    }
}
