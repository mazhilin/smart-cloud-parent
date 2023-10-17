package com.smart.cloud.dubbo.constants;

/**
 * @className: com.smart.cloud.dubbo.constant.DubboConstant
 * @title: 封装SmartCloud项目-DubboConstant类
 * @description: <p>
 *         SmartCloud项目-DubboConstant
 *         </p>
 * @content: DubboConstant
 * @author: Powered by marklin
 * @datetime: 2023-05-09 23:22
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public final class  DubboConstant {
    /**
     * 统一字符编码-utf-8
     */
    public static final String UNIFIED_VERSION = "1.0.0";

    /**
     * 统一字符编码-utf-8
     */
    public static final String UNIFIED_CONTEXT = "/smart-cloud";

    /**
     * 统一字符编码-utf-8
     */
    public static final String UNIFIED_CODE = "UTF-8";

    /**
     * 统一字符编码-utf-8
     */
    public static final String UNIFIED_PROTOCOL = "dubbo";

    /**
     * 统一字符编码-slf4j
     */
    public static final String UNIFIED_LOGGER = "slf4j";

    /**
     * 统一负载策略-LoadBalance
     */
    public static final String UNIFIED_LOAD_BALANCE = "consistenthash";

    /**
     * 统一重试次数-RetryTimes[retryTimes]
     */
    public static final Integer RETRY_TIMES = 3;

    /**
     * 统一重试间隔-RetryPeriod[retryPeriod]
     */
    public static final Integer RETRY_PERIOD = 5;
}
