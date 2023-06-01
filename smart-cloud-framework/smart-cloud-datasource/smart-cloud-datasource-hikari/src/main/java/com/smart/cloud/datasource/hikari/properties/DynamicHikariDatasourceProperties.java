package com.smart.cloud.datasource.hikari.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: com.smart.cloud.datasource.hikari.properties.SmartCloudHikariDatasourceProperties
 * @title: 封装SmartCloud项目-SmartCloudHikariDatasourceProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudHikariDatasourceProperties
 *         </p>
 * @content: SmartCloudHikariDatasourceProperties
 * @author: Powered by marklin
 * @datetime: 2023-06-02 00:22
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@ConfigurationProperties(prefix = DynamicHikariDatasourceProperties.PREFIX)
public class DynamicHikariDatasourceProperties {
    public static final String PREFIX = "smart.cloud.dynamic.datasource";
}
