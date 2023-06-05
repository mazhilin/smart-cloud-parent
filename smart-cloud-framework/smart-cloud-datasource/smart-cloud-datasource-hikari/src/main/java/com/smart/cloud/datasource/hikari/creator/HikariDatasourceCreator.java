package com.smart.cloud.datasource.hikari.creator;

import com.smart.cloud.datasource.boot.creator.DatasourceCreator;
import com.smart.cloud.datasource.boot.properties.DatasourceProperties;

import javax.sql.DataSource;

/**
 * @className: com.smart.cloud.datasource.hikari.creator.HikariDatasourceCreator
 * @title: 封装CoocaaCloud项目-HikariDatasourceCreator类
 * @description: <p>
 *         CoocaaCloud项目-HikariDatasourceCreator
 *         </p>
 * @content: HikariDatasourceCreator
 * @author: Powered by marklin
 * @datetime: 2023-06-05 23:39
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 CoocaaCloud Systems Incorporated. All rights reserved.
 */
public class HikariDatasourceCreator implements DatasourceCreator {

    /**
     * 通过属性创建数据源
     *
     * @param properties
     *         数据源属性
     *
     * @return 被创建的数据源
     */
    @Override
    public DataSource createDatasource(DatasourceProperties properties) {
        return null;
    }

    /**
     * 当前创建器是否支持根据此属性创建
     *
     * @param properties
     *         数据源属性
     *
     * @return 是否支持
     */
    @Override
    public boolean support(DatasourceProperties properties) {
        return false;
    }
}
