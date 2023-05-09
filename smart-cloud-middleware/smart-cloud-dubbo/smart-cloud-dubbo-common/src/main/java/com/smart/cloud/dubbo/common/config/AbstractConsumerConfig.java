package com.smart.cloud.dubbo.common.config;

import org.apache.dubbo.config.ConsumerConfig;

/**
 * @className: com.smart.cloud.dubbo.common.config.AbstractConsumerConfig
 * @title: 封装SmartCloud项目-AbstractConsumerConfig类
 * @description: <p>
 *         SmartCloud项目-AbstractConsumerConfig
 *         </p>
 * @content: AbstractConsumerConfig
 * @author: Powered by marklin
 * @datetime: 2023-05-09 23:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface AbstractConsumerConfig {
    /**
     * Dubbo Consumer 配置消费者
     *
     * @return 返回配置对象
     */
    default ConsumerConfig consumerConfig() {
        return null;
    }
}
