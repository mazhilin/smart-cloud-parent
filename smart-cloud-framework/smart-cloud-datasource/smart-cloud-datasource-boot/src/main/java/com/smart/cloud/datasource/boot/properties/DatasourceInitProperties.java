package com.smart.cloud.datasource.boot.properties;

import lombok.Data;

/**
 * @className: com.smart.cloud.datasource.boot.properties.DatasourceInitProperties
 * @title: 封装SmartCloud项目-DatasourceInitProperties类
 * @description: <p>
 *         SmartCloud项目-DatasourceInitProperties
 *         </p>
 * @content: DatasourceInitProperties
 * @author: Powered by marklin
 * @datetime: 2023-06-02 03:22
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class DatasourceInitProperties {

    /**
     * 自动运行的建表脚本
     */
    private String schema;
    /**
     * 自动运行的数据脚本
     */
    private String data;

    /**
     * 错误是否继续 默认 true
     */
    private boolean continueOnError = true;
    /**
     * 分隔符 默认 ;
     */
    private String separator = ";";
}
