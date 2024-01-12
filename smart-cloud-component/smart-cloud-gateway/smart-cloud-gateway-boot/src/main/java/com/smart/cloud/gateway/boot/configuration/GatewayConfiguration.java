package com.smart.cloud.gateway.boot.configuration;

import com.smart.cloud.gateway.boot.Function;
import com.smart.cloud.gateway.boot.properties.GatewayConfigProperties;
import com.smart.cloud.gateway.boot.resolver.GatewayPropertiesResolver;
import com.smart.cloud.gateway.boot.resolver.PropertiesResolver;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.gateway.boot.configuration.GatewayConfiguration
 * @projectName: 封装smartcloud项目-GatewayConfiguration类
 * @module: smartcloud项目-GatewayConfiguration类，主要位于gateway模块的业务场景
 * @content: GatewayConfiguration类，主要用于完成网关配置类的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-01-12 02:42
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 smartcloud Systems Incorporated. All rights reserved.
 */
@Configuration
@EnableConfigurationProperties(GatewayConfigProperties.class)
@SuppressWarnings("all")
public class GatewayConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(GatewayConfiguration.class);


    @Bean
    public PropertiesResolver propertiesResolver(ApplicationContext applicationContext) {
        Object bean = fallback(() -> applicationContext.getBean("primaryRouteLocator"));

        if (bean != null) {

        } else if ((bean = fallback(() -> applicationContext.getBean("routeDefinitionLocator"))) != null) {
            return new GatewayPropertiesResolver(bean);
        }

        throw new IllegalStateException("Must rely on a kind of zuul or gateway.");
    }

    private Object fallback(Function function) {
        Object returnVal = null;
        try {
            returnVal = function.apply();
        } catch (Throwable exception) {
            //fallback
            logger.debug("contain getBean failed.");
        }
        return returnVal;
    }

}
