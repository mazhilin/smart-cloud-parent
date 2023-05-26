package com.smart.cloud.datasource.boot.properties;

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
@Component
@ConfigurationProperties(prefix = "smart.cloud.datasource")
public class SmartCloudDatasourceProperties extends DataSourceProperties {

    private ClassLoader classLoader;

    /**
     * Whether to generate a random datasource name.
     */
    private boolean generateUniqueName = true;

    /**
     * Datasource name to use if "generate-unique-name" is false. Defaults to "testdb"
     * when using an embedded database, otherwise null.
     */
    private String name;

    /**
     * Fully qualified name of the connection pool implementation to use. By default, it
     * is auto-detected from the classpath.
     */
    private Class<? extends DataSource> type;

    /**
     * Fully qualified name of the JDBC driver. Auto-detected based on the URL by default.
     */
    private String driverClassName;

    /**
     * JDBC URL of the database.
     */
    private String url;

    /**
     * Login username of the database.
     */
    private String username;

    /**
     * Login password of the database.
     */
    private String password;

    /**
     * JNDI location of the datasource. Class, url, username and password are ignored when
     * set.
     */
    private String jndiName;
}
