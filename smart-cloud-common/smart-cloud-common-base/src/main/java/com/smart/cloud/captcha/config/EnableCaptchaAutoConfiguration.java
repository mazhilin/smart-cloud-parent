package com.smart.cloud.captcha.config;

import com.smart.cloud.captcha.properties.CaptchaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.common.captcha.config.EnableCaptchaAutoConfiguration
 * @projectName: 封装SmartCloud项目-EnableCaptchaAutoConfiguration类
 * @module: SmartCloud项目-EnableCaptchaAutoConfiguration类，主要位于EnableCaptchaAutoConfiguration模块的业务场景
 * @content: EnableCaptchaAutoConfiguration类，主要用于完成EnableCaptchaAutoConfiguration的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 01:19
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@ComponentScan(basePackages = "com.smart.cloud.captcha.*")
@EnableConfigurationProperties(CaptchaProperties.class)
@ConditionalOnProperty(prefix = CaptchaProperties.PREFIX, name = "enable", havingValue = "true")
public class EnableCaptchaAutoConfiguration {


}
