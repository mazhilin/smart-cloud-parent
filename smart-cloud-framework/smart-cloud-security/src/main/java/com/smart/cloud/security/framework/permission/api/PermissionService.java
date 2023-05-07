package com.smart.cloud.security.framework.permission.api;

/**
 * @className: com.smart.cloud.security.framework.permission.api.PermissionService
 * @title: 封装SmartCloud项目-PermissionService类
 * @description: <p>
 *         SmartCloud项目-PermissionService
 *         </p>
 * @content: PermissionService
 * @author: Powered by marklin
 * @datetime: 2023-05-08 04:48
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface PermissionService {
    /**
     * 为角色分配资源权限
     * @param roleId 角色ID
     * @param resourceId 资源ID
     * @return boolean 是否分配成功
     */
    boolean assignResourcePermission(long roleId, long resourceId);

    /**
     * 为角色分配数据权限
     * @param roleId 角色ID
     * @param dataId 数据ID
     * @return boolean 是否分配成功
     */
    boolean assignDataPermission(long roleId, long dataId);
}
