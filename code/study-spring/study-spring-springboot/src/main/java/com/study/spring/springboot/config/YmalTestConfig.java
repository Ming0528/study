package com.study.spring.springboot.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("payment.config.reconcile.file-rule")
@Data
@SuppressWarnings("PMD.UnusedPrivateField")
public class YmalTestConfig {

    private List<FileRuleItem> payUser;

    private List<FileRuleItem> payChannel;
}
