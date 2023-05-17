package com.smart.cloud.security.jsonwebtoken;

import lombok.Data;

import java.io.Serializable;

/**
 * @className: com.smart.cloud.security.jsonwebtoken.JwtUserInfo
 * @title: 封装SmartCloud项目-JwtUserInfo类
 * @description: <p>
 *         SmartCloud项目-JwtUserInfo
 *         </p>
 * @content: JwtUserInfo
 * @author: Powered by marklin
 * @datetime: 2023-05-17 00:56
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class JwtUserInfo implements Serializable {

    private static final long serialVersionUID = 6414153207560690073L;
    private String accountId;
    private String userId;
    private String username;
    private String tenantId;
    private String enterpriseCode;
    private Boolean isMain;
    private Long appId;
}
