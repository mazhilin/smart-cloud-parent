package com.smart.cloud.security.jsonwebtoken;

import org.springframework.boot.CommandLineRunner;

/**
 * @className: com.smart.cloud.security.jsonwebtoken.AppRuntimeCommandRunner
 * @title: 封装SmartCloud项目-AppRuntimeCommandRunner类
 * @description: <p>
 *         SmartCloud项目-AppRuntimeCommandRunner
 *         </p>
 * @content: AppRuntimeCommandRunner
 * @author: Powered by marklin
 * @datetime: 2023-05-17 01:26
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface AppRuntimeEnvCommandRunner extends CommandLineRunner {
    /**初始化数据
     * @param userInfo 用户信息
     */
    default void initialize(JwtUserInfo userInfo) {
        return;
    }
}
