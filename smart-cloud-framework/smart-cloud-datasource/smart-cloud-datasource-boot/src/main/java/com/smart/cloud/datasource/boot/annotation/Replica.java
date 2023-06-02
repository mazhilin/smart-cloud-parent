package com.smart.cloud.datasource.boot.annotation;

import com.smart.cloud.datasource.boot.constants.DatasourceGroup;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.datasource.boot.annotation.Replica
 * @title: 封装SmartCloud项目-Replica类
 * @description: <p>
 *         SmartCloud项目-Replica
 *         </p>
 * @content: Replica-从库自定义数据源
 * @author: Powered by marklin
 * @datetime: 2023-06-02 22:11
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DynamicDatasource(DatasourceGroup.REPLICA)
public @interface Replica {
}
