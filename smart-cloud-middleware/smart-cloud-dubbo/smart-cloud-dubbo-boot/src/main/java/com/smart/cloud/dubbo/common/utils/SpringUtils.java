package com.smart.cloud.dubbo.common.utils;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className: com.smart.cloud.dubbo.common.utils.SpringUtils
 * @title: 封装SmartCloud项目-SpringUtils类
 * @description: <p>
 *         SmartCloud项目-SpringUtils
 *         </p>
 * @content: SpringUtils
 * @author: Powered by marklin
 * @datetime: 2023-05-10 01:39
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class SpringUtils  implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext applicationContext;
    private static Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    /**
     * 设置 Spring 容器。
     *
     * @param applicationContext Spring 容器
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringUtils.applicationContext = applicationContext;
    }

    /**
     * 根据 Bean 名称获取 Spring Bean。
     *
     * @param name  Bean 名称
     * @return      Spring Bean
     */
    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }

    /**
     * 根据 Bean 类型获取 Spring Bean。
     *
     * @param type  Bean 类型
     * @param <T>   Bean 类型的泛型
     * @return      Spring Bean
     */
    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }
    /**
     * 获取 Spring 容器中指定名称或类型的 Bean。
     *
     * @param name  Bean 名称
     * @param type  Bean 类型
     * @param <T>   Bean 类型的泛型
     * @return      Bean 实例
     */
    public static <T> T getBean(String name, Class<T> type) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(name, type);
    }

    /**
     * 将 Bean 实例注册到 Spring 容器中，并覆盖原 Bean。
     *
     * @param name  Bean 名称
     * @param bean  Bean 实例
     */
    public static void registerBean(String name, Object bean) {
        if (applicationContext == null) {
            return;
        }
        ConfigurableApplicationContext configurableContext = (ConfigurableApplicationContext) applicationContext;
        if (configurableContext.containsBean(name)) {
            Object existingBean = getSingleton(name);
            if (existingBean != null) {
                if (existingBean instanceof DisposableBean) {
                    try {
                        ((DisposableBean) existingBean).destroy();
                    } catch (Exception e) {
                        throw new IllegalStateException(e.getMessage(), e);
                    }
                }
                singletonObjects.remove(name);
            }
        }
        configurableContext.getBeanFactory().registerSingleton(name, bean);
        singletonObjects.put(name, bean);
    }

    /**
     * 自动注入 Bean 实例。
     *
     * @param bean  Bean 实例
     */
    public static void autowireBean(Object bean) {
        if (applicationContext == null) {
            return;
        }
        applicationContext.getAutowireCapableBeanFactory().autowireBean(bean);
    }

    /**
     * 获取单例 Bean 实例。
     *
     * @param name  Bean 名称
     * @return      Bean 实例
     */
    private static Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    /**
     * 销毁所有单例 Bean 实例。
     */
    @Override
    public void destroy() {
        if (applicationContext == null) {
            return;
        }
        for (Object singleton : singletonObjects.values()) {
            if (singleton instanceof DisposableBean) {
                try {
                    ((DisposableBean) singleton).destroy();
                } catch (Exception e) {
                    throw new IllegalStateException(e.getMessage(), e);
                }
            }
        }
        singletonObjects.clear();
    }
}
