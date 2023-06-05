package com.smart.cloud.datasource.hikari.config;

import com.smart.cloud.datasource.hikari.properties.DynamicHikariDatasourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.datasource.hikari.config.HikariDatasourceAssistAutoConfig
 * @title: 封装SmartCloud项目-HikariDatasourceAssistAutoConfig类
 * @description: <p>
 *         SmartCloud项目-HikariDatasourceAssistAutoConfig
 *         </p>
 * @content: HikariDatasourceAssistAutoConfig
 * @author: Powered by marklin
 * @datetime: 2023-06-05 23:50
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@EnableConfigurationProperties(DynamicHikariDatasourceProperties.class)
public class HikariDatasourceAssistAutoConfig {
}
