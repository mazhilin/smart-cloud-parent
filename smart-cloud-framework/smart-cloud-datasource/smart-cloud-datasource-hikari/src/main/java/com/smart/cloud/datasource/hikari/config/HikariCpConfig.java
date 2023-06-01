package com.smart.cloud.datasource.hikari.config;

import lombok.Data;

import java.util.*;

/**
 * @className: com.smart.cloud.datasource.hikari.config.DruidConfig
 * @title: 封装SmartCloud项目-DruidConfig类
 * @description: <p>
 *         SmartCloud项目-DruidConfig
 *         </p>
 * @content: DruidConfig
 * @author: Powered by marklin
 * @datetime: 2023-06-02 01:12
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class HikariCpConfig {
    private String catalog;
    private Long connectionTimeout;
    private Long validationTimeout;
    private Long idleTimeout;
    private Long leakDetectionThreshold;
    private Long maxLifetime;
    private Integer maxPoolSize;
    private Integer maximumPoolSize;
    private Integer minIdle;
    private Integer minimumIdle;

    private Long initializationFailTimeout;
    private String connectionInitSql;
    private String connectionTestQuery;
    private String dataSourceClassName;
    private String dataSourceJndiName;
    private String transactionIsolationName;
    private Boolean isAutoCommit;
    private Boolean isReadOnly;
    private Boolean isIsolateInternalQueries;
    private Boolean isRegisterMbeans;
    private Boolean isAllowPoolSuspension;
    private Properties dataSourceProperties;
    private Properties healthCheckProperties;

    /**
     * 高版本才有
     */
    private String schema;
    private String exceptionOverrideClassName;
    private Long keepaliveTime;
    private Boolean sealed;

    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maxPoolSize = maximumPoolSize;
    }

    public void setMinimumIdle(Integer minimumIdle) {
        this.minIdle = minimumIdle;
    }
}