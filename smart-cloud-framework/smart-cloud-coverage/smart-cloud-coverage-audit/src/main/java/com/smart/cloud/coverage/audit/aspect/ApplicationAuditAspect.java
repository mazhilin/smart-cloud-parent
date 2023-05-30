package com.smart.cloud.coverage.audit.aspect;

import com.smart.cloud.boot.aop.ApplicationAspect;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;

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

    /**
     * aspect切面-切入点
     */
    @Override
    public void aspectPoint() {

    }

    /**
     * 切面环绕通知-@Around
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    @Override
    public Object aspectAround(ProceedingJoinPoint point) throws Throwable {
        return null;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
