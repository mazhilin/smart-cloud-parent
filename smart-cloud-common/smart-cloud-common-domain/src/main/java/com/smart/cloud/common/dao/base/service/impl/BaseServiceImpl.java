package com.smart.cloud.common.dao.base.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smart.cloud.boot.extension.AppRuntimeEnvironment;
import com.smart.cloud.common.dao.base.mapper.BaseMapper;
import com.smart.cloud.common.dao.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.common.dao.base.service.impl.BaseServiceImpl
 * @title: 封装SmartCloud项目-BaseServiceImpl类
 * @description: <p>
 *         SmartCloud项目-BaseServiceImpl
 *         </p>
 * @content: BaseServiceImpl
 * @author: Powered by marklin
 * @datetime: 2023-05-01 00:04
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {
    @Autowired
    private AppRuntimeEnvironment environment;
}
