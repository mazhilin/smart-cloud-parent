package com.smart.cloud.datasource.boot.aspect;

import com.smart.cloud.datasource.boot.annotation.DynamicDatasourceTransactional;
import com.smart.cloud.datasource.boot.transaction.TransactionalExecutor;
import com.smart.cloud.datasource.boot.transaction.TransactionTemplate;
import com.smart.cloud.datasource.boot.utils.TransactionInfo;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @className: com.smart.cloud.datasource.boot.aspect.DynamicDatasourceTransactionInterceptor
 * @title: 封装SmartCloud项目-DynamicDatasourceTransactionInterceptor类
 * @description: <p>
 *         SmartCloud项目-DynamicDatasourceTransactionInterceptor
 *         </p>
 * @content: DynamicDatasourceTransactionInterceptor
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:24
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class DynamicDatasourceTransactionInterceptor implements MethodInterceptor {
    private final TransactionTemplate template = new TransactionTemplate();

    @Override
    public Object invoke(final MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        final DynamicDatasourceTransactional transaction = method.getAnnotation(DynamicDatasourceTransactional.class);

        TransactionalExecutor transactionalExecutor = new TransactionalExecutor() {
            @Override
            public Object execute() throws Throwable {
                return methodInvocation.proceed();
            }

            @Override
            public TransactionInfo getTransactionInfo() {
                TransactionInfo transactionInfo = new TransactionInfo();
                transactionInfo.setPropagation(transaction.propagation());
                transactionInfo.setNoRollbackFor(transaction.noRollbackFor());
                transactionInfo.setRollbackFor(transaction.rollbackFor());
                return transactionInfo;
            }
        };
        return template.execute(transactionalExecutor);
    }
}
