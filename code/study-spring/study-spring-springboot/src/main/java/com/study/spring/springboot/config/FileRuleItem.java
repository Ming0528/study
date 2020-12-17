package com.study.spring.springboot.config;

import java.util.Map;

import lombok.Data;

@Data
@SuppressWarnings("PMD.UnusedPrivateField")
public class FileRuleItem {
    /**
     * 用于映射 使用方:payUserId 或 支付渠道:payChannelType
     */
    private String objectIds;

    /**
     * 映射 代码中 对账服务的bean
     */
    private String fileReconcile;

    /**
     * 映射 对账文件名称匹配关键的 字符串
     */
    private String fileNamePattern;

    /**
     * key:对账文件后缀  value: 解析处理的bean
     */
    private Map<String, String> fileSuffixRuleMap;
    /**
     * 实际解析对账记录的 开始 行数索引 (相比第一行的 偏移量)
     */
    private Long fileBodyStartRowOffset;
    /**
     * 实际解析对账记录的 结束 行数索引 (相比最后一行的 偏移量)
     */
    private Long fileBodyEndRowOffset;
}
