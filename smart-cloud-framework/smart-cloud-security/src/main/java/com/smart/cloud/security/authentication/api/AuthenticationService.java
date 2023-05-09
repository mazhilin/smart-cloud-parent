package com.smart.cloud.security.authentication.api;

/**
 * @className: com.smart.cloud.security.authentication.api.AuthenticationService
 * @title: 封装SmartCloud项目-AuthenticationService类
 * @description: <p>
 *         SmartCloud项目-AuthenticationService
 *         </p>
 * @content: AuthenticationService
 * @author: Powered by marklin
 * @datetime: 2023-05-08 04:45
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface AuthenticationService {
    /**
     * 检查token是否合法
     * @param token token
     * @return boolean 是否合法
     */
    boolean checkToken(String token);

    /**
     * 验证token是否有效
     * @param token token
     * @return boolean 是否有效
     */
    boolean validateToken(String token);
}
