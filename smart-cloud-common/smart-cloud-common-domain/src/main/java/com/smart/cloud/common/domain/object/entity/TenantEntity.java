package com.smart.cloud.common.domain.object.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @className: com.smart.cloud.common.domain.base.entity.TenantEntity
 * @title: 封装SmartCloud项目-TenantEntity类
 * @description: <p>
 *         SmartCloud项目-TenantEntity
 *         </p>
 * @content: TenantEntity
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:39
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantEntity extends BaseEntity {
    private static final long serialVersionUID = -2907787488044353970L;
    /**
     * appId
     */
    @Getter
    @Setter
    @TableField(value = "`app_id`")
    private Long appId;

    /**
     * 租户id
     */
    @Getter
    @Setter
    @TableField(value = "`tenant_id`")
    private String tenantId;

    /**
     * 隔离id
     */
    @Getter
    @Setter
    @TableField(value = "`isolation_id`")
    private String isolationId;
}
