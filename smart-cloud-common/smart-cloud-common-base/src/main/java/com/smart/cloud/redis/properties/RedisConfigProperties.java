package com.smart.cloud.redis.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: com.smart.cloud.redis.properties.RedisProperties
 * @projectName: 封装SmartCloud项目-RedisProperties类
 * @module: SmartCloud项目-RedisProperties类，主要位于RedisProperties模块的业务场景
 * @content: RedisProperties类，主要用于完成RedisProperties的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:54
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ConfigurationProperties(prefix = RedisConfigProperties.PREFIX)
public class RedisConfigProperties {

    public static final String PREFIX = "smart.cloud.redis";
}
