package com.smart.cloud.coverage.logger.configuration;

import com.smart.cloud.coverage.logger.aspect.ApplicationLoggerAspect;
import com.smart.cloud.coverage.logger.listener.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @className: com.smart.cloud.coverage.logger.configuration.EnableLoggerAutoConfiguration
 * @projectName: 封装SmartCloud项目-EnableLoggerAutoConfiguration类
 * @module: SmartCloud项目-EnableLoggerAutoConfiguration类，主要位于EnableLoggerAutoConfiguration模块的业务场景
 * @content: EnableLoggerAutoConfiguration类，主要用于完成EnableLoggerAutoConfiguration的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAsync
@Configuration
@ComponentScan(basePackages = "com.smart.cloud.coverage.logger.*")
@ConditionalOnWebApplication
public class EnableLoggerAutoConfiguration {

    @Bean(name = "behaviorLoggerListener")
    public ApplicationLoggerListener behaviorLoggerListener(){
        return new BehaviorLoggerListener();
    }

    @Bean(name = "businessLoggerListener")
    public ApplicationLoggerListener businessLoggerListener(){
        return new BusinessLoggerListener();
    }

    @Bean(name = "exceptionLoggerListener")
    public ApplicationLoggerListener exceptionLoggerListener(){
        return new ExceptionLoggerListener();
    }

    @Bean(name = "interfaceLoggerListener")
    public ApplicationLoggerListener interfaceLoggerListener(){
        return new InterfaceLoggerListener();
    }

    @Bean(name = "operationLoggerListener")
    public ApplicationLoggerListener operationLoggerListener(){
        return new OperationLoggerListener();
    }

    @Bean
    public ApplicationLoggerAspect applicationLoggerAspect(){
        return new ApplicationLoggerAspect();
    }
}
