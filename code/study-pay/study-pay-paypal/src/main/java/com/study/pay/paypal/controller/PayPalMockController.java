package com.study.pay.paypal.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock")
public class PayPalMockController {
    @RequestMapping("/test")
    public void test(@RequestBody Map<String, String> param) {
        System.out.println("hh");
    }
}
