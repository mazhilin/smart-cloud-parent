package com.smart.cloud.redis.handler;

import java.util.List;

/**
 * @className: com.smart.cloud.redis.handler.IBatchQueueHandler
 * @projectName: 封装SmartCloud项目-IBatchQueueHandler类
 * @module: SmartCloud项目-IBatchQueueHandler类，主要位于IBatchQueueHandler模块的业务场景
 * @content: IBatchQueueHandler类，主要用于完成IBatchQueueHandler的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 02:37
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface IBatchQueueHandler {
    /**
     * 每次消费的最大数量
     *
     * @return 最大数量
     */
    default int getSize() {
        return 500;
    }

    /**
     * 每次处理队列中的全部消息
     *
     * @param messages 消息内容
     */
    void process(List<String> messages);
}
