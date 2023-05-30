package com.smart.cloud.coverage.audit.handler.event;

import com.smart.cloud.coverage.audit.annotation.ApplicationAudit;
import com.smart.cloud.coverage.audit.handler.ApplicationAuditHandler;
import com.smart.cloud.coverage.audit.handler.ApplicationCompareHandler;
import com.smart.cloud.coverage.audit.support.AuditObjectTools;
import com.smart.cloud.coverage.audit.support.SpelExpressionAware;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.javers.core.Changes;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * @className: com.smart.cloud.coverage.audit.handler.event.ApplicationAuditEventHandler
 * @title: 封装SmartCloud项目-ApplicationAuditEventHandler类
 * @description: <p>
 *         SmartCloud项目-ApplicationAuditEventHandler
 *         </p>
 * @content: ApplicationAuditEventHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-31 01:33
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@RequiredArgsConstructor
public class ApplicationAuditEventHandler implements ApplicationCompareHandler {
    protected final Optional<ApplicationAuditHandler> optional;
    /**
     * 审计对象变更历史
     *
     * @param audit
     *         应用注解类l
     * @param point
     *         应用切入点
     * @param source
     *         审计历史对象
     *
     * @return 返回结果
     */
    @Override
    public Changes compare(ApplicationAudit audit, ProceedingJoinPoint point, Object source) {
        Object target = SpelExpressionAware.apply(point, StringUtils.hasText(audit.current()) ? audit.current() : audit.example());
        Changes event = AuditObjectTools.compare(source, target);
        optional.ifPresent(handler -> handler.process(audit,event));
        return event;
    }
}
