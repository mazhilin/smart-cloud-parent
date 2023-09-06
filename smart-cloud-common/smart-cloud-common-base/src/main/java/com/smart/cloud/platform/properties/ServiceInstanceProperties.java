package com.smart.cloud.platform.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: com.smart.cloud.platform.properties.ServiceInstanceProperties
 * @projectName: 封装SmartCloud项目-ServiceInstanceProperties类
 * @module: SmartCloud项目-ServiceInstanceProperties类，主要位于ServiceInstanceProperties模块的业务场景
 * @content: ServiceInstanceProperties类，主要用于完成ServiceInstanceProperties的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 03:07
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = ServiceInstanceProperties.PREFIX, ignoreInvalidFields = true)
public class ServiceInstanceProperties {

    public static final String PREFIX = "smart.cloud.instance";

    private Map<String, Service> service = new HashMap<>();

    @Getter
    @Setter
    public static class Service {
        /**
         * service simple code
         */
        private String name;
        /**
         * service id
         */
        private String code;
        /**
         * service path
         */
        private String path;
        /**
         * service port
         */
        private int port;
        /**
         * service redis database
         */
        private int redisDb;
    }
}
