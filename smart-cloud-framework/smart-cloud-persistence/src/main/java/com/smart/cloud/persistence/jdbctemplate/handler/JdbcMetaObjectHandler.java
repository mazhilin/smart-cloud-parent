package com.smart.cloud.persistence.jdbctemplate.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.persistence.jdbctemplate.handler.JdbcMetaObjectHandler
 * @title: 封装SmartCloud项目-JdbcMetaObjectHandler类
 * @description: <p>
 *         SmartCloud项目-JdbcMetaObjectHandler
 *         </p>
 * @content: JdbcMetaObjectHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-16 02:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class JdbcMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
