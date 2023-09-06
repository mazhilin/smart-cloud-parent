package com.smart.cloud.redis.handler;

/**
 * @className: com.smart.cloud.redis.handler.ISubmitQueueHandler
 * @projectName: 封装SmartCloud项目-ISubmitQueueHandler类
 * @module: SmartCloud项目-ISubmitQueueHandler类，主要位于ISubmitQueueHandler模块的业务场景
 * @content: ISubmitQueueHandler类，主要用于完成ISubmitQueueHandler的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 02:37
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface ISubmitQueueHandler {

    /**
     * 每次处理队列中的第一条消息
     *
     * @param message 消息内容
     */
    void process(String message);
}
