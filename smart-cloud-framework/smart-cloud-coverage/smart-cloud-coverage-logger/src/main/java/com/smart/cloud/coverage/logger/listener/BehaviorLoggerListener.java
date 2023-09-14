package com.smart.cloud.coverage.logger.listener;

import com.smart.cloud.coverage.logger.event.ApplicationLoggerEvent;
import com.smart.cloud.coverage.logger.event.BehaviorLogger;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * @className: com.smart.cloud.coverage.logger.listener.BehaviorLoggerListener
 * @projectName: 封装SmartCloud项目-BehaviorLoggerListener类
 * @module: SmartCloud项目-BehaviorLoggerListener类，主要位于BehaviorLoggerListener模块的业务场景
 * @content: BehaviorLoggerListener类，主要用于完成BehaviorLoggerListener的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:33
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class BehaviorLoggerListener implements ApplicationLoggerListener{
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
        BehaviorLogger behavior = event.getBehaviorLogger();
    }
}
