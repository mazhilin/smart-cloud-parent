package com.smart.cloud.datasource.boot.exception;

/**
 * @className: com.smart.cloud.datasource.boot.exception.DatasourceException
 * @title: 封装SmartCloud项目-DatasourceException类
 * @description: <p>
 *         SmartCloud项目-DatasourceException
 *         </p>
 * @content: DatasourceException
 * @author: Powered by marklin
 * @datetime: 2023-06-02 04:23
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DatasourceException extends RuntimeException {
    public DatasourceException(String message) {
        super(message);
    }

    public DatasourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
