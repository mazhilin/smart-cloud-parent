package com.smart.cloud.coverage.logger.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @className: com.smart.cloud.coverage.logger.initializer.ApplicationLoggerInitializer
 * @projectName: 封装SmartCloud项目-ApplicationLoggerInitializer类
 * @module: SmartCloud项目-ApplicationLoggerInitializer类，主要位于ApplicationLoggerInitializer模块的业务场景
 * @content: ApplicationLoggerInitializer类，主要用于完成ApplicationLoggerInitializer的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:10
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class ApplicationLoggerInitializer implements EnvironmentPostProcessor, Ordered {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        String appName = environment.getProperty("spring.application.name");
        String logBase = environment.getProperty("LOGGING_PATH", "logs");
        // spring boot admin 直接加载日志
        System.setProperty("logging.file.name", String.format("%s/%s/debug.log", logBase, appName));
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
