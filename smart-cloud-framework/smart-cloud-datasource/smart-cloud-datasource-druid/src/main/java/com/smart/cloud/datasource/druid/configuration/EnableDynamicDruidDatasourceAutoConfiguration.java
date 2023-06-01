package com.smart.cloud.datasource.druid.configuration;

import com.smart.cloud.datasource.druid.properties.DynamicDruidDatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @className: com.smart.cloud.datasource.druid.configuration.EnableDynamicDruidDataSourceAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDynamicDruidDataSourceAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDynamicDruidDataSourceAutoConfiguration
 *         </p>
 * @content: EnableDynamicDruidDataSourceAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-06-02 00:29
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
@RequiredArgsConstructor
@EnableConfigurationProperties(DynamicDruidDatasourceProperties.class)
public class EnableDynamicDruidDatasourceAutoConfiguration {

    protected DynamicDruidDatasourceProperties properties;
}
