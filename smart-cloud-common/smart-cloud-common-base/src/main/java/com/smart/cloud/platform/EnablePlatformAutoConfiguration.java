package com.smart.cloud.platform;

import com.smart.cloud.platform.properties.ServiceCommonProperties;
import com.smart.cloud.platform.properties.ServiceInstanceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className: com.smart.cloud.platform.EnablePlatformAutoConfiguration
 * @projectName: 封装SmartCloud项目-EnablePlatformAutoConfiguration类
 * @module: SmartCloud项目-EnablePlatformAutoConfiguration类，主要位于EnablePlatformAutoConfiguration模块的业务场景
 * @content: EnablePlatformAutoConfiguration类，主要用于完成EnablePlatformAutoConfiguration的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 03:10
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@ComponentScan(basePackages = {"com.smart.cloud.platform.*"})
@EnableConfigurationProperties({
        ServiceInstanceProperties.class,
        ServiceCommonProperties.class
})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class EnablePlatformAutoConfiguration {
}
