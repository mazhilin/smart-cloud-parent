package com.smart.cloud.coverage.audit.configuration;

import com.smart.cloud.coverage.audit.aspect.ApplicationAuditAspect;
import com.smart.cloud.coverage.audit.handler.ApplicationAuditHandler;
import com.smart.cloud.coverage.audit.handler.ApplicationCompareHandler;
import com.smart.cloud.coverage.audit.handler.event.ApplicationAuditEventHandler;
import com.smart.cloud.coverage.audit.support.SpelExpressionAware;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Optional;

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

    /**
     * 默认注入 javers 的比较器实现
     * @param optional 注入审计用户来源
     * @return ApplicationAuditHandler
     */
    @Bean
    @ConditionalOnMissingBean
    @SuppressWarnings("ALL")
    public ApplicationCompareHandler applicationCompare(Optional<ApplicationAuditHandler> optional){
        return new ApplicationAuditEventHandler(optional);
    }


}
