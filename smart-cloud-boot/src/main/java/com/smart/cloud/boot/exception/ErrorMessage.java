package com.smart.cloud.boot.exception;

import lombok.Data;

/**
 * @className: com.smart.cloud.boot.exception.ErrorMessage
 * @title: 封装SmartCloud项目-ErrorMessage类
 * @description: <p>
 *         SmartCloud项目-ErrorMessage
 *         </p>
 * @content: ErrorMessage
 * @author: Powered by marklin
 * @datetime: 2023-04-30 21:53
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class ErrorMessage {
    /**
     * 错误码-code
     */
    private final Integer code;
    /**
     * 错误提示-desc
     */
    private final String desc;

    public ErrorMessage(Integer code, String message) {
        this.code = code;
        this.desc = message;
    }
}
