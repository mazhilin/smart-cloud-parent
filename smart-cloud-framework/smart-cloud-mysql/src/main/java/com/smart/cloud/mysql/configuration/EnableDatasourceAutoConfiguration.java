package com.smart.cloud.mysql.configuration;

import com.smart.cloud.mysql.properties.SmartCloudMysqlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @className: com.smart.cloud.mysql.configuration.EnableDatasourceAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDatasourceAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDatasourceAutoConfiguration
 *         </p>
 * @content: EnableDatasourceAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-27 03:29
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
public class EnableDatasourceAutoConfiguration {

    @Autowired
    private SmartCloudMysqlProperties properties;
}
