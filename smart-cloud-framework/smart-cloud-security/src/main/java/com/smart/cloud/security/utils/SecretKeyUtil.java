package com.smart.cloud.security.utils;

import io.jsonwebtoken.security.Keys;
import org.springframework.util.Base64Utils;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

/**
 * @className: com.smart.cloud.security.utils.SecretKeyUtil
 * @title: 封装SmartCloud项目-SecretKeyUtil类
 * @description: <p>
 *         SmartCloud项目-SecretKeyUtil
 *         </p>
 * @content: SecretKeyUtil
 * @author: Powered by marklin
 * @datetime: 2023-05-07 17:17
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class SecretKeyUtil {
    private static final String ALGORITHM = "AES";

    /**
     * 根据密钥字符串生成 SecretKey 实例
     *
     * @param secret 密钥字符串
     * @return SecretKey 实例
     */
    public static Key generateSecretKey(String secret) {
        byte[] decodedKey = Base64.getDecoder().decode(secret.getBytes(StandardCharsets.UTF_8));
        return new SecretKeySpec(decodedKey, ALGORITHM);
    }

    /**
     * 根据密钥字符串生成 SecretKey 实例
     *
     * @param secret 密钥字符串
     * @return SecretKey 实例
     */
    public static SecretKey generateSecret(String secret) {
        byte[] keyBytes = Base64Utils.decodeFromString(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
