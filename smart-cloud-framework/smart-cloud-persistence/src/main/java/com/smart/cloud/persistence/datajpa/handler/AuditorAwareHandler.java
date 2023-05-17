package com.smart.cloud.persistence.datajpa.handler;

import com.smart.cloud.boot.extension.AppRuntimeEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @className: com.smart.cloud.persistence.datajpa.handler.AuditorAwareHandler
 * @title: 封装SmartCloud项目-AuditorAwareHandler类
 * @description: <p>
 *         SmartCloud项目-AuditorAwareHandler
 *         </p>
 * @content: AuditorAwareHandler
 * @author: Powered by marklin
 * @datetime: 2023-05-18 03:43
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
public class AuditorAwareHandler implements AuditorAware<Long> {
    @Autowired
    protected AppRuntimeEnvironment environment;

    @Override
    public Optional<Long> getCurrentAuditor() {
        if (environment.getUserId()==null){
            return Optional.empty();
        }else {
            return Optional.of(environment.getUserId());
        }
    }
}
