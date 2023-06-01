package com.smart.cloud.datasource.boot.properties;

import com.smart.cloud.datasource.boot.config.BeecpConfig;
import com.smart.cloud.datasource.boot.config.Dbcp2Config;
import com.smart.cloud.datasource.boot.config.DruidConfig;
import com.smart.cloud.datasource.boot.config.HikaricpConfig;
import com.zaxxer.hikari.HikariConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

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
public class DatasourceProperties {
    /**
     * 连接池名称(只是一个名称标识)</br> 默认是配置文件上的名称
     */
    private String poolName;
    /**
     * 连接池类型，如果不设置自动查找 Druid > HikariCp
     */
    private Class<? extends DataSource> type;
    /**
     * JDBC driver
     */
    private String driverClassName;
    /**
     * JDBC url 地址
     */
    private String url;
    /**
     * JDBC 用户名
     */
    private String username;
    /**
     * JDBC 密码
     */
    private String password;
    /**
     * jndi数据源名称(设置即表示启用)
     */
    private String jndiName;
    /**
     * 是否启用seata
     */
    private Boolean seata = true;
    /**
     * 是否启用p6spy
     */
    private Boolean p6spy = true;
    /**
     * lazy init datasource
     */
    private Boolean lazy;
    /**
     * 初始化
     */
    private DatasourceInitProperties init = new DatasourceInitProperties();
    /**
     * Druid参数配置
     */
    private DruidConfig druid = new DruidConfig();
    /**
     * HikariCp参数配置
     */
    private HikaricpConfig hikari = new HikaricpConfig();

    /**
     * BeeCp参数配置
     */
    private BeecpConfig beecp = new BeecpConfig();
    /**
     * DBCP2参数配置
     */
    private Dbcp2Config dbcp2 = new Dbcp2Config();

    /**
     * 解密公匙(如果未设置默认使用全局的)
     */
    private String publicKey;
}
