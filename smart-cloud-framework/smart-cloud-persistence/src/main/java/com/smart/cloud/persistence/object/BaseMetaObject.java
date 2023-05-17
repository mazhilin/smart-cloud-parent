package com.smart.cloud.persistence.object;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.smart.cloud.boot.constant.Formats;
import com.smart.cloud.boot.pojo.BaseObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @className: com.smart.cloud.persistence.object.BaseMetaObject
 * @title: 封装SmartCloud项目-BaseMetaObject类
 * @description: <p>
 *         SmartCloud项目-BaseMetaObject
 *         </p>
 * @content: BaseMetaObject
 * @author: Powered by marklin
 * @datetime: 2023-05-18 03:15
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class BaseMetaObject extends BaseObject {
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
}
