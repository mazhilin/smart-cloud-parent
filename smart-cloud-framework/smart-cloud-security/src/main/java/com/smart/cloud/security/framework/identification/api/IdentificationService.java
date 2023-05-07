package com.smart.cloud.security.framework.identification.api;

/**
 * @className: com.smart.cloud.security.framework.identification.api.IdentificationService
 * @title: 封装SamrtCloud项目-IdentificationService类
 * @description: <p>
 *         SamrtCloud项目-IdentificationService
 *         </p>
 * @content: IdentificationService
 * @author: Powered by marklin
 * @datetime: 2023-05-08 04:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SamrtCloud Systems Incorporated. All rights reserved.
 */
public interface IdentificationService {
    /**
     * 用户登录认证
     * @param username 账号
     * @param password 密码
     * @return String token
     */
    String login(String username, String password);

    /**
     * 用户退出登录
     * @param token Token
     */
    void logout(String token);
}
