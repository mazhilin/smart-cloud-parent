package com.smart.cloud.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @className: com.smart.cloud.security.properties.SmartCloudSecurityProperties
 * @title: 封装SmartCloud项目-SmartCloudSecurityProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudSecurityProperties
 *         </p>
 * @content: SmartCloudSecurityProperties
 * @author: Powered by marklin
 * @datetime: 2023-05-07 20:46
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@Component
@ConfigurationProperties(prefix = "smart.cloud.security")
@ConfigurationPropertiesBinding
@ConfigurationPropertiesScan
public class SmartCloudSecurityProperties extends Properties {
    private Map<String, Object> shared = new LinkedHashMap<>();
    // Shiro 相关属性
    private Shiro shiro = new Shiro();
    // SpringSecurity
    private SpringSecurity springSecurity = new SpringSecurity();

    @Data
    public static class Shiro {
        // 是否启用 Shiro
        private Boolean enabled = true;
        // Shiro 配置文件
        private String iniConfig;
        // Shiro JWT 密钥
        private String jwtSecretKey;
        private String hashAlgorithmName = "MD5";
        private Integer hashIterations = 1024;
        private Boolean rememberMeEnabled = true;
    }

    @Data
    public static class SpringSecurity {
        // 是否启用 Spring Security
        private boolean enabled = false;
        // Spring Security JWT 密钥
        private String jwtSecretKey;
        // JWT Token 过期时间，单位为秒
        private int jwtExpiration = 3600;
        // JWT Token 签发者
        private String jwtIssuer;
        private boolean csrfEnabled = true;
        private boolean corsEnabled = true;
        private boolean httpBasicEnabled = false;
        private boolean formLoginEnabled = true;
        private boolean logoutEnabled = true;
    }
}
