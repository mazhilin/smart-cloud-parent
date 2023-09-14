package com.smart.cloud.coverage.logger.storage.annotation;

import com.smart.cloud.coverage.boot.enums.logger.StorageSchemas;

import java.lang.annotation.*;

/**
 * @className: com.smart.cloud.coverage.logger.storage.annotation.StorageSchemaAnnotation
 * @projectName: 封装Smart项目-StorageSchemaAnnotation类
 * @module: Smart项目-StorageSchemaAnnotation类，主要位于StorageSchemaAnnotation模块的业务场景
 * @content: StorageSchemaAnnotation类，主要用于完成StorageSchemaAnnotation的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-15 02:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 Smart Systems Incorporated. All rights reserved.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface StorageSchemaAnnotation {
    StorageSchemas listType() default StorageSchemas.LS;
}
