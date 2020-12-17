package com.study.spring.springboot.scope;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
@Data
public class ClassBeanPrototype {
    @Resource
    private StudentBean studentBean;

    @Resource
    private TeacherBean teacherBean;

    private String value;
}
