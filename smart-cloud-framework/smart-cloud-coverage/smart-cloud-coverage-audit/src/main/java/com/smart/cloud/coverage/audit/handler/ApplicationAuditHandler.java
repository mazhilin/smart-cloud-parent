package com.smart.cloud.coverage.audit.handler;

import com.smart.cloud.coverage.audit.annotation.ApplicationAudit;
import org.javers.core.Changes;

/**
 * @className: com.smart.cloud.coverage.audit.handler.ApplicationAuditHandler
 * @title: 封装SmartCloud项目-ApplicationAuditHandler类
 * @description: <p>
 *         SmartCloud项目-ApplicationAuditHandler
 *         </p>
 * @content: ApplicationAuditHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-31 01:23
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface ApplicationAuditHandler {
    /**
     * 审计处理-process
     * @param audit 审核注解
     * @param event 审核事件
     */
    void process(ApplicationAudit audit, Changes event);
}
