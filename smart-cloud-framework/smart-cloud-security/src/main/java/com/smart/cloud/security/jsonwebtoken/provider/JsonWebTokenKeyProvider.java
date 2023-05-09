package com.smart.cloud.security.jsonwebtoken.provider;

import com.smart.cloud.security.properties.SmartCloudTokenProperties;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

import javax.annotation.PostConstruct;
import javax.crypto.SecretKey;

/**
 * @className: com.smart.cloud.security.jsonwebtoken.provider.JsonWebTokenKeyProvider
 * @title: 封装SmartCloud项目-JsonWebTokenKeyProvider类
 * @description: <p>
 *         SmartCloud项目-JsonWebTokenKeyProvider
 *         </p>
 * @content: JsonWebTokenKeyProvider
 * @author: Powered by marklin
 * @datetime: 2023-05-07 16:26
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@Component
@Configuration
@RequiredArgsConstructor
public class JsonWebTokenKeyProvider {

    protected final SmartCloudTokenProperties tokenProperties;

    /**
     * 获取 JWT 的秘钥
     *
     * @return 秘钥
     */
    @PostConstruct
    public  SecretKey getSecretKey() {
        byte[] keyBytes = Base64Utils.decodeFromString(tokenProperties.getSecret());
        return Keys.hmacShaKeyFor(keyBytes);
    }



}
