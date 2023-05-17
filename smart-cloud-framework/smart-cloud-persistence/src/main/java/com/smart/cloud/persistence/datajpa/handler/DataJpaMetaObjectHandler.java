package com.smart.cloud.persistence.datajpa.handler;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.persistence.datajpa.handler.DataJpaMetaObjectHandler
 * @title: 封装SmartCloud项目-DataJpaMetaObjectHandler类
 * @description: <p>
 *         SmartCloud项目-DataJpaMetaObjectHandler
 *         </p>
 * @content: DataJpaMetaObjectHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-16 02:11
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */

@Component
public class DataJpaMetaObjectHandler extends AuditingEntityListener {
    public DataJpaMetaObjectHandler() {
        super();
    }

    @Override
    public void setAuditingHandler(ObjectFactory<AuditingHandler> auditingHandler) {
        super.setAuditingHandler(auditingHandler);
    }

    @Override
    public void touchForCreate(Object target) {
        super.touchForCreate(target);
    }

    @Override
    public void touchForUpdate(Object target) {
        super.touchForUpdate(target);
    }
}
