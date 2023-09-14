package com.smart.cloud.coverage.boot.enums.logger;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @className: com.smart.cloud.coverage.boot.enums.logger.StorageSchemas
 * @projectName: 封装SmartCloud项目-StorageSchemas类
 * @module: SmartCloud项目-StorageSchemas类，主要位于StorageSchemas模块的业务场景
 * @content: StorageSchemas类，主要用于完成StorageSchemas的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-15 01:28
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Getter
@AllArgsConstructor
public enum StorageSchemas {

    /**
     * 0-本地服务
     */
    LS(0, "LS","server","本地日志存储"),
    /**
     * 1-Mysql存储
     */
    DS(1, "DS","mysql","Mysql存储"),
    /**
     * 2-Redis存储
     */
    RS(2, "RS","redis","Redis存储"),
    /**
     *3-Elasticsearch存储
     */
    ES(3, "ES","elasticsearch","Elasticsearch存储"),
    /**
     * 4-Clickhouse存储
     */
    CS(4, "CS","clickhouse","Clickhouse存储"),
    ;
    private final Integer id;
    private final String code;
    private final String  name;
    private final String desc;
}
