package com.smart.cloud.datasource.boot.config;

import lombok.Data;

import java.util.Properties;

/**
 * @className: com.smart.cloud.datasource.boot.config.BeecpConfig
 * @title: 封装SmartCloud项目-BeecpConfig类
 * @description: <p>
 *         SmartCloud项目-BeecpConfig
 *         </p>
 * @content: BeecpConfig
 * @author: Powered by marklin
 * @datetime: 2023-06-02 03:31
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class BeecpConfig {
    private String defaultCatalog;
    private String defaultSchema;
    private Boolean defaultReadOnly;
    private Boolean defaultAutoCommit;
    private Integer defaultTransactionIsolationCode;
    private String defaultTransactionIsolationName;

    private Boolean fairMode;
    private Integer initialSize;
    private Integer maxActive;
    private Integer borrowSemaphoreSize;
    private Long maxWait;
    private Long idleTimeout;
    private Long holdTimeout;
    private String connectionTestSql;
    private Integer connectionTestTimeout;
    private Long connectionTestIntegererval;
    private Long idleCheckTimeIntegererval;
    private Boolean forceCloseUsingOnClear;
    private Long delayTimeForNextClear;

    private String connectionFactoryClassName;
    private String xaConnectionFactoryClassName;
    private Properties connectProperties;
    private String poolImplementClassName;
    private Boolean enableJmx;
}
