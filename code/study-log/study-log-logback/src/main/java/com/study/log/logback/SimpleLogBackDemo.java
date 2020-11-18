package com.study.log.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLogBackDemo {
    private static final Logger logger = LoggerFactory.getLogger(SimpleLogBackDemo.class);

    @Test
    public void testLog() {
        logger.info("hello");
    }
}
