package com.smart.cloud.security.resource.api;

import java.util.List;

/**
 * @className: com.smart.cloud.security.resource.api.ResourcesService
 * @title: 封装SmartCloud项目-ResourcesService类
 * @description: <p>
 *         SmartCloud项目-ResourcesService
 *         </p>
 * @content: ResourcesService
 * @author: Powered by marklin
 * @datetime: 2023-05-08 04:49
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface ResourcesService {
    /**
     * 创建一个资源
     * @param resourceName 资源名
     * @param resourceDesc 资源描述
     * @return long 资源ID
     */
    long createResource(String resourceName, String resourceDesc);

    /**
     * 删除一个资源
     * @param resourceId 资源ID
     * @return boolean 是否删除成功
     */
    boolean deleteResource(long resourceId);

    /**
     * 更新一个资源
     * @param resourceId 资源ID
     * @param resourceDesc 资源描述
     * @return boolean 是否更新成功
     */
    boolean updateResource(long resourceId, String resourceDesc);

    /**
     * 获取一个资源的信息
     * @param resourceId 资源ID
     * @return Resource 资源信息
     */
    Object getResource(long resourceId);

    /**
     * 获取所有资源的列表
     * @return List<Resource> 资源列表
     */
    List<?> listResource();
}
