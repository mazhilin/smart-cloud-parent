package com.smart.cloud.dubbo.consumer.configuration;

import com.smart.cloud.dubbo.common.configuration.DubboBaseConfiguration;
import com.smart.cloud.dubbo.constants.DubboConstant;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.dubbo.consumer.configuration.EnableDubboConsumerAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDubboConsumerAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDubboConsumerAutoConfiguration
 *         </p>
 * @content: EnableDubboConsumerAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-10 00:12
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
public class EnableDubboConsumerAutoConfiguration {

    /**
     * Dubbo Consumer 配置消费者
     */
    @Configuration
    @EnableDubbo(scanBasePackages = "${dubbo.scan.base-packages}")
    @DubboComponentScan(value = "${dubbo.scan.base-packages}")
    @ComponentScan(value = {"com.smart.cloud"},lazyInit = true)
    public static class DubboConsumerConfig extends DubboBaseConfiguration {
        @Value("${dubbo.consumer.timeout}")
        private String consumerTimeout;

        /**
         * Dubbo Consumer 配置消费者
         * @return 返回配置对象
         */
        @Bean
        @Override
        public ConsumerConfig consumerConfig() {
            ConsumerConfig consumer = new ConsumerConfig();
            consumer.setCorethreads(Thread.MAX_PRIORITY);
            consumer.setInit(true);
            consumer.setLazy(true);
            consumer.setLoadbalance(DubboConstant.UNIFIED_LOAD_BALANCE);
            consumer.setTimeout(Integer.parseInt(consumerTimeout));
            consumer.setRetries(DubboConstant.RETRY_TIMES);
            consumer.setCheck(false);
            consumer.setConnections(Thread.MAX_PRIORITY);
            consumer.setVersion(DubboConstant.UNIFIED_VERSION);
            return consumer;
        }
    }
}
