package com.smart.cloud.dubbo.consumer.extension;

import org.apache.dubbo.common.Extension;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.ExtensionFactory;

/**
 * @className: com.smart.cloud.dubbo.consumer.extension.DubboReferenceConsumerExtension
 * @title: 封装SmartCloud项目-DubboReferenceConsumerExtension类
 * @description: <p>
 *         SmartCloud项目-DubboReferenceConsumerExtension
 *         </p>
 * @content: DubboReferenceConsumerExtension
 * @author: Powered by marklin
 * @datetime: 2023-05-10 02:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@Activate(group = CommonConstants.CONSUMER)
public class DubboReferenceConsumerExtension implements ExtensionFactory {
    @Override
    public <T> T getExtension(Class<T> type, String name) {
        return null;
    }
}
