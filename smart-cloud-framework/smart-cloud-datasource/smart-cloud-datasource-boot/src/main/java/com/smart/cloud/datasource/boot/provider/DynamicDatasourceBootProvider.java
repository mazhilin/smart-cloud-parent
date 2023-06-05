package com.smart.cloud.datasource.boot.provider;

import com.smart.cloud.datasource.boot.creator.DefaultDatasourceCreator;
import com.smart.cloud.datasource.boot.properties.DatasourceProperties;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @packageName com.coocaa.cloud.datasource.boot.provider.DynamicDatasourceBootProvider
 * @projectName: CoocaaCloud
 * @className: DynamicDatasourceBootProvider
 * @title: 封装CoocaaCloud项目-DynamicDatasourceBootProvider类
 * @content: DynamicDatasourceBootProvider
 * @description: CoocaaCloud项目-DynamicDatasourceBootProvider类,主要用作DynamicDatasourceBootProvider。
 * @author: Powered by Marklin
 * @datetime: 2023-06-02 19:22
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 CoocaaCloud Systems Incorporated. All rights reserved.
 */
@Slf4j
public class DynamicDatasourceBootProvider extends AbstractDatasourceProvider{

    /**
     * 所有数据源
     */
    private final Map<String, DatasourceProperties> propertiesConfigMap;

    public DynamicDatasourceBootProvider(DefaultDatasourceCreator defaultDataSourceCreator, Map<String, DatasourceProperties> propertiesConfigMap) {
        super(defaultDataSourceCreator);
        this.propertiesConfigMap = propertiesConfigMap;
    }

    /**
     * 加载所有数据源
     *
     * @return 所有数据源，key为数据源名称
     */
    @Override
    public Map<String, DataSource> loadDatasources() {
        return createDataSourceMap(propertiesConfigMap);
    }
}
