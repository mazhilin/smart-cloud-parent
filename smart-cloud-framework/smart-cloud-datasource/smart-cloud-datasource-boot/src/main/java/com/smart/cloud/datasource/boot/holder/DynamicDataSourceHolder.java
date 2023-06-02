package com.smart.cloud.datasource.boot.holder;
/**
 * @packageName com.coocaa.cloud.datasource.boot.holder.DynamicDataSourceHolder
 * @projectName: SmartCloud
 * @className: DynamicDataSourceHolder
 * @title: 封装SmartCloud项目-DynamicDataSourceHolder类
 * @content: DynamicDataSourceHolder
 * @description: SmartCloud项目-DynamicDataSourceHolder类,主要用作DynamicDataSourceHolder。
 * @author: Powered by Marklin
 * @datetime: 2023-05-29 16:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DynamicDataSourceHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDataSourceKey(String dataSourceKey) {
        CONTEXT_HOLDER.set(dataSourceKey);
    }

    public static String getDataSourceKey() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDataSourceKey() {
        CONTEXT_HOLDER.remove();
    }
}
