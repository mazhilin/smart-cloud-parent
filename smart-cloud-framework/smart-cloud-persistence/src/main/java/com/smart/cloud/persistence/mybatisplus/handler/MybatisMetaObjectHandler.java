package com.smart.cloud.persistence.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.smart.cloud.boot.extension.AppRuntimeEnvironment;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @className: com.smart.cloud.persistence.mybatisplus.handler.MybatisMetaObjectHandler
 * @title: 封装SmartCloud项目-MybatisMetaObjectHandler类
 * @description: <p>
 *         SmartCloud项目-MybatisMetaObjectHandler
 *         </p>
 * @content: MybatisMetaObjectHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-16 01:57
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class MybatisMetaObjectHandler implements MetaObjectHandler {

    @Autowired
    protected AppRuntimeEnvironment environment;


    @Override
    public void insertFill(MetaObject metaObject) {
        setFieldValByName("createdTime", new Date(), metaObject);
        if (environment.getUserId() != null) {
            setFieldValByName("creator_id", environment.getUserId().toString(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updatedTime", new Date(), metaObject);
        if (environment.getUserId() != null) {
            setFieldValByName("updator_id", environment.getUserId().toString(), metaObject);
        }
    }
}
