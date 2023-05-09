package com.smart.cloud.security.config.spring;

import com.smart.cloud.security.properties.SmartCloudSecurityProperties;
/*import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;*/
import org.springframework.boot.context.properties.EnableConfigurationProperties;
/*import org.springframework.context.annotation.Bean;*/
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;*/

/**
 * @className: com.smart.cloud.security.config.springsecurity.SpringSecurityConfig
 * @title: 封装SmartCloud项目-SpringSecurityConfig类
 * @description: <p>
 *         SmartCloud项目-SpringSecurityConfig
 *         </p>
 * @content: SpringSecurityConfig
 * @author: Powered by marklin
 * @datetime: 2023-05-07 21:05
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
//@ConditionalOnClass({WebSecurityConfigurerAdapter.class})
@EnableConfigurationProperties(SmartCloudSecurityProperties.class)
public class ApplicationSecurityConfig {
    private final SmartCloudSecurityProperties securityProperties;


    public ApplicationSecurityConfig(SmartCloudSecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }

/*    @Bean
    @ConditionalOnMissingBean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }*/

/*    @Bean
    @ConditionalOnMissingBean
    public WebSecurityConfigurerAdapter webSecurityConfig() {
        return new WebSecurityConfigurerAdapter() {
            @Override
            protected void configure(HttpSecurity http) throws Exception {
                SmartCloudSecurityProperties.SpringSecurity security = securityProperties.getSpringSecurity();
                if (security.isCsrfEnabled()) {
                    http.csrf().disable();
                }

                if (security.isCorsEnabled()) {
                    http.cors();
                }

                if (security.isHttpBasicEnabled()) {
                    http.httpBasic();
                }

                if (security.isFormLoginEnabled()) {
                    http.formLogin();
                }

                if (security.isLogoutEnabled()) {
                    http.logout();
                }
            }
        };
    }*/
}
