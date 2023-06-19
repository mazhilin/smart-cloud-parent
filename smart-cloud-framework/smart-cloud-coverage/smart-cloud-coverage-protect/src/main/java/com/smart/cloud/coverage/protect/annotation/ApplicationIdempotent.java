package com.smart.cloud.coverage.protect.annotation;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.coverage.protect.annotation.ApplicationIdempotent
 * @title: 封装SmartCloud项目-ApplicationIdempotent类
 * @description: <p>
 *         SmartCloud项目-ApplicationIdempotent
 *         </p>
 * @content: ApplicationIdempotent
 * @author: Powered by marklin
 * @datetime: 2023-06-19 20:30
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Inherited
@Documented
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationIdempotent {
}
