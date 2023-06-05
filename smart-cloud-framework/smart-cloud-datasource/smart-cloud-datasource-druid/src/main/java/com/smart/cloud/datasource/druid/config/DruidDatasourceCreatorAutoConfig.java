package com.smart.cloud.datasource.druid.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.smart.cloud.datasource.boot.creator.BasicDatasourceCreator;
import com.smart.cloud.datasource.boot.creator.DatasourceCreator;
import com.smart.cloud.datasource.boot.creator.DefaultDatasourceCreator;
import com.smart.cloud.datasource.boot.creator.JndiDatasourceCreator;
import com.smart.cloud.datasource.druid.creator.DruidDatasourceCreator;
import com.smart.cloud.datasource.druid.properties.DynamicDruidDatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @className: com.smart.cloud.datasource.druid.config.DynamicDruidDatasourceCreatorAutoConfig
 * @title: 封装SmartCloud项目-DynamicDruidDatasourceCreatorAutoConfig类
 * @description: <p>
 *         SmartCloud项目-DynamicDruidDatasourceCreatorAutoConfig
 *         </p>
 * @content: DynamicDruidDatasourceCreatorAutoConfig
 * @author: Powered by marklin
 * @datetime: 2023-06-05 21:37
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(DynamicDruidDatasourceProperties.class)
public class DruidDatasourceCreatorAutoConfig {

    public static final int JNDI_ORDER = 1000;

    public static final int DRUID_ORDER = 2000;

    public static final int DEFAULT_ORDER = 7000;

    private final DynamicDruidDatasourceProperties properties;


    @Bean
    @ConditionalOnMissingBean
    public DefaultDatasourceCreator datasourceCreator(List<DatasourceCreator> creators) {
        DefaultDatasourceCreator creator = new DefaultDatasourceCreator();
        creator.setCreators(creators);
        return creator;
    }

    @Bean
    @Order(DEFAULT_ORDER)
    public BasicDatasourceCreator basicDatasourceCreator() {
        return new BasicDatasourceCreator();
    }

    @Bean
    @Order(JNDI_ORDER)
    public JndiDatasourceCreator jndiDataSourceCreator() {
        return new JndiDatasourceCreator();
    }

    @Bean
    @Order(DRUID_ORDER)
    @ConditionalOnClass(DruidDataSource.class)
    public DruidDatasourceCreator druidDataSourceCreator() {
        return new DruidDatasourceCreator(properties.getDruid());
    }

}
