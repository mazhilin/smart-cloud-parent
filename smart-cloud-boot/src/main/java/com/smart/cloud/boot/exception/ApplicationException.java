package com.smart.cloud.boot.exception;

import com.smart.cloud.boot.Serializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @className: com.smart.cloud.boot.exception.ApplicationException
 * @title: 封装SmartCloud项目-ApplicationException类
 * @description: <p>
 *         SmartCloud项目-ApplicationException
 *         </p>
 * @content: ApplicationException
 * @author: Powered by marklin
 * @datetime: 2023-05-01 00:17
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class ApplicationException extends RuntimeException implements Serializer {
    /**
     * Instantiates a new Shenyu exception.
     *
     * @param e the e
     */
    public ApplicationException(final Throwable e) {
        super(e);
    }

    /**
     * Instantiates a new Shenyu exception.
     *
     * @param message the message
     */
    public ApplicationException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new Shenyu exception.
     *
     * @param message   the message
     * @param throwable the throwable
     */
    public ApplicationException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
}
