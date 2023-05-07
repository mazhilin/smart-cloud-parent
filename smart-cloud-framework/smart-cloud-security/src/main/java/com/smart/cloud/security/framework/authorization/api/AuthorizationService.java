package com.smart.cloud.security.framework.authorization.api;

import java.util.List;

/**
 * @className: com.smart.cloud.security.framework.authorization.api.AuthorizationService
 * @title: 封装SmartCloud项目-AuthorizationService类
 * @description: <p>
 *         SmartCloud项目-AuthorizationService
 *         </p>
 * @content: AuthorizationService
 * @author: Powered by marklin
 * @datetime: 2023-05-08 04:44
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public interface AuthorizationService {
    /**
     * 创建角色
     * @param roleName 角色名
     * @param roleDesc 角色描述
     * @return long 角色ID
     */
    long createRole(String roleName, String roleDesc);

    /**
     * 删除角色
     * @param roleId 角色ID
     * @return boolean 是否删除成功
     */
    boolean deleteRole(long roleId);

    /**
     * 更新角色
     * @param roleId 角色ID
     * @param roleDesc 角色描述
     * @return boolean 是否更新成功
     */
    boolean updateRole(long roleId, String roleDesc);

    /**
     * 获取角色信息
     * @param roleId 角色ID
     * @return Role 角色信息
     */
    Object getRole(long roleId);

    /**
     * 获取所有角色的列表
     * @return List<Role> 角色列表
     */
    List<?> listRole();

    /**
     * 为用户分配角色
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return boolean 是否分配成功
     */
    boolean assignRole(long userId, long roleId);
}
