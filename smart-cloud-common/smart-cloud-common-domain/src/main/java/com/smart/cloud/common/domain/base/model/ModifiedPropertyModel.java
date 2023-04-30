package com.smart.cloud.common.domain.base.model;

import com.smart.cloud.common.domain.Model;
import lombok.Data;

/**
 * @className: com.smart.cloud.common.domain.base.model.ModifiedPropertyModel
 * @title: 封装SmartCloud项目-ModifiedPropertyModel类
 * @description: <p>
 *         SmartCloud项目-ModifiedPropertyModel
 *         </p>
 * @content: ModifiedPropertyModel
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:43
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class ModifiedPropertyModel implements Model {
    private static final long serialVersionUID = 904235871134904955L;
    /**
     * 发生变化的属性名称
     */
    private String propertyName;
    /**
     * 发生变化的属性注释
     */
    private String propertyComment;
    /**
     * 修改前的值
     */
    private Object oldValue;
    /**
     * 修改后的值
     */
    private Object newValue;
}
