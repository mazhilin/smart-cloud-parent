package com.smart.cloud.redis;

import com.smart.cloud.redis.properties.RedisConfigProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.redis.EnableRedisAutoConfiguration
 * @projectName: 封装SmartCloud项目-EnableRedisAutoConfiguration类
 * @module: SmartCloud项目-EnableRedisAutoConfiguration类，主要位于EnableRedisAutoConfiguration模块的业务场景
 * @content: EnableRedisAutoConfiguration类，主要用于完成EnableRedisAutoConfiguration的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:53
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@ComponentScan(basePackages = "com.smart.cloud.redis.*")
@EnableConfigurationProperties(RedisConfigProperties.class)
@ConditionalOnClass(name = {"org.springframework.data.redis.connection.RedisConnectionFactory"})
public class EnableRedisAutoConfiguration {

}
