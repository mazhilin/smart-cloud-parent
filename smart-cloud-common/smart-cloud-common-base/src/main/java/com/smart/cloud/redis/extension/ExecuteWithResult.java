package com.smart.cloud.redis.extension;

/**
 * @className: com.smart.cloud.redis.extension.ExecuteWithResult
 * @projectName: 封装SmartCloud项目-ExecuteWithResult类
 * @module: SmartCloud项目-ExecuteWithResult类，主要位于ExecuteWithResult模块的业务场景
 * @content: ExecuteWithResult类，主要用于完成ExecuteWithResult的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 02:32
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface ExecuteWithResult<T> {

    T get();
}
