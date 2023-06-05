package com.smart.cloud.datasource.boot.annotation;

import com.smart.cloud.datasource.boot.constants.Propagation;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.datasource.boot.annotation.DynamicDatasourceTransactional
 * @title: 封装SmartCloud项目-DynamicDatasourceTransactional类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceTransactional
 *         </p>
 * @content: DynamicDatasourceTransactional
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:55
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicDatasourceTransactional {
    Class<? extends Throwable>[] rollbackFor() default {Exception.class};

    Class<? extends Throwable>[] noRollbackFor() default {};

    Propagation propagation() default Propagation.REQUIRED;
}
