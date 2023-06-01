package com.smart.cloud.datasource.hikari.configuration;

import com.smart.cloud.datasource.hikari.properties.DynamicHikariDatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @className: com.smart.cloud.datasource.hikari.configuration.EnableDynamicHikariDatasourceAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDynamicHikariDatasourceAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDynamicHikariDataSourceAutoConfiguration
 *         </p>
 * @content: EnableDynamicHikariDataSourceAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-06-02 00:25
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@EnableAutoConfiguration
@RequiredArgsConstructor
@EnableConfigurationProperties(DynamicHikariDatasourceProperties.class)
public class EnableDynamicHikariDatasourceAutoConfiguration {

    protected DynamicHikariDatasourceProperties properties;
}
