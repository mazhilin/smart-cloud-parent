package com.smart.cloud.gateway.boot;

/**
 * @className: com.smart.cloud.gateway.boot.Function
 * @projectName: 封装smartcloud项目-Function类
 * @module: smartcloud项目-Function类，主要位于gateway模块的业务场景
 * @content: Function类，主要用于完成函数接口的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-01-12 03:15
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 smartcloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface Function {
    Object apply();
}
