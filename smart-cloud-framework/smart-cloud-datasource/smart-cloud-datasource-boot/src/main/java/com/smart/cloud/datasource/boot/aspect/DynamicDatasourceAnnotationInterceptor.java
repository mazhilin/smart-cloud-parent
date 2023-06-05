package com.smart.cloud.datasource.boot.aspect;

import com.smart.cloud.datasource.boot.holder.DynamicDatasourceContextHolder;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceProcessor;
import com.smart.cloud.datasource.boot.support.DatasourceClassResolver;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @className: com.smart.cloud.datasource.boot.aspect.DynamicDatasourceAnnotationInterceptor
 * @title: 封装SmartCloud项目-DynamicDatasourceAnnotationInterceptor类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceAnnotationInterceptor
 *         </p>
 * @content: DynamicDatasourceAnnotationInterceptor
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:28
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DynamicDatasourceAnnotationInterceptor implements MethodInterceptor {
    /**
     * The identification of SPEL.
     */
    private static final String DYNAMIC_PREFIX = "#";

    private final DatasourceClassResolver resolver;

    private final DynamicDatasourceProcessor processor;

    public DynamicDatasourceAnnotationInterceptor(Boolean allowedPublicOnly, DynamicDatasourceProcessor dsProcessor) {
        resolver = new DatasourceClassResolver(allowedPublicOnly);
        this.processor = dsProcessor;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String dsKey = defineDatasource(invocation);
        DynamicDatasourceContextHolder.push(dsKey);
        try {
            return invocation.proceed();
        } finally {
            DynamicDatasourceContextHolder.poll();
        }
    }

    private String defineDatasource(MethodInvocation invocation) {
        String key = resolver.findKey(invocation.getMethod(), invocation.getThis());
        return key.startsWith(DYNAMIC_PREFIX) ? processor.definite(invocation, key) : key;
    }
}
