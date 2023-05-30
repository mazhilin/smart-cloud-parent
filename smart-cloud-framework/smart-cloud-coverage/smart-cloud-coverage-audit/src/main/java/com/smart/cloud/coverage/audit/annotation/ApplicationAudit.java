package com.smart.cloud.coverage.audit.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.coverage.audit.annotation.ApplicationAudit
 * @title: 封装CoocaaCloud项目-ApplicationAudit类
 * @description: <p>
 *         CoocaaCloud项目-ApplicationAudit
 *         </p>
 * @content: ApplicationAudit
 * @author: Powered by marklin
 * @datetime: 2023-05-31 00:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 CoocaaCloud Systems Incorporated. All rights reserved.
 */
@Inherited
@Documented
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationAudit {

    /**
     * 审计实例-instance
     * @return 审计实例
     */
    String instance() default "";

    /**
     * 审计编码-code
     * @return 审计编码
     */
    String code();

    /**
     * 审计名称-name
     * @return 审计名称
     */
    String name();
    /**
     * 审计码值-value
     * @return string
     */
    @AliasFor("spel")
    String value() default "";

    /**
     * 审计名称-example
     * @return string
     */
    @AliasFor("value")
    String example() default "";

    /**
     * 审计新值-history
     * @return 审计新值
     */
    String history() default "";

    /**
     * 审计旧值-current
     * @return 审计旧值
     */
    String current() default "";
}
