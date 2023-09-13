package com.smart.cloud.coverage.logger.listener;

import com.smart.cloud.coverage.logger.event.ApplicationLoggerEvent;

/**
 * @className: com.smart.cloud.coverage.logger.listener.ApplicationLoggerListener
 * @projectName: 封装SmartCloud项目-ApplicationLoggerListener类
 * @module: SmartCloud项目-ApplicationLoggerListener类，主要位于ApplicationLoggerListener模块的业务场景
 * @content: ApplicationLoggerListener类，主要用于完成ApplicationLoggerListener的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:07
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface ApplicationLoggerListener {

    /**
     * 存储日志
     * @param event 日志时间对象
     */
    void storageLogger(ApplicationLoggerEvent event);
}

