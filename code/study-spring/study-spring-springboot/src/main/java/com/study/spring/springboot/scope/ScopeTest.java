package com.study.spring.springboot.scope;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study/springboot/scope")
public class ScopeTest {

    @Resource
    private ApplicationContext context;

    @RequestMapping("/test")
    public void test() {
//        Abean abean = context.getBean(Abean.class);
        Abean abean = (Abean)context.getBean("AbeanName");
        abean.setId(111L);
        abean.setName("abeanName");
        System.out.println("abean hashCode is:" +  abean.hashCode());

        Abean aabean = (Abean)context.getBean("AbeanName");
        aabean.setId(111222L);
        aabean.setName("aabeanName");
        System.out.println("aabean hashCode is:" +  aabean.hashCode());

//        Bbean bbean = context.getBean(Bbean.class);
        Bbean bbean = (Bbean)context.getBean("BbeanName");
        bbean.setId(222L);
        bbean.setName("bbeanName");
        System.out.println("bbean hashCode is:" +  bbean.hashCode());

        Bbean bbbean = (Bbean)context.getBean("BbeanName");
        bbbean.setId(2211112L);
        bbbean.setName("bbbeanName");
        System.out.println("bbbean hashCode is:" +  bbbean.hashCode());
        System.out.println("end");
    }
}
