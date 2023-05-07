package com.smart.cloud.security.utils;

import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONUtil;
import io.jsonwebtoken.*;

import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * @className: com.smart.cloud.framework.security.utils.JsonWebTokenUtil
 * @title: 封装SmartCloud项目-JsonWebTokenUtil类
 * @description: <p>
 *         SmartCloud项目-JsonWebTokenUtil
 *         </p>
 * @content: JsonWebTokenUtil
 * @author: Powered by marklin
 * @datetime: 2023-05-07 02:53
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class JsonWebTokenUtil {
    /**
     * 签发Token-generateToken
     * @param instanceId 实例Id
     * @param issuer token签发人
     * @param subject  token签发主题
     * @param audience token使用人
     * @param currentTime token签发时间
     * @param expiredTimeout token有效时间
     * @param claims Token claims
     * @param payload Token payload
     * @return 返回Token
     */
    public static String generateToken(String instanceId, String issuer, String subject, String audience, String secret,Date currentTime, DateTime expiredTimeout,Map<String, Object> claims, Map<String, Object> payload) {
        Key secretKey = SecretKeyUtil.generateSecret(secret);
        return Jwts.builder()
                .setId(instanceId)
                .setPayload(JSONUtil.toJsonStr(payload))
                .setIssuer(issuer)
                .setClaims(claims)
                .setSubject(subject)
                .setAudience(audience)
                .setIssuedAt(currentTime)
                .setExpiration(expiredTimeout)
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     * 解析Token
     * @param token Token
     * @param secret 密钥
     * @return 返回结果
     */
    public static Jws<Claims> parseToken(String token,String secret) {
        Key secretKey = SecretKeyUtil.generateSecret(secret);
        return Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token);
    }

    /**
     * 验证Token
     * @param token Token
     * @param secret 密钥
     * @return 返回结果
     */
    public static Boolean validateToken(String token,String secret) {
        Key secretKey = SecretKeyUtil.generateSecret(secret);
        try {
            Jwts.parserBuilder()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }

    /**
     * 刷新Token-refreshToken
     * @param token 历史Token
     * @param secret 密钥
     * @param instanceId 实例Id
     * @param issuer token签发人
     * @param subject  token签发主题
     * @param audience token使用人
     * @param currentTime token签发时间
     * @param expiredTimeout token有效时间
     * @param claims Token claims
     * @param payload Token payload
     * @return 返回Token
     */
    public static String refreshToken(String token, String secret, String instanceId, String issuer, String subject, String audience, Date currentTime, DateTime expiredTimeout,Map<String, Object> claims, Map<String, Object> payload) {
        Key secretKey = SecretKeyUtil.generateSecret(secret);

        Claims claim = Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return Jwts.builder()
                .setId(instanceId)
                .setPayload(JSONUtil.toJsonStr(payload))
                .setIssuer(issuer)
                .setClaims(claims)
                .claim(token, claim)
                .setSubject(subject)
                .setAudience(audience)
                .setIssuedAt(currentTime)
                .setExpiration(expiredTimeout)
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

}
