package com.smart.cloud.gateway.boot.resolver;

import com.smart.cloud.gateway.boot.domain.GatewayConfigRoute;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.CompositeRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @className: com.smart.cloud.gateway.boot.resolver.GatewayPropertiesResolver
 * @projectName: 封装smartcloud项目-GatewayPropertiesResolver类
 * @module: smartcloud项目-GatewayPropertiesResolver类，主要位于gateway模块的业务场景
 * @content: GatewayPropertiesResolver类，主要用于完成属性解析的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-01-12 03:04
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 smartcloud Systems Incorporated. All rights reserved.
 */
public class GatewayPropertiesResolver implements PropertiesResolver<GatewayProperties>{

    private final RouteDefinitionLocator locator;

    private List<RouteDefinition> cache = new ArrayList<>();

    public GatewayPropertiesResolver(Object locator) {
        this.locator = (CompositeRouteDefinitionLocator) locator;
        this.locator.getRouteDefinitions()
                .filter(this::checkRouteDefinition)
                .subscribe(cache::add);
    }

    @Override
    public Map<String, GatewayConfigRoute> resolveRoutes(GatewayProperties properties) {
        return null;
    }

    private boolean checkRouteDefinition(RouteDefinition routeDefinition) {
        URI uri = routeDefinition.getUri();
        if (uri == null) {
            return false;
        }
        return true;
    }
}
