package com.smart.cloud.datasource.druid.properties;

import com.smart.cloud.datasource.druid.config.DruidConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: com.smart.cloud.datasource.druid.properties.SmartCloudDruidDatasourceProperties
 * @title: 封装SmartCloud项目-SmartCloudDruidDatasourceProperties类
 * @description: <p>
 *         SmartCloud项目-SmartCloudDruidDatasourceProperties
 *         </p>
 * @content: SmartCloudDruidDatasourceProperties
 * @author: Powered by marklin
 * @datetime: 2023-06-02 00:18
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
@ConfigurationProperties(prefix = DynamicDruidDatasourceProperties.PREFIX)
public class DynamicDruidDatasourceProperties {
    /**
     * Druid数据库连接池-属性前缀
     */
    public static final String PREFIX = "smart.cloud.dynamic.druid.datasource";

    /**
     * Druid数据库连接池-默认数据库
     */
    private String primary = "master";

    /**
     * Druid数据库连接池-是否启用严格模式,默认不启动. 严格模式下未匹配到数据源直接报错, 非严格模式下则使用默认数据源primary所设置的数据源
     */
    private Boolean strict = false;

    /**
     * Druid数据库连接池-是否使用p6spy输出，默认不输出
     */
    private Boolean p6spy = false;
    /**
     *  Druid数据库连接池-是否使用开启seata，默认不开启
     */
    private Boolean seata = false;
    /**
     *  Druid数据库连接池-是否懒加载数据源
     */
    private Boolean lazy = false;
    /**
     *  Druid数据库连接池-属性配置
     */
    private DruidConfig druid = new DruidConfig();
}
