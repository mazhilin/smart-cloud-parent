package com.smart.cloud.dubbo.common.configuration;

import com.smart.cloud.dubbo.common.config.AbstractConsumerConfig;
import com.smart.cloud.dubbo.common.config.AbstractGenericConfig;
import com.smart.cloud.dubbo.common.config.AbstractProviderConfig;
import com.smart.cloud.dubbo.constants.DubboConstant;
import org.apache.dubbo.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @className: com.smart.cloud.dubbo.common.config.DubboBaseConfiguration
 * @title: 封装SmartCloud项目-DubboBaseConfiguration类
 * @description: <p>
 *         SmartCloud项目-DubboBaseConfiguration
 *         </p>
 * @content: DubboBaseConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-09 23:20
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DubboBaseConfiguration implements AbstractGenericConfig, AbstractProviderConfig, AbstractConsumerConfig {

    @Value("${dubbo.application.name}")
    private String applicationName;

    @Value("${dubbo.application.qos-port}")
    private String qosPort;

    @Value("${dubbo.registry.timeout}")
    private String registryTimeout;

    @Value("${dubbo.registry.address}")
    private String registryAddress;


    @Value("${dubbo.registry.file}")
    private String registryFile;

    @Value("${dubbo.monitor.address}")
    private String monitorAddress;

    @Value("${dubbo.metadata-report.address}")
    private String metadataAddress;


    /**
     * Dubbo应用中心信息
     *
     * @return
     */
    @Bean
    @Override
    public ApplicationConfig applicationConfig() {
        ApplicationConfig application = new ApplicationConfig();
        application.setQosEnable(true);
        application.setQosAcceptForeignIp(false);
        application.setQosPort(Integer.parseInt(qosPort) + 10);
        application.setPublishInterface(true);
        application.setQosEnableCompatible(true);
        application.setName(applicationName);
        application.setLogger(DubboConstant.UNIFIED_LOGGER);
        return application;
    }


    /**
     * Dubbo注册中心信息
     *
     * @return
     */
    @Bean
    @Override
    public RegistryConfig registry() {
        RegistryConfig registry = new RegistryConfig();
        registry.setTimeout(Integer.parseInt(registryTimeout));
        registry.setAddress(registryAddress);
        registry.setRegister(true);
        registry.setProtocol(DubboConstant.UNIFIED_PROTOCOL);
        registry.setFile(registryFile);
        return registry;
    }

    /**
     * Dubbo监控中心信息
     *
     * @return
     */
    @Bean
    @Override
    public MonitorConfig monitor() {
        MonitorConfig monitor = new MonitorConfig();
        monitor.setAddress(monitorAddress);
        monitor.setDefault(true);
        monitor.setProtocol(DubboConstant.UNIFIED_PROTOCOL);
        monitor.setVersion(DubboConstant.UNIFIED_VERSION);
        return monitor;
    }

    /**
     * Dubbo配置中心信息
     *
     * @return
     */
    @Bean
    @Override
    public ConfigCenterConfig configCenter() {
        ConfigCenterConfig configCenter = new ConfigCenterConfig();
        configCenter.setTimeout(Long.getLong(registryTimeout));
        configCenter.setHighestPriority(true);
        return configCenter;
    }

    /**
     * Dubbo元数据中心信息
     *
     * @return
     */
    @Bean
    @Override
    public MetadataReportConfig metadataReport() {
        MetadataReportConfig metadata = new MetadataReportConfig();
        metadata.setAddress(metadataAddress);
        metadata.setTimeout(Integer.getInteger(registryTimeout));
        metadata.setRetryTimes(DubboConstant.RETRY_TIMES);
        metadata.setRetryPeriod(DubboConstant.RETRY_PERIOD);
        metadata.setCycleReport(true);
        return metadata;
    }
}
