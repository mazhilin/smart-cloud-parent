package com.smart.cloud.common.dao.base.mapper;


import com.smart.cloud.common.dao.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className: com.smart.cloud.common.dao.base.mapper.BaseMapper
 * @title: 封装SmartCloud项目-BaseMapper类
 * @description: <p>
 *         SmartCloud项目-BaseMapper
 *         </p>
 * @content: BaseMapper
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:59
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface BaseMapper<T> extends Mapper<T> {


    /**
     * 批量插入-batchInsert
     * @param list  参数列表
     * @return 返回结果
     */
    int batchInsert(@Param("list") List<T> list);
    
    /**
     * 批量更新-batchUpdate
     * @param list  参数列表
     * @return 返回结果
     */
    int batchUpdate(@Param("list") List<T> list);

    /**
     * 批量删除-batchDelete
     * @param ids  参数列表
     * @return 返回结果
     */
    int batchDelete(@Param("ids") List<Long> ids);

}
