package com.smart.cloud.datasource.boot.aspect;

import com.smart.cloud.datasource.boot.annotation.DynamicDatasource;
import com.smart.cloud.datasource.boot.holder.DynamicDataSourceHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @packageName com.smart.cloud.datasource.boot.aspect.DynamicDatasourceAspect
 * @projectName: SmartCloud
 * @className: DynamicDatasourceAspect
 * @title: 封装SmartCloud项目-DynamicDataSourceAspect类
 * @content: DynamicDatasourceAspect
 * @description: SmartCloud项目-DynamicDataSourceAspect类,主要用作DynamicDataSourceAspect。
 * @author: Powered by Marklin
 * @datetime: 2023-05-29 15:52
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Aspect
@Component
public class DynamicDatasourceAspect {

  /**
   * 切面切入点
   */
  @Pointcut(
      "@annotation(com.smart.cloud.datasource.boot.annotation.DynamicDatasource) "
          + "|| @within(com.smart.cloud.datasource.boot.annotation.DynamicDatasource)")
  public void dataSourcePointcut() {}


  /**
   * 切面切换数据源
   */
  @Before("dataSourcePointcut() && @annotation(dynamicDataSource)")
  public void switchDataSource(DynamicDatasource dynamicDataSource) {
    DynamicDataSourceHolder.setDataSourceKey(dynamicDataSource.value());
  }


  /**
   * 切面清除数据源
   */
  @After("dataSourcePointcut()")
  public void clearDataSource() {
    DynamicDataSourceHolder.clearDataSourceKey();
  }
}
