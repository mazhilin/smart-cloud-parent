package com.smart.cloud.datasource.druid.configuration;

import com.smart.cloud.datasource.boot.dynamic.DynamicRoutingSwitchDatasource;
import com.smart.cloud.datasource.druid.config.DruidDatasourceAspectAutoConfig;
import com.smart.cloud.datasource.druid.config.DruidDatasourceAssistAutoConfig;
import com.smart.cloud.datasource.druid.config.DruidDatasourceCreatorAutoConfig;
import com.smart.cloud.datasource.druid.properties.DynamicDruidDatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

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
@Configuration
@EnableConfigurationProperties(DynamicDruidDatasourceProperties.class)
@Import(value = {DruidDatasourceCreatorAutoConfig.class, DruidDatasourceAssistAutoConfig.class, DruidDatasourceAspectAutoConfig.class})
public class EnableDynamicDruidDatasourceAutoConfiguration implements InitializingBean {

    protected final DynamicDruidDatasourceProperties properties;

    public EnableDynamicDruidDatasourceAutoConfiguration(
            DynamicDruidDatasourceProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public DataSource dataSource() {
        DynamicRoutingSwitchDatasource datasource = new DynamicRoutingSwitchDatasource();
        datasource.setPrimary(properties.getPrimary());
        datasource.setStrict(properties.getStrict());
        datasource.setStrategy(properties.getStrategy());
        datasource.setP6spy(properties.getP6spy());
        datasource.setSeata(properties.getSeata());
        return datasource;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

}
