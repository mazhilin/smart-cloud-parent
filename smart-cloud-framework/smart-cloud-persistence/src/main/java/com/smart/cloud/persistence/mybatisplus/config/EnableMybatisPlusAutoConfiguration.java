package com.smart.cloud.persistence.mybatisplus.config;

import com.smart.cloud.persistence.mybatisplus.handler.MybatisMetaObjectHandler;
import com.smart.cloud.persistence.mybatisplus.resolver.SqlFilterArgumentResolver;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.util.List;


/**
 * @className: com.smart.cloud.persistence.mybatisplus.config.EnableMybatisPlusAutoConfiguration
 * @title: 封装SmartCloud项目-EnableMybatisPlusAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableMybatisPlusAutoConfiguration
 *         </p>
 * @content: EnableMybatisPlusAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-16 23:01
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
@ConditionalOnBean(DataSource.class)
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
public class EnableMybatisPlusAutoConfiguration implements WebMvcConfigurer {


    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new SqlFilterArgumentResolver());
    }

    @Bean
    public MybatisMetaObjectHandler metaObjectHandler() {
        return new MybatisMetaObjectHandler();
    }
}
