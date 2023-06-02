package com.smart.cloud.datasource.boot.annotation;

import com.smart.cloud.datasource.boot.constants.DatasourceGroup;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.datasource.boot.annotation.Slave
 * @title: 封装SmartCloud项目-Slave类
 * @description: <p>
 *         SmartCloud项目-Slave
 *         </p>
 * @content: Slave-从库数据源自定义注解
 * @author: Powered by marklin
 * @datetime: 2023-06-02 22:10
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DynamicDatasource(DatasourceGroup.SLAVE)
public @interface Slave {
}
