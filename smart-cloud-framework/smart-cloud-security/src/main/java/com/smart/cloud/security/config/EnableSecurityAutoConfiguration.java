package com.smart.cloud.security.config;

import com.smart.cloud.security.config.shiro.ApplicationShiroConfig;
import com.smart.cloud.security.config.spring.ApplicationSecurityConfig;
import com.smart.cloud.security.properties.SmartCloudSecurityProperties;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;*/

/**
 * @className: com.smart.cloud.security.config.EnableSecurityAutoConfiguration
 * @title: 封装SmartCloud项目-EnableSecurityAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableSecurityAutoConfiguration
 *         </p>
 * @content: EnableSecurityAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-07 21:09
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@EnableAutoConfiguration
@ConditionalOnClass({ApplicationSecurityConfig.class, ApplicationShiroConfig.class})
@EnableConfigurationProperties(SmartCloudSecurityProperties.class)
@AutoConfigureAfter({ApplicationSecurityConfig.class, ApplicationShiroConfig.class})
public class EnableSecurityAutoConfiguration {
    private final ApplicationSecurityConfig securityConfig;
    private final ApplicationShiroConfig shiroConfig;


    public EnableSecurityAutoConfiguration(ApplicationSecurityConfig securityConfig, ApplicationShiroConfig shiroConfig) {
        this.securityConfig = securityConfig;
        this.shiroConfig = shiroConfig;
    }

/*
    @Bean
    @ConditionalOnMissingBean
    public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
        return securityConfig.webSecurityConfig();
    }
*/

    @Bean
    @ConditionalOnMissingBean
    public DefaultWebSecurityManager defaultWebSecurityManager() {
        return shiroConfig.webSecurityConfig();
    }
}
