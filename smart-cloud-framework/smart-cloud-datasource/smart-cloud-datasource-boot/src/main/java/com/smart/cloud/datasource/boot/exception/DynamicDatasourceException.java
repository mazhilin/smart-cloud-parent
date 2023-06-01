package com.smart.cloud.datasource.boot.exception;

/**
 * @className: com.smart.cloud.datasource.boot.exception.DynamicDatasourceException
 * @title: 封装SmartCloud项目-DynamicDatasourceException类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceException
 *         </p>
 * @content: DynamicDatasourceException
 * @author: Powered by marklin
 * @datetime: 2023-06-02 04:21
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DynamicDatasourceException extends RuntimeException {
    public DynamicDatasourceException(String message) {
        super(message);
    }

    public DynamicDatasourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
