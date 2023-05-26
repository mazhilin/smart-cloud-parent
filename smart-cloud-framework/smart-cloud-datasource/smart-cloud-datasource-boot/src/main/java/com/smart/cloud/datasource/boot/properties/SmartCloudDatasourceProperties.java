package com.smart.cloud.datasource.boot.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.datasource.boot.properties.SmartCloudDatasourceProperties
 * @title: 封装SmartCloud项目-SmartCloudDatasourceProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudDatasourceProperties
 *         </p>
 * @content: SmartCloudDatasourceProperties
 * @author: Powered by marklin
 * @datetime: 2023-05-27 03:26
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@Component
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties(prefix = "smart.cloud.datasource")
public class SmartCloudDatasourceProperties extends DataSourceProperties {
}
