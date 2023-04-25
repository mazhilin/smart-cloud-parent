package com.smart.cloud.boot;

import org.springframework.beans.factory.DisposableBean;

/**
 * @className: com.smart.cloud.boot.Environment
 * @title: Environment
 * @description: 封装Pivotal项目Environment类
 *         <p>
 *         SmartCloud项目-应用上下文环境SmartCloud项目-应用上下文Environment环境类
 *         </p>
 * @content: //TODO
 * @author: marklin
 * @datetime: Powered by marklin 2023-04-26 02:49
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 Pivotal Cloud Systems Incorporated. All rights reserved.
 */
public interface Environment extends DisposableBean {
    /**
     * 清空上下文内容
     */
    void clearContext();
}
