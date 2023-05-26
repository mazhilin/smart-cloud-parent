package com.smart.cloud.mysql.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.mysql.properties.SmartCloudMysqlProperties
 * @title: 封装SmartCloud项目-SmartCloudMysqlProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudMysqlProperties
 *         </p>
 * @content: SmartCloudMysqlProperties
 * @author: Powered by marklin
 * @datetime: 2023-05-12 04:29
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@Component
@ConfigurationProperties("smart.cloud.mysql")
public class SmartCloudMysqlProperties {
}
