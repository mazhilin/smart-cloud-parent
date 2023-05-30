package com.smart.cloud.coverage.audit.support;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @className: com.smart.cloud.coverage.audit.support.ApplicationExpressionAware
 * @title: 封装SmartCloud项目-ApplicationExpressionAware类
 * @description: <p>
 *         SmartCloud项目-ApplicationExpressionAware
 *         </p>
 * @content: ApplicationExpressionAware
 * @author: Powered by marklin
 * @datetime: 2023-05-31 02:30
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@SuppressWarnings("ALL")
public class SpelExpressionAware implements ApplicationContextAware {
    protected static final SpelExpressionParser parser = new SpelExpressionParser();

    protected static ApplicationContext application;

    public static Object apply(ProceedingJoinPoint point, String spel) {
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setBeanResolver(new BeanFactoryResolver(application));
        for (int index = 0, size = point.getArgs().length; index < size; index++) {
            String paramName = ((MethodSignature) point.getSignature()).getParameterNames()[index];
            context.setVariable(paramName, point.getArgs()[index]);
        }
        return parser.parseExpression(spel).getValue(context);
    }

    @Override
    public void setApplicationContext(ApplicationContext application) throws BeansException {
        SpelExpressionAware.application = application;
    }
}
