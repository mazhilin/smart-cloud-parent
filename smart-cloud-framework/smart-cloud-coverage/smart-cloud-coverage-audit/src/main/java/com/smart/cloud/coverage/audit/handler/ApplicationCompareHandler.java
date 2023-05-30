package com.smart.cloud.coverage.audit.handler;

import com.smart.cloud.coverage.audit.annotation.ApplicationAudit;
import org.aspectj.lang.ProceedingJoinPoint;
import org.javers.core.Changes;

/**
 * @className: com.smart.cloud.coverage.audit.handler.ApplicationCompareHandler
 * @title: 封装SmartCloud项目-ApplicationCompareHandler类
 * @description: <p>
 *         SmartCloud项目-ApplicationCompareHandler
 *         </p>
 * @content: ApplicationCompareHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-31 01:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@FunctionalInterface
public interface ApplicationCompareHandler {

    /**
     * 审计对象变更历史
     * @param audit 应用注解类
     * @param point 应用切入点
     * @param source 审计历史对象
     * @return 返回结果
     */
    Changes compare(ApplicationAudit audit, ProceedingJoinPoint point, Object source);
}
