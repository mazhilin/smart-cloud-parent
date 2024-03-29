package com.smart.cloud.datasource.boot.aspect;

import com.smart.cloud.datasource.boot.holder.DynamicDatasourceContextHolder;
import com.smart.cloud.datasource.boot.processor.DynamicDatasourceProcessor;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.ClassUtils;
import org.springframework.util.PatternMatchUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @className: com.smart.cloud.datasource.boot.aspect.DynamicDatasourceNamedInterceptor
 * @title: 封装SmartCloud项目-DynamicDatasourceNamedInterceptor类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceNamedInterceptor
 *         </p>
 * @content: DynamicDatasourceNamedInterceptor
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:23
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Slf4j
public class DynamicDatasourceNamedInterceptor implements MethodInterceptor {
    private static final String DYNAMIC_PREFIX = "#";
    private final Map<String, String> nameMap = new HashMap<>();
    private final DynamicDatasourceProcessor processor;

    public DynamicDatasourceNamedInterceptor(DynamicDatasourceProcessor processor) {
        this.processor = processor;
    }

    @Nullable
    @Override
    public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
        String dsKey = definiteDatasource(invocation);
        DynamicDatasourceContextHolder.push(dsKey);
        try {
            return invocation.proceed();
        } finally {
            DynamicDatasourceContextHolder.poll();
        }
    }

    /**
     * add Item Pattern
     *
     * @param methodName like select*
     * @param dsKey      like master or slave
     */
    public void addPattern(@Nonnull String methodName, @Nonnull String dsKey) {
        log.debug("dynamic-datasource adding ds method [" + methodName + "] with attribute [" + dsKey + "]");
        nameMap.put(methodName, dsKey);
    }

    /**
     * add PatternMap
     *
     * @param map namedMap
     */
    public void addPatternMap(Map<String, String> map) {
        for (Map.Entry<String, String> item : map.entrySet()) {
            addPattern(item.getKey(), item.getValue());
        }
    }

    /**
     * config from properties
     * <pre>
     *         Properties attributes = new Properties();
     *         attributes.setProperty("select*", "slave");
     *         attributes.setProperty("add*", "master");
     *         attributes.setProperty("update*", "master");
     *         attributes.setProperty("delete*", "master");
     * </pre>
     *
     * @param properties ds properties
     */
    public void fromProperties(@Nonnull Properties properties) {
        Enumeration<?> propNames = properties.propertyNames();
        while (propNames.hasMoreElements()) {
            String methodName = (String) propNames.nextElement();
            String value = properties.getProperty(methodName);
            this.addPattern(methodName, value);
        }
    }


    private boolean isMatch(String methodName, String mappedName) {
        return PatternMatchUtils.simpleMatch(mappedName, methodName);
    }

    private String definiteDatasource(MethodInvocation invocation) {
        String key = findDsKey(invocation);
        return (key != null && key.startsWith(DYNAMIC_PREFIX)) ? processor.definite(invocation, key) : key;
    }

    private String findDsKey(MethodInvocation invocation) {
        Method method = invocation.getMethod();
        if (!ClassUtils.isUserLevelMethod(method)) {
            return null;
        }

        // Look for direct name match.
        String methodName = method.getName();
        String dsKey = this.nameMap.get(methodName);

        if (dsKey == null) {
            // Look for most specific name match.
            String bestNameMatch = null;
            for (String mappedName : this.nameMap.keySet()) {
                boolean match1 = isMatch(methodName, mappedName);
                boolean match2 = bestNameMatch == null || bestNameMatch.length() <= mappedName.length();
                if (match1 && match2) {
                    dsKey = this.nameMap.get(mappedName);
                    bestNameMatch = mappedName;
                }
            }
        }
        return dsKey;
    }
}
