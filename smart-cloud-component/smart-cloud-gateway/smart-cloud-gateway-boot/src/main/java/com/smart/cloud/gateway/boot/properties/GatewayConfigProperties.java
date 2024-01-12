package com.smart.cloud.gateway.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @className: com.smart.cloud.gateway.boot.properties.GatewayConfigProperties
 * @projectName: 封装smartcloud项目-GatewayConfigProperties类
 * @module: smartcloud项目-GatewayConfigProperties类，主要位于gateway模块的业务场景
 * @content: GatewayConfigProperties类，主要用于完成网关配置属性的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-01-12 02:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 smartcloud Systems Incorporated. All rights reserved.
 */
@RefreshScope
@ConfigurationProperties(prefix = GatewayConfigProperties.PREFIX)
public class GatewayConfigProperties {
    public static final String PREFIX = "smart.cloud.gateway";
}
