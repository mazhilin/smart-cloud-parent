package com.smart.cloud.dubbo.common.config;

import org.apache.dubbo.config.*;

/**
 * @className: com.smart.cloud.dubbo.common.config.AbstractGenericConfig
 * @title: 封装SmartCloud项目-AbstractGenericConfig类
 * @description: <p>
 *         SmartCloud项目-AbstractGenericConfig
 *         </p>
 * @content: AbstractGenericConfig
 * @author: Powered by marklin
 * @datetime: 2023-05-09 23:29
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface AbstractGenericConfig {

    /**
     * Dubbo应用中心信息
     *
     * @return 应用中心信息
     */
    default ApplicationConfig applicationConfig(){
        return null;
    }


    /**
     * Dubbo注册中心信息
     *
     * @return 注册中心信息
     */
    default RegistryConfig registry(){
        return null;
    }


    /**
     * Dubbo监控中心信息
     *
     * @return 监控中心信息
     */
    default MonitorConfig monitor(){
        return null;
    }


    /**
     * Dubbo配置中心信息
     * @return 配置中心信息
     */
    default ConfigCenterConfig configCenter(){
        return null;
    }


    /**
     * Dubbo元数据中心信息
     * @return 元数据中心信息
     */
    default MetadataReportConfig metadataReport(){
        return null;
    }
}
