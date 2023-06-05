package com.smart.cloud.datasource.boot.constants;

/**
 * @className: com.smart.cloud.datasource.boot.constants.Propagations
 * @title: 封装SmartCloud项目-Propagations类
 * @description: <p>
 *         SmartCloud项目-Propagations
 *         </p>
 * @content: Propagations
 * @author: Powered by marklin
 * @datetime: 2023-06-04 00:56
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public enum Propagation {
    //支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。
    REQUIRED,
    //新建事务，如果当前存在事务，把当前事务挂起。
    REQUIRES_NEW,
    //以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
    NOT_SUPPORTED,
    //支持当前事务，如果当前没有事务，就以非事务方式执行。
    SUPPORTS,
    //以非事务方式执行，如果当前存在事务，则抛出异常。
    NEVER,
    //支持当前事务，如果当前没有事务，就抛出异常。
    MANDATORY,
    //如果当前存在事务，则在嵌套事务内执行，如果当前没有事务，就新建一个事务。
    NESTED
}
