package com.smart.cloud.coverage.logger.event;

/**
 * @className: com.smart.cloud.coverage.logger.event.ApplicationLoggerEvent
 * @projectName: 封装SmartCloud项目-ApplicationLoggerEvent类
 * @module: SmartCloud项目-ApplicationLoggerEvent类，主要位于ApplicationLoggerEvent模块的业务场景
 * @content: ApplicationLoggerEvent类，主要用于完成ApplicationLoggerEvent的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-14 02:15
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

public class ApplicationLoggerEvent {

    private final BehaviorLogger behaviorLogger;
    private final BusinessLogger businessLogger;
    private final ExceptionLogger exceptionLogger;
    private final InterfaceLogger interfaceLogger;
    private final OperationLogger operationLogger;

    public ApplicationLoggerEvent(BehaviorLogger behaviorLogger, BusinessLogger businessLogger, ExceptionLogger exceptionLogger, InterfaceLogger interfaceLogger, OperationLogger operationLogger) {
        this.behaviorLogger = behaviorLogger;
        this.businessLogger = businessLogger;
        this.exceptionLogger = exceptionLogger;
        this.interfaceLogger = interfaceLogger;
        this.operationLogger = operationLogger;
    }

    public BehaviorLogger getBehaviorLogger() {
        return behaviorLogger;
    }

    public BusinessLogger getBusinessLogger() {
        return businessLogger;
    }

    public ExceptionLogger getExceptionLogger() {
        return exceptionLogger;
    }

    public InterfaceLogger getInterfaceLogger() {
        return interfaceLogger;
    }

    public OperationLogger getOperationLogger() {
        return operationLogger;
    }
}
