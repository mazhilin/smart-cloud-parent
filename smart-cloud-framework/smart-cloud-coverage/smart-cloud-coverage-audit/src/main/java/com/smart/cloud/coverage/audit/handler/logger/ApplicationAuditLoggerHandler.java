package com.smart.cloud.coverage.audit.handler.logger;

import com.smart.cloud.coverage.audit.annotation.ApplicationAudit;
import com.smart.cloud.coverage.audit.handler.ApplicationAuditHandler;
import lombok.RequiredArgsConstructor;
import org.javers.core.Changes;

/**
 * @className: com.smart.cloud.coverage.audit.handler.logger.ApplicationAuditLoggerHandler
 * @title: 封装SmartCloud项目-ApplicationAuditLoggerHandler类
 * @description: <p>
 *         SmartCloud项目-ApplicationAuditLoggerHandler
 *         </p>
 * @content: ApplicationAuditLoggerHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-31 01:54
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@RequiredArgsConstructor
public class ApplicationAuditLoggerHandler implements ApplicationAuditHandler {
    /**
     * 审计处理-process
     *
     * @param audit
     *         审核注解
     * @param event
     *         审核事件
     */
    @Override
    public void process(ApplicationAudit audit, Changes event) {

    }
}
