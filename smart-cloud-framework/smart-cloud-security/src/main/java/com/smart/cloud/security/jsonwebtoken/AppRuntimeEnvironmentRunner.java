package com.smart.cloud.security.jsonwebtoken;

import org.springframework.boot.ApplicationRunner;

/**
 * @className: com.smart.cloud.security.jsonwebtoken.AppRuntimeEnvironmentRunner
 * @title: 封装SmartCloud项目-AppRuntimeEnvironmentRunner类
 * @description: <p>
 *         SmartCloud项目-InitAppRuntimeEnvironmentService
 *         </p>
 * @content: InitAppRuntimeEnvironmentService
 * @author: Powered by marklin
 * @datetime: 2023-05-17 00:53
 * @version: 1.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@FunctionalInterface
public interface AppRuntimeEnvironmentRunner extends ApplicationRunner {
    /**
     * 初始化数据
     *
     * @param userInfo
     *         用户信息
     */
    default void initialize(JwtUserInfo userInfo) {
        return;
    }
}

