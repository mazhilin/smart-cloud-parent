package com.smart.cloud.coverage.audit.configuration;

import com.smart.cloud.coverage.audit.aspect.ApplicationAuditAspect;
import com.smart.cloud.coverage.audit.support.SpelExpressionAware;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @className: com.smart.cloud.coverage.audit.configuration.EnableAuditAutoConfiguration
 * @title: 封装CoocaaCloud项目-EnableAuditAutoConfiguration类
 * @description: <p>
 *         CoocaaCloud项目-EnableAuditAutoConfiguration
 *         </p>
 * @content: EnableAuditAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-31 00:21
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 CoocaaCloud Systems Incorporated. All rights reserved.
 */
@EnableAsync
@EnableAutoConfiguration
@Import({ ApplicationAuditAspect.class, SpelExpressionAware.class})
public class EnableAuditAutoConfiguration {
}
