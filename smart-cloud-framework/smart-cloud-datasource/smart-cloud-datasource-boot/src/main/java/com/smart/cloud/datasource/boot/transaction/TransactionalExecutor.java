package com.smart.cloud.datasource.boot.transaction;

import com.smart.cloud.datasource.boot.utils.TransactionInfo;

/**
 * @className: com.smart.cloud.datasource.boot.transaction.TransactionalExecutor
 * @title: 封装SmartCloud项目-TransactionalExecutor类
 * @description: <p>
 *         SmartCloud项目-TransactionThreadExecutor
 *         </p>
 * @content: TransactionThreadExecutor
 * @author: Powered by marklin
 * @datetime: 2023-06-06 00:44
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface TransactionalExecutor {

    Object execute() throws Throwable;

    TransactionInfo getTransactionInfo();
}
