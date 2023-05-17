package com.smart.cloud.persistence.datajpa.config;

import com.smart.cloud.persistence.datajpa.handler.AuditorAwareHandler;
import com.smart.cloud.persistence.datajpa.handler.DataJpaMetaObjectHandler;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @className: com.smart.cloud.persistence.datajpa.config.EnableDataJpaAutoConfiguration
 * @title: 封装SmartCloud项目-EnableDataJpaAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableDataJpaAutoConfiguration
 *         </p>
 * @content: EnableDataJpaAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-16 22:07
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
@EnableJpaAuditing
public class EnableDataJpaAutoConfiguration {

    @Bean
    public AuditorAware<Long> auditorAware() {
        return new AuditorAwareHandler();
    }


    @Bean
    public AuditingEntityListener entityListener(){
        return new DataJpaMetaObjectHandler();
    }
}
