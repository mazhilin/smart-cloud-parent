package com.smart.cloud.dubbo.provider.extension;

import com.smart.cloud.dubbo.common.utils.SpringUtils;
import com.smart.cloud.dubbo.provider.annotation.DubboServiceProvider;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.ExtensionFactory;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @className: com.smart.cloud.dubbo.provider.extension.DubboServiceProviderExtension
 * @title: 封装SmartCloud项目-DubboServiceProviderExtension类
 * @description: <p>
 *         SmartCloud项目-DubboServiceProviderExtension
 *  Dubbo服务提供者的SPI扩展类，用于自动注册Dubbo服务实现类到Dubbo框架中。
 *  根据Dubbo框架的要求，Dubbo服务提供者需要实现org.apache.dubbo.common.extension.SPI接口，
 *  并通过getExtension方法来获取Dubbo服务的实例。
 *         </p>
 * @content: DubboServiceProviderExtension
 * @author: Powered by marklin
 * @datetime: 2023-05-10 01:29
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Activate(group = CommonConstants.PROVIDER)
public class DubboServiceProviderExtension implements ExtensionFactory {
    /**
     * 通过SPI机制获取Dubbo服务的实例。
     * 如果需要获取的服务类型不是Dubbo服务实现类，则返回null。
     * 如果需要获取的服务类型是Dubbo服务实现类，则获取Dubbo服务的接口类型并注册Dubbo服务实现类。
     *
     * @param type  获取的服务类型
     * @param name  获取服务的名称
     * @param <T>   服务类型的泛型
     * @return      获取的服务实例
     */
    @Override
    public <T> T getExtension(Class<T> type, String name) {
// 判断是否是Dubbo服务实现类
        if (!DubboService.class.isAssignableFrom(type)) {
            return null;
        }
        // 获取Dubbo服务接口类型
        DubboServiceProvider annotation = type.getAnnotation(DubboServiceProvider.class);
        if (annotation == null) {
            return null;
        }
        Class<?> interfaceClass = annotation.interfaceClass();
        // 注册Dubbo服务实现类
        Object dubboService = SpringUtils.getBean(type);
        return (T) dubboService;
    }
}
