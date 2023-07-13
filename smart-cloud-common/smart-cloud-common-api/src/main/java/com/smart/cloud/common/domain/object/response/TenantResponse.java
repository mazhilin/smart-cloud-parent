package com.smart.cloud.common.domain.object.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @className: com.smart.cloud.common.domain.base.response.TenantResponse
 * @title: 封装SmartCloud项目-TenantResponse类
 * @description: <p>
 *         SmartCloud项目-TenantResponse
 *         </p>
 * @content: TenantResponse
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:08
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TenantResponse extends BaseResponse {
    private static final long serialVersionUID = -7317947716780147520L;

    /**
     * 应用id
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "应用id")
    private Long appId;

    /**
     * 租户id
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "租户id")
    private Long tenantId;


    /**
     * 数据隔离id
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "数据隔离id")
    private Long isolationId;
}
