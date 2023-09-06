package com.smart.cloud.boot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * @className: com.smart.cloud.boot.Aspect
 * @title: Aspect
 * @description: 封装Pivotal项目Aspect类
 *  <p>
 *     SmartCloud项目通用切面Aspect类
 *  </p>
 * @content: //TODO
 * @author: marklin
 * @datetime: 2023/4/26 02:37
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 Pivotal Cloud Systems Incorporated. All rights reserved.
 */
public interface Aspect extends Ordered {
    /**
     * 切面环绕通知-@Around
     *
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    default Object aspectAround(ProceedingJoinPoint point) throws Throwable {
        return null;
    }

    /**
     * 切面切入之前-@Before
     *
     * @param point 切入点
     * @return 返回结果
     * @throws Throwable 异常消息
     */
    default void aspectBefore(JoinPoint point) throws Throwable {
    }


    /**
     * 切面切入之后(返回)-@AfterReturning
     *
     * @param object 返回对象
     */
    default void aspectReturn(Object object) {
    }

    /**
     * 切面切入之后(错误)-@AfterThrowing
     *
     * @param exception 返回对象
     */
    default void aspectError(Throwable exception) {
    }

    /**
     * 切面切入之后-@After
     *
     * @throws Throwable 异常消息
     */
    default void aspectAfter() throws Throwable {
    }
}
