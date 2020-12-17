package com.study.spring.springboot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.springboot.config.YmalTestConfig;

@RestController
@RequestMapping("ymal")
public class YmalTestController {

    @Resource
    private YmalTestConfig ymalTestConfig;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public void test() {
        ymalTestConfig.getPayChannel();
        ymalTestConfig.getPayUser();
    }
}
