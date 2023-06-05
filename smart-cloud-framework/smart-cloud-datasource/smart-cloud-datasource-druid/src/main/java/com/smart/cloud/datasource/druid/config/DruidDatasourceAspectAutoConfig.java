package com.smart.cloud.datasource.druid.config;

import com.smart.cloud.datasource.boot.annotation.DynamicDatasource;
import com.smart.cloud.datasource.boot.aspect.DynamicDatasourceAnnotationAdvisor;
import com.smart.cloud.datasource.boot.aspect.DynamicDatasourceAnnotationInterceptor;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceExpressionProcessor;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceHeaderProcessor;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceProcessor;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceSessionProcessor;
import com.smart.cloud.datasource.boot.properties.DatasourceAopProperties;
import com.smart.cloud.datasource.druid.properties.DynamicDruidDatasourceProperties;
import org.springframework.aop.Advisor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.context.expression.BeanFactoryResolver;

/**
 * @className: com.smart.cloud.datasource.druid.config.DruidDatasourceAspectAutoConfig
 * @title: 封装SmartCloud项目-DruidDatasourceAspectAutoConfig类
 * @description: <p>
 *         SmartCloud项目-DruidDatasourceAspectAutoConfig
 *         </p>
 * @content: DruidDatasourceAspectAutoConfig
 * @author: Powered by marklin
 * @datetime: 2023-06-05 22:59
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@EnableConfigurationProperties(DynamicDruidDatasourceProperties.class)
public class DruidDatasourceAspectAutoConfig {

    protected DynamicDruidDatasourceProperties properties;

    public DruidDatasourceAspectAutoConfig(DynamicDruidDatasourceProperties properties) {
        this.properties = properties;
    }


    @Bean
    @ConditionalOnMissingBean
    public DynamicDatasourceProcessor dsProcessor(BeanFactory beanFactory) {
        DynamicDatasourceProcessor header = new DynamicDatasourceHeaderProcessor();
        DynamicDatasourceProcessor session = new DynamicDatasourceSessionProcessor();
        DynamicDatasourceExpressionProcessor expression = new DynamicDatasourceExpressionProcessor();
        expression.setBeanResolver(new BeanFactoryResolver(beanFactory));
        header.setNextProcessor(session);
        session.setNextProcessor(expression);
        return session;
    }

    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    @Bean
    @ConditionalOnProperty(prefix = DynamicDruidDatasourceProperties.PREFIX + ".aop", name = "enabled", havingValue = "true", matchIfMissing = true)
    public Advisor dynamicDatasourceAnnotationAdvisor(DynamicDatasourceProcessor processor) {
        DatasourceAopProperties aop = properties.getAop();
        DynamicDatasourceAnnotationInterceptor interceptor = new DynamicDatasourceAnnotationInterceptor(aop.getAllowedPublicOnly(), processor);
        DynamicDatasourceAnnotationAdvisor advisor = new DynamicDatasourceAnnotationAdvisor(interceptor, DynamicDatasource.class);
        advisor.setOrder(aop.getOrder());
        return advisor;
    }

}
