package com.smart.cloud.common.repository.object.service;


import com.smart.cloud.common.repository.Service;

/**
 * @className: com.smart.cloud.common.dao.base.service.BaseService
 * @title: 封装SmartCloud项目-BaseService类
 * @description: <p>
 *         SmartCloud项目-BaseService
 *         </p>
 * @content: BaseService
 * @author: Powered by marklin
 * @datetime: 2023-05-01 00:02
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface BaseService<T,ID>  extends Service<T> {

    /**
     * 查询详情-detail
     * @param id 参数id
     * @return 返回结果
     */
    T detail(ID id);

    /**
     * 新增数据-create
     * @param entity 参数对象
     * @return 返回结果
     */
    boolean create(T entity);

    /**
     * 删除数据-delete
     * @param id 参数id
     * @return 返回结果
     */
    boolean delete(ID id);

    /**
     * 更新数据-update
     * @param entity 参数对象
     * @return 返回结果
     */
    boolean update(T entity);
}
