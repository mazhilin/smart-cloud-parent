package com.smart.cloud.common.domain.repository.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smart.cloud.boot.extension.AppRuntimeEnvironment;
import com.smart.cloud.common.domain.repository.mapper.BaseMapper;
import com.smart.cloud.common.domain.repository.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

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
public class BaseServiceImpl<M extends BaseMapper<T>, T, ID> extends ServiceImpl<M, T> implements BaseService<T,ID> {
    @Autowired
    private AppRuntimeEnvironment environment;

    @Resource
    protected M baseMapper;

    /**
     * 查询详情-detail
     * @param id 参数id
     * @return 返回结果
     */
    @Override
    public T detail(ID id) {
        return this.baseMapper.selectById((Serializable) id);
    }

    /**
     * 新增数据-create
     * @param entity 参数对象
     * @return 返回结果
     */
    @Override
    public boolean create(T entity) {
        return this.baseMapper.insert(entity) > 0;
    }

    /**
     * 删除数据-delete
     * @param id 参数id
     * @return 返回结果
     */
    @Override
    public boolean delete(ID id) {
        return this.baseMapper.deleteById((Serializable) id) > 0;
    }

    /**
     * 更新数据-update
     * @param entity 参数对象
     * @return 返回结果
     */
    @Override
    public boolean update(T entity) {
        return this.baseMapper.updateById(entity) > 0;
    }
}
