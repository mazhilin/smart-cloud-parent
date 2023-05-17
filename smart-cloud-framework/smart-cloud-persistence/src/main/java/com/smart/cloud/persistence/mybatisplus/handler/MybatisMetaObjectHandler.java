package com.smart.cloud.persistence.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

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
    @Override
    public void insertFill(MetaObject metaObject) {

    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
