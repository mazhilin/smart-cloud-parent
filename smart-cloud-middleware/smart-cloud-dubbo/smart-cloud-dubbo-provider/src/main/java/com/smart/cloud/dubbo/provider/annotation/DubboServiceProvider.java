package com.smart.cloud.dubbo.provider.annotation;

import com.alibaba.metrics.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.dubbo.provider.annotation.DubboServiceProvider
 * @title: 封装SmartCloud项目-DubboServiceProvider类
 * @description: <p>
 *         SmartCloud项目-DubboServiceProvider
 *         </p>
 * @content: DubboServiceProvider
 * @author: Powered by marklin
 * @datetime: 2023-05-10 00:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Service
@DubboService(interfaceClass = Object.class)
@Component
public @interface DubboServiceProvider {
    /**
     * 指定Dubbo服务的接口类型。
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
     * 指定Dubbo服务是否延迟暴露，默认为false。
     */
    boolean delay() default false;

    /**
     * 指定Dubbo服务的超时时间，默认为0，表示不设置超时时间。
     */
    int timeout() default 0;
}
