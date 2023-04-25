package com.smart.cloud.boot.aop;

import com.smart.cloud.boot.Aspect;

/**
 * @className: com.smart.cloud.boot.aop.ApplicationAspect
 * @title: 封装SmartCloud-项目ApplicationAspect类
 * @description: <p>
 *      SmartCloud项目-应用切面接口类
 *         </p>
 * @content: 应用切面接口类，主要实现切面接口
 * @author: Powered by marklin
 * @datetime: 2023-04-26 03:06
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface ApplicationAspect extends Aspect {
    /**
     * aspect切面-切入点
     */
    void aspectPoint();
}
