package com.smart.cloud.gateway.boot.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @className: com.smart.cloud.gateway.boot.domain.GatewayRouteDefinition
 * @title: 封装SmartCloud项目-GatewayRouteDefinition类
 * @description: <p>
 *         SmartCloud项目-GatewayRouteDefinition
 *         </p>
 * @content: GatewayRouteDefinition
 * @author: Powered by marklin
 * @datetime: 2023-06-20 00:38
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class DynamicGatewayRouteDefinition implements Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = -5469267003378826438L;
    /**
     * 服务id
     */
    private String serviceId;
    /**
     * 服务id
     */
    private String serviceName;
    /**
     * 路由Id
     */
    private String routeId;
    /**
     * 路由名称
     */
    private String routeName;
    /**
     * 路由排序
     */
    private int orderSort = 0;
}
