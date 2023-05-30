package com.smart.cloud.coverage.audit.aspect;

import com.smart.cloud.boot.aop.ApplicationAspect;
import com.smart.cloud.coverage.audit.annotation.ApplicationAudit;
import com.smart.cloud.coverage.audit.handler.ApplicationCompareHandler;
import com.smart.cloud.coverage.audit.support.SpelExpressionAware;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * @className: com.smart.cloud.coverage.audit.aspect.ApplicationAuditAspect
 * @title: 封装SmartCloud项目-ApplicationAuditAspect类
 * @description: <p>
 *         SmartCloud项目-ApplicationAuditAspect
 *         </p>
 * @content: ApplicationAuditAspect
 * @author: Powered by marklin
 * @datetime: 2023-05-31 00:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@Aspect
@RequiredArgsConstructor
@Lazy(false)
public class ApplicationAuditAspect implements ApplicationAspect {

    protected final ApplicationCompareHandler applicationCompare;
    /**
     * aspect切面-切入点
     */
    @Override
    @Pointcut("@annotation(com.smart.cloud.coverage.audit.annotation.ApplicationAudit) || " +
            "@within(com.smart.cloud.coverage.audit.annotation.ApplicationAudit)")
    public void aspectPoint() {

    }

    /**
     * 切面环绕通知-@Around
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    @Override
    @Around("aspectPoint()")
    public Object aspectAround(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        ApplicationAudit audit = method.getAnnotation(ApplicationAudit.class);
        if (audit == null) {
            audit = method.getDeclaringClass().getAnnotation(ApplicationAudit.class);
        }
        Object target = SpelExpressionAware.apply(point, StringUtils.hasText(audit.history()) ? audit.history() : audit.example());
        Object result = point.proceed();
        applicationCompare.compare(audit,point,target);
        return result;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
