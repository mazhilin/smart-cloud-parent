package com.smart.cloud.datasource.hikari.config;

import com.smart.cloud.datasource.boot.creator.DefaultDatasourceCreator;
import com.smart.cloud.datasource.boot.event.DatasourceInitializrEvent;
import com.smart.cloud.datasource.boot.event.EncDatasourceInitializrEvent;
import com.smart.cloud.datasource.boot.provider.DynamicDatasourceBootProvider;
import com.smart.cloud.datasource.boot.provider.DynamicDatasourceProvider;
import com.smart.cloud.datasource.hikari.properties.DynamicHikariDatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

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
@RequiredArgsConstructor
@EnableConfigurationProperties(DynamicHikariDatasourceProperties.class)
public class HikariDatasourceAssistAutoConfig {

    private final  DynamicHikariDatasourceProperties properties;

    @Bean
    @Order(0)
    public DynamicDatasourceProvider datasourceProvider() {
        DefaultDatasourceCreator creator = new DefaultDatasourceCreator();
        return new DynamicDatasourceBootProvider(creator,properties.getDatasource());
    }

    @Bean
    @ConditionalOnMissingBean
    public DatasourceInitializrEvent dataSourceInitEvent() {
        return new EncDatasourceInitializrEvent();
    }
}
