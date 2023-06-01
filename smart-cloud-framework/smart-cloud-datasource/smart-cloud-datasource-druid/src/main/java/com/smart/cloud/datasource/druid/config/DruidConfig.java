package com.smart.cloud.datasource.druid.config;

import lombok.Data;

import java.io.Serializable;
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
public class DruidConfig implements Serializable {
    private static final long serialVersionUID = 8300191693051943910L;

    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private Integer maxWait;
    private Long timeBetweenEvictionRunsMillis;
    private Long timeBetweenLogStatsMillis;
    private Long keepAliveBetweenTimeMillis;
    private Integer statSqlMaxSize;
    private Long minEvictableIdleTimeMillis;
    private Long maxEvictableIdleTimeMillis;
    private String defaultCatalog;
    private Boolean defaultAutoCommit;
    private Boolean defaultReadOnly;
    private Integer defaultTransactionIsolation;
    private Boolean testWhileIdle;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;
    private String validationQuery;
    private Integer validationQueryTimeout;
    private Boolean useGlobalDataSourceStat;
    private Boolean asyncInit;
    private String filters;
    private Boolean clearFiltersEnable;
    private Boolean resetStatEnable;
    private Integer notFullTimeoutRetryCount;
    private Integer maxWaitThreadCount;
    private Boolean failFast;
    private Long phyTimeoutMillis;
    private Long phyMaxUseCount;

    private Boolean keepAlive;
    private Boolean poolPreparedStatements;
    private Boolean initVariants;
    private Boolean initGlobalVariants;
    private Boolean useUnfairLock;
    private Boolean killWhenSocketReadTimeout;
    private Properties connectionProperties;
    private Integer maxPoolPreparedStatementPerConnectionSize;
    private String initConnectionSqls;
    private Boolean sharePreparedStatements;
    private Integer connectionErrorRetryAttempts;
    private Boolean breakAfterAcquireFailure;
    private Boolean removeAbandoned;
    private Integer removeAbandonedTimeoutMillis;
    private Boolean logAbandoned;
    private Integer queryTimeout;
    private Integer transactionQueryTimeout;
    private String publicKey;
    private Integer connectTimeout;
    private Integer socketTimeout;
    private Long timeBetweenConnectErrorMillis;

    private Map<String, Object> wall = new HashMap<>();
    private Map<String, Object> slf4j = new HashMap<>();
    private Map<String, Object> log4j = new HashMap<>();
    private Map<String, Object> log4j2 = new HashMap<>();
    private Map<String, Object> commonsLog = new HashMap<>();
    private Map<String, Object> stat = new HashMap<>();

    private List<String> proxyFilters = new ArrayList<>();
}
