package com.smart.cloud.platform.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: com.smart.cloud.platform.properties.ServiceCommonProperties
 * @projectName: 封装SmartCloud项目-ServiceCommonProperties类
 * @module: SmartCloud项目-ServiceCommonProperties类，主要位于ServiceCommonProperties模块的业务场景
 * @content: ServiceCommonProperties类，主要用于完成ServiceCommonProperties的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-09-07 03:12
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = ServiceCommonProperties.PREFIX, ignoreInvalidFields = true)
public class ServiceCommonProperties {

    public static final String PREFIX = "smart.cloud.common";

    /**
     * jwt key
     */
    private String oauthJwtKey = "smart-cloud";

    /**
     * Resource配置信息
     */
    private Resource resource = new Resource();

    /**
     * Actuator配置信息
     */
    private Actuator actuator = new Actuator();

    private Regex regex = new Regex();

    @Getter
    @Setter
    public static class Resource {
        private String pattern = "/v1/*";

        private String skipPath = "/v2/choerodon/api-docs";
        /**
         * 认证头名称
         */
        private String authHeaderName = "Authorization";
    }

    @Getter
    @Setter
    public static class Actuator {

        /**
         * 权限信息配置
         */
        private Permission permission = new Permission();

        /**
         * 权限信息扫描配置信息
         *
         * @author bo.he02@hand-chian.com 2020/07/31 14:00:00
         */
        @Getter
        @Setter
        public static class Permission {
            /**
             * 是否开启权限码重复检测，默认开启
             * 配置全路径： hzero.actuator.permission.duplicatedCodeCheck
             * true     开启      如果发现权限码重复，会抛出异常，应用不能启动成功
             * false    不开启     如果发现权限码重复，会忽略重复的权限数据，并打印错误日志
             */
            private Boolean duplicated = true;
        }
    }

    /**
     * 正则表达式
     */
    @Getter
    @Setter
    public static class Regex {
        /**
         * 手机正则表达式
         */
        private String phone = "^\\d{11}$";
    }
}
