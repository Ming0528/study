package com.study.spring.springboot.controller;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.springboot.scope.ClassBean;
import com.study.spring.springboot.scope.ClassBeanPrototype;

@RestController
@RequestMapping("scope")
public class TestController {
    @Resource
    private ClassBean classBean;

    @Resource
    private ApplicationContext context;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public void test() {
        ClassBeanPrototype bean1 = (ClassBeanPrototype) context.getBean(ClassBeanPrototype.class);
        bean1.setValue("test1");
        System.out.println("bean1 value is:" + bean1.getValue());

        ClassBeanPrototype bean2 = (ClassBeanPrototype) context.getBean(ClassBeanPrototype.class);
        bean2.setValue("test2");
        System.out.println("bean2 value is:" + bean2.getValue());

    }

}
