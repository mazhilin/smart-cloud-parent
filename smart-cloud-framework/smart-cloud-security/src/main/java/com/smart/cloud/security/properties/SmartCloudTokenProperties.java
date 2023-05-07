package com.smart.cloud.security.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @className: com.smart.cloud.security.properties.SmartCloudTokenProperties
 * @title: 封装SmartCloud项目-SmartCloudTokenProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudTokenProperties
 *         </p>
 * @content: SmartCloudTokenProperties
 * @author: Powered by marklin
 * @datetime: 2023-05-07 04:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */


@Data
@Component
@ConfigurationProperties(prefix = "smart.cloud.jwt")
@ConfigurationPropertiesBinding
@ConfigurationPropertiesScan
public class SmartCloudTokenProperties extends Properties {

    private String secret = "default-secret";
    private String issuer = "default-issuer";
    private int expiration = 86400;
    private String secretKey;
    private long expirationTime;
    private long refreshExpirationTime;
    private String tokenPrefix;
    private String headerName;
    private String audience;
}
