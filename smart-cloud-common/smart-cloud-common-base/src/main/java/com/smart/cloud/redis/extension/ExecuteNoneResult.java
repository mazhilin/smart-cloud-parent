package com.smart.cloud.redis.extension;

/**
 * @className: com.smart.cloud.redis.extension.ExecuteNoneResult
 * @projectName: 封装SmartCloud项目-ExecuteNoneResult类
 * @module: SmartCloud项目-ExecuteNoneResult类，主要位于ExecuteNoneResult模块的业务场景
 * @content: ExecuteNoneResult类，主要用于完成ExecuteNoneResult的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 02:31
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface ExecuteNoneResult {
    void accept();
}
