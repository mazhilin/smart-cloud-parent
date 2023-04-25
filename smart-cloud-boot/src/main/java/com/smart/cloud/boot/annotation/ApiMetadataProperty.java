package com.smart.cloud.boot.annotation;

import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @className: com.smart.cloud.boot.annotation.ApiMetadataProperty
 * @title: 封装SmartCloud项目-ApiMetadataProperty类
 * @description: <p>
 *         SmartCloud项目-ApiMetadataProperty
 *         </p>
 * @content: 接口元属性注解类
 * @author: Powered by marklin
 * @datetime: 2023-04-26 04:21
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMetadataProperty {
    /**
     * 字段属性中文注释
     *
     * @return
     */
    String name() default StringUtils.EMPTY;

    /**
     * 引用
     *
     * @return
     */
    String reference() default StringUtils.EMPTY;

    /**
     * 字段属性是否为字典项代码
     *
     * @return
     */
    boolean dictionary() default false;
}
