package com.smart.cloud.redis.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.redis.support.RedisUtil
 * @projectName: 封装SmartCloud项目-RedisUtil类
 * @module: SmartCloud项目-RedisUtil类，主要位于RedisUtil模块的业务场景
 * @content: RedisUtil类，主要用于完成RedisUtil的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 02:17
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class RedisUtil implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
