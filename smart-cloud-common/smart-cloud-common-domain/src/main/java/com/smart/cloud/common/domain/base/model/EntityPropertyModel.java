package com.smart.cloud.common.domain.base.model;

import com.smart.cloud.common.domain.Model;
import lombok.Data;

/**
 * @className: com.smart.cloud.common.domain.base.model.EntityPropertyModel
 * @title: 封装SmartCloud项目-EntityPropertyModel类
 * @description: <p>
 *         SmartCloud项目-EntityPropertyModel
 *         </p>
 * @content: EntityPropertyModel
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:41
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Data
public class EntityPropertyModel  implements Model {

    private static final long serialVersionUID = -4654736476635452397L;
    /**
     * 属性名称
     */
    private String propertyName;
    /**
     * 属性注释
     */
    private String propertyComment;
    /**
     * 属性值
     */
    private Object value;
    /**
     * 返回值类型
     */
    private Class<?> returnType;
}
