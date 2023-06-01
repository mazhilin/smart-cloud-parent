package com.smart.cloud.datasource.boot.strategy;

import java.util.List;

/**
 * @className: com.smart.cloud.datasource.boot.strategy.DynamicDatasourceStrategy
 * @title: 封装SmartCloud项目-DynamicDatasourceStrategy类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceStrategy
 *         </p>
 * @content: DynamicDatasourceStrategy
 * @author: Powered by marklin
 * @datetime: 2023-06-02 04:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface DynamicDatasourceStrategy {

    /**
     * determine a database from the given dataSources
     *
     * @param dsNames
     *         given dataSources
     *
     * @return final dataSource
     */
    String determineKey(List<String> dsNames);
}
