package com.smart.cloud.persistence.jdbctemplate.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @className: com.smart.cloud.persistence.jdbctemplate.config.EnableJdbcTemplateAutoConfiguration
 * @title: 封装SmartCloud项目-EnableJdbcTemplateAutoConfiguration类
 * @description: <p>
 *         SmartCloud项目-EnableJdbcTemplateAutoConfiguration
 *         </p>
 * @content: EnableJdbcTemplateAutoConfiguration
 * @author: Powered by marklin
 * @datetime: 2023-05-16 23:13
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@EnableAutoConfiguration
public class EnableJdbcTemplateAutoConfiguration {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
