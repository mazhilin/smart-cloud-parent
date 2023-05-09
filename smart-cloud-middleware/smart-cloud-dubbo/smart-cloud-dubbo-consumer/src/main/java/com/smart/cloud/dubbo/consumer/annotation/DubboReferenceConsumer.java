package com.smart.cloud.dubbo.consumer.annotation;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.dubbo.consumer.annotation.DubboReferenceConsumer
 * @title: 封装SmartCloud项目-DubboReferenceConsumer类
 * @description: <p>
 *         SmartCloud项目-DubboReferenceConsumer
 *         </p>
 * @content: DubboReferenceConsumer
 * @author: Powered by marklin
 * @datetime: 2023-05-10 00:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
@Autowired
@DubboReference
public @interface DubboReferenceConsumer {
    /**
     * 指定Dubbo服务接口的类型，默认为Java.lang.Object类型。
     * 在实际应用中，必须手动指定该值。
     */
    Class<?> interfaceClass() default Object.class;

    /**
     * 指定Dubbo服务的版本号，默认为空字符串。
     */
    String version() default "";

    /**
     * 指定Dubbo服务的分组，默认为空字符串。
     */
    String group() default "";

    /**
     * 指定Dubbo服务的URL地址，默认为空字符串。
     */
    String target() default "";

    /**
     * 指定是否检查Dubbo服务是否可用，默认为true。
     */
    boolean check() default true;

    /**
     * 指定Dubbo服务的超时时间，默认为0，表示不设置超时时间。
     */
    int timeout() default 0;
}
