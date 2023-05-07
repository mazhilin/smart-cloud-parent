package com.smart.cloud.security.config.shiro;

import com.smart.cloud.security.properties.SmartCloudSecurityProperties;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @className: com.smart.cloud.security.config.shiro.ApplicationShiroConfig
 * @title: 封装SmartCloud项目-ApplicationShiroConfig类
 * @description: <p>
 *         SmartCloud项目-ApplicationShiroConfig
 *         </p>
 * @content: ApplicationShiroConfig
 * @author: Powered by marklin
 * @datetime: 2023-05-07 21:08
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Configuration
@ConditionalOnClass({Realm.class, IniRealm.class})
@EnableConfigurationProperties(SmartCloudSecurityProperties.class)
public class ApplicationShiroConfig {

    private final SmartCloudSecurityProperties securityProperties;

    public ApplicationShiroConfig(SmartCloudSecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public DefaultWebSecurityManager webSecurityConfig() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // securityManager.setRealm(new ShiroRealm(securityProperties));
        securityManager.setSessionManager(sessionManager());
        securityManager.setCacheManager(cacheManager());
        return securityManager;
    }

    @Bean
    @ConditionalOnMissingBean
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager) {
        SmartCloudSecurityProperties.Shiro shiro = securityProperties.getShiro();

        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);

        Map<String, Filter> filters = new LinkedHashMap<>();
        if (shiro.getRememberMeEnabled()) {
            // filters.put("rememberMe", new CookieRememberMeFilter());
        }
        shiroFilter.setFilters(filters);

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilter;
    }

    @Bean
    @ConditionalOnMissingBean
    public SessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(1800000);
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        return sessionManager;
    }

    @Bean
    @ConditionalOnMissingBean
    public CacheManager cacheManager() {
        return null;
    }
}
