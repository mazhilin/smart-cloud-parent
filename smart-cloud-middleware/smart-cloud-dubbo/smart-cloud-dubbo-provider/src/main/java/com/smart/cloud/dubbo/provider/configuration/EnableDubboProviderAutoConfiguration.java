package com.smart.cloud.dubbo.provider.configuration;

import com.smart.cloud.dubbo.common.configuration.DubboBaseConfiguration;
import com.smart.cloud.dubbo.constants.DubboConstant;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.smart.cloud.dubbo.provider.configuration.EnableDubboProviderAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDubboProviderAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDubboProviderAutoConfiguration
 *         </p>
 * @content: EnableDubboProviderAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-10 00:01
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
public class EnableDubboProviderAutoConfiguration {

    @Configuration
    @EnableDubbo(scanBasePackages = "${dubbo.scan.base-packages}")
    public static class DubboProviderAutoConfiguration extends DubboBaseConfiguration {

        @Value("${dubbo.provider.timeout}")
        private String providerTimeout;

        @Value("${dubbo.protocol.port}")
        private String protocolPort;

        @Value("${dubbo.provider.version}")
        private String providerVersion;

        /**
         * Dubbo Consumer 配置消费者
         *
         * @return 返回配置对象
         */
        @Bean
        @Override
        public ProtocolConfig protocol() {
            ProtocolConfig protocol = new ProtocolConfig();
            protocol.setCharset(DubboConstant.UNIFIED_CODE);
            protocol.setName(DubboConstant.UNIFIED_PROTOCOL);
            protocol.setPort(Integer.parseInt(protocolPort));
            return protocol;
        }

        /**
         * Dubbo服务提供者
         *
         * @return 返回配置
         */
        @Bean
        @Override
        public ProviderConfig provider() {
            ProviderConfig provider = new ProviderConfig();
            provider.setTimeout(Integer.parseInt(providerTimeout));
            provider.setProtocol(protocol());
            provider.setContextpath(DubboConstant.UNIFIED_CONTEXT);
            provider.setCharset(DubboConstant.UNIFIED_CODE);
            provider.setVersion(providerVersion);
            provider.setIothreads(Thread.MAX_PRIORITY);
            provider.setThreads(Thread.MAX_PRIORITY);
            provider.setRegister(true);
            return provider;
        }
    }
}
