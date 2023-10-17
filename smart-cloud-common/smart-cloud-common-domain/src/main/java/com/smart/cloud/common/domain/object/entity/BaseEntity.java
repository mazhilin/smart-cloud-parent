package com.smart.cloud.common.domain.object.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.smart.cloud.boot.constant.Formats;
import com.smart.cloud.boot.pojo.BaseObject;
import com.smart.cloud.common.domain.Entity;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @className: com.smart.cloud.common.repository.base.entity.BaseEntity
 * @title: 封装SmartCloud项目-BaseEntity类
 * @description: <p>
 *         SmartCloud项目-BaseEntity
 *         </p>
 * @content: BaseEntity
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
public class BaseEntity extends BaseObject implements Entity {
    private static final long serialVersionUID = -1106815076521322954L;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @TableField(value = "`version`")
    private Integer version;

    /**
     * 创建人
     */
    @Getter
    @Setter
    @TableField(value = "`creator_id`", fill = FieldFill.INSERT)
    private Long creatorId;

    /**
     * 创建时间
     */
    @Getter
    @Setter
    @TableField(value = "`created_time`", fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = Formats.DATETIME)
    private Date createdTime;


    /**
     * 更新人
     */
    @Getter
    @Setter
    @TableField(value = "`updator_id`", fill = FieldFill.INSERT_UPDATE)
    private Long updatorId;


    /**
     * 更新时间
     */
    @Getter
    @Setter
    @TableField(value = "`updated_time`", fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = Formats.DATETIME)
    private Date updatedTime;

    /**
     * 逻辑删除
     */
    @Getter
    @Setter
    @TableField(value = "`deleted`")
    private Integer deleted;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @TableField(value = "`status`")
    private Integer status;

    /**
     * 备注
     */
    @Getter
    @Setter
    @TableField(value = "`remark`")
    private String remark;
}
