package com.smart.cloud.gateway.boot.resolver;

import com.smart.cloud.gateway.boot.domain.GatewayConfigRoute;

import java.util.Map;

/**
 * @className: com.smart.cloud.gateway.boot.resolver.PropertiesResolver
 * @projectName: 封装smartcloud项目-PropertiesResolver类
 * @module: smartcloud项目-PropertiesResolver类，主要位于gateway模块的业务场景
 * @content: PropertiesResolver类，主要用于完成属性引用接口类的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-01-12 02:53
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 smartcloud Systems Incorporated. All rights reserved.
 */
public interface PropertiesResolver<T> {

    Map<String, GatewayConfigRoute> resolveRoutes(T properties);
}
