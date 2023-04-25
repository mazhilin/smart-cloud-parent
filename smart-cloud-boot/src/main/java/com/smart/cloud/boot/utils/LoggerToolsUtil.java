package com.smart.cloud.boot.utils;

import lombok.experimental.UtilityClass;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @className: com.smart.cloud.boot.utils.LoggerToolsUtil
 * @title: 封装SmartCloud项目-LoggerToolsUtil类
 * @description: <p>
 *         SmartCloud项目-LoggerToolsUtil
 *         </p>
 * @content: 统一控制台日志打印工具类
 * @author: Powered by marklin
 * @datetime: 2023-04-26 04:08
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@UtilityClass
public class LoggerToolsUtil {
    /**
     * debug log.
     * @param logger   logger
     * @param format   format
     * @param supplier {@linkplain Supplier}
     */
    public static void debug(final Logger logger, final String format, final Supplier<Object> supplier) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, supplier.get());
        }
    }

    /**
     * debug log.
     * @param logger   logger
     * @param format   format
     * @param objects objects
     */
    public static void debug(final Logger logger, final String format, final Object... objects) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, objects);
        }
    }

    /**
     * debug log.
     * @param logger   logger
     * @param supplier  {@linkplain Supplier}
     */
    public static void debug(final Logger logger, final Supplier<Object> supplier) {
        if (logger.isDebugEnabled()) {
            logger.debug(Objects.toString(supplier.get()));
        }
    }

    /**
     * info log.
     *
     * @param logger   logger
     * @param format   format
     * @param supplier {@linkplain Supplier}
     */
    public static void info(final Logger logger, final String format, final Supplier<Object> supplier) {
        if (logger.isInfoEnabled()) {
            logger.info(format, supplier.get());
        }
    }

    /**
     * info log.
     *
     * @param logger   logger
     * @param format   format
     * @param objects objects
     */
    public static void info(final Logger logger, final String format, final Object... objects) {
        if (logger.isInfoEnabled()) {
            logger.info(format, objects);
        }
    }

    /**
     * info log.
     *
     * @param logger   logger
     * @param supplier {@linkplain Supplier}
     */
    public static void info(final Logger logger, final Supplier<Object> supplier) {
        if (logger.isInfoEnabled()) {
            logger.info(Objects.toString(supplier.get()));
        }
    }

    /**
     * error log.
     *
     * @param logger   logger
     * @param format   format
     * @param supplier {@linkplain Supplier}
     */
    public static void error(final Logger logger, final String format, final Supplier<Object> supplier) {
        if (logger.isErrorEnabled()) {
            logger.error(format, supplier.get());
        }
    }

    /**
     * error log.
     *
     * @param logger   logger
     * @param format   format
     * @param objects objects
     */
    public static void error(final Logger logger, final String format, final Object... objects) {
        if (logger.isErrorEnabled()) {
            logger.error(format, objects);
        }
    }

    /**
     * error log.
     *
     * @param logger   logger
     * @param supplier {@linkplain Supplier}
     */
    public static void error(final Logger logger, final Supplier<Object> supplier) {
        if (logger.isErrorEnabled()) {
            logger.error(Objects.toString(supplier.get()));
        }
    }

    /**
     * warn log.
     *
     * @param logger   logger
     * @param format   format
     * @param supplier {@linkplain Supplier}
     */
    public static void warn(final Logger logger, final String format, final Supplier<Object> supplier) {
        if (logger.isWarnEnabled()) {
            logger.warn(format, supplier.get());
        }
    }

    /**
     * warn log.
     *
     * @param logger   logger
     * @param format   format
     * @param objects objects
     */
    public static void warn(final Logger logger, final String format, final Object... objects) {
        if (logger.isWarnEnabled()) {
            logger.warn(format, objects);
        }
    }

    /**
     * warn log.
     *
     * @param logger   logger
     * @param supplier {@linkplain Supplier}
     */
    public static void warn(final Logger logger, final Supplier<Object> supplier) {
        if (logger.isWarnEnabled()) {
            logger.warn(Objects.toString(supplier.get()));
        }
    }
}
