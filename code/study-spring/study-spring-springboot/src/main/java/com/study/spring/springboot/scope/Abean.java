package com.study.spring.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service("AbeanName")
//@Scope("prototype")
@Data
public class Abean extends AbstractATest{
    private Long id;
}
