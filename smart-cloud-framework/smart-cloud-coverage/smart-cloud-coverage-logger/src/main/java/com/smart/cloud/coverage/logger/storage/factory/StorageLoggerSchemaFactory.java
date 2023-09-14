package com.smart.cloud.coverage.logger.storage.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.coverage.logger.storage.factory.StorageLoggerSchemaFactory
 * @projectName: 封装SmartCloud项目-StorageLoggerSchemaFactory类
 * @module: SmartCloud项目-StorageLoggerSchemaFactory类，主要位于StorageLoggerSchemaFactory模块的业务场景
 * @content: StorageLoggerSchemaFactory类，主要用于完成StorageLoggerSchemaFactory的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-15 02:09
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Slf4j
@Component
public class StorageLoggerSchemaFactory implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
