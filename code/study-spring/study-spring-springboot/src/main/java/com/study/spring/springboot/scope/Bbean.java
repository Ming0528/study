package com.study.spring.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service("BbeanName")
@Scope("prototype")
@Data
public class Bbean extends AbstractBTest{
    private Long id;
}
