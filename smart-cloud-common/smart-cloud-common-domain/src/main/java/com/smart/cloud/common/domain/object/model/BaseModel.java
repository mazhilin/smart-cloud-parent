package com.smart.cloud.common.domain.object.model;

import com.smart.cloud.boot.pojo.BaseObject;
import com.smart.cloud.common.domain.Model;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @className: com.smart.cloud.common.domain.base.model.BaseModel
 * @title: 封装SmartCloud项目-BaseModel类
 * @description: <p>
 *         SmartCloud项目-BaseModel
 *         </p>
 * @content: BaseModel
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class BaseModel extends BaseObject implements Model {
    private static final long serialVersionUID = 9093126035745004689L;
    /**
     * appId
     */
    @Getter
    @Setter
    private Long appId;

    /**
     * 租户id
     */
    @Getter
    @Setter
    private String tenantId;

    /**
     * 隔离id
     */
    @Getter
    @Setter
    private String isolationId;

    /**
     * 版本号
     */
    @Getter
    @Setter
    private Integer version;
}
