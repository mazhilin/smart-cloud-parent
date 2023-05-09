package com.smart.cloud.dubbo.common.config;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;

/**
 * @className: com.smart.cloud.dubbo.common.config.AbstractProviderConfig
 * @title: 封装SamrtCloud项目-AbstractProviderConfig类
 * @description: <p>
 *         SamrtCloud项目-AbstractProviderConfig
 *         </p>
 * @content: AbstractProviderConfig
 * @author: Powered by marklin
 * @datetime: 2023-05-09 23:49
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SamrtCloud Systems Incorporated. All rights reserved.
 */
public interface AbstractProviderConfig {
    /**
     * Dubbo服务协议
     *
     * @return 服务协议
     */
    default ProtocolConfig protocol() {
        return null;
    }

    /**
     * Dubbo服务提供者
     *
     * @return 返回配置
     */
    default ProviderConfig provider(){
        return null;
    }

}
