package com.study.spring.springboot.scope;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class ClassBean {

    @Resource
    private StudentBean studentBean;

    @Resource
    private TeacherBean teacherBean;

    private String value;
}
