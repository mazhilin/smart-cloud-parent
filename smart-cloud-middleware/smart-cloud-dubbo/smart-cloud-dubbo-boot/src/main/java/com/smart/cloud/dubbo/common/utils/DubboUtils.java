package com.smart.cloud.dubbo.common.utils;


import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


/**
 * @className: com.smart.cloud.dubbo.common.utils.DubboUtil
 * @title: 封装SmartCloud项目-DubboUtil类
 * @description: <p>
 *         SmartCloud项目-DubboUtil
 *         </p>
 * @content: DubboUtil
 * @author: Powered by marklin
 * @datetime: 2023-05-10 01:42
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DubboUtils extends org.apache.dubbo.spring.boot.util.DubboUtils {
    /**
     * 创建 Dubbo 服务名称。
     *
     * @param interfaceClass
     *         Dubbo 服务接口类型
     *
     * @return Dubbo 服务名称
     */
    public static String getDubboServiceName(Class<?> interfaceClass) {
        return interfaceClass.getName();
    }

    /**
     * 获取 Field 的泛型类型。
     *
     * @param field
     *         Field 对象
     *
     * @return 泛型类型
     */
    public static Class<?> getGenericClass(Field field) {
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        if (actualTypeArguments.length == 0) {
            return null;
        }
        try {
            return Class.forName(actualTypeArguments[0].getTypeName());
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }


    /**
     * 获取使用了指定注解的所有 Field。
     *
     * @param annotationClass
     *         注解类型
     *
     * @return Field 列表
     */
    public static List<Field> getFieldsByAnnotation(Class<? extends Annotation> annotationClass) {
        List<Field> fields = new ArrayList<>();
        for (Class<?> clazz : getClasses()) {
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(annotationClass)) {
                    fields.add(field);
                }
            }
        }
        return fields;
    }

    /**
     * 获取应用中加载的所有 Class。
     *
     * @return Class 列表
     */
    private static List<Class<?>> getClasses() {
        List<Class<?>> classes = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (ScanResult scanResult = new ClassGraph().addClassLoader(classLoader).enableAllInfo().scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {
                Class<?> clazz = Class.forName(classInfo.getName(), false, classLoader);
                classes.add(clazz);
            }
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
        return classes;
    }
}
