package com.smart.cloud.security.config;

import com.smart.cloud.security.properties.SmartCloudTokenProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.security.config.EnableJsonWebTokenAutoConfiguration
 * @title: 封装SmartCloud项目-EnableJsonWebTokenAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableJsonWebTokenAutoConfiguration
 *         </p>
 * @content: EnableJsonWebTokenAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-07 16:45
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@EnableAutoConfiguration
@RequiredArgsConstructor
public class EnableJsonWebTokenAutoConfiguration {

    private final SmartCloudTokenProperties tokenProperties;
}
