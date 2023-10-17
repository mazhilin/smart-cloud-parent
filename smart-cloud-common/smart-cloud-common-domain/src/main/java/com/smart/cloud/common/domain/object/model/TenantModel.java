package com.smart.cloud.common.domain.object.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @className: com.smart.cloud.common.repository.base.model.TenantModel
 * @title: 封装SmartCloud项目-TenantModel类
 * @description: <p>
 *         SmartCloud项目-TenantModel
 *         </p>
 * @content: TenantModel
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:44
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class TenantModel extends BaseModel{
    private static final long serialVersionUID = -8512785775035546246L;
    /**
     * 创建人id
     */
    @Getter
    @Setter
    private Long creatorId;


    /**
     * 创建人
     */
    @Getter
    @Setter
    private Long creatorName;

    /**
     * 创建时间
     */
    @Getter
    @Setter
    private Date createdTime;


    /**
     * 更新人id
     */
    @Getter
    @Setter
    private Long updatorId;

    /**
     * 更新人
     */
    @Getter
    @Setter
    private String updatorName;

    /**
     * 更新时间
     */
    @Getter
    @Setter
    private Date updatedTime;

    /**
     * 逻辑删除
     */
    @Getter
    @Setter
    private Boolean deleted;

    /**
     * 版本号
     */
    @Getter
    @Setter
    private Integer status;

    /**
     * 备注
     */
    @Getter
    @Setter
    private String remark;
}
