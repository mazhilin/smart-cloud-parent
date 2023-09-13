package com.smart.cloud.coverage.logger.listener;

import com.smart.cloud.coverage.logger.event.ApplicationLoggerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * @className: com.smart.cloud.coverage.logger.listener.ExceptionLoggerListener
 * @projectName: 封装SmartCloud项目-ExceptionLoggerListener类
 * @module: SmartCloud项目-ExceptionLoggerListener类，主要位于ExceptionLoggerListener模块的业务场景
 * @content: ExceptionLoggerListener类，主要用于完成ExceptionLoggerListener的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class ExceptionLoggerListener implements ApplicationLoggerListener {

    /**
     * 存储日志
     *
     * @param event
     *         日志时间对象
     */
    @Async
    @Order
    @EventListener(ApplicationLoggerEvent.class)
    @Override
    public void storageLogger(ApplicationLoggerEvent event) {

    }
}
