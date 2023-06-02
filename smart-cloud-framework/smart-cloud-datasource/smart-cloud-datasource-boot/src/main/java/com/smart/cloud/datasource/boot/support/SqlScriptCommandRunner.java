package com.smart.cloud.datasource.boot.support;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

/**
 * @className: com.smart.cloud.datasource.boot.support.SqlScriptCommandRunner
 * @title: 封装SmartCloud项目-SqlScriptCommandRunner类
 * @description: <p>
 *         SmartCloud项目-SqlScriptCommandRunner
 *         </p>
 * @content: SqlScriptCommandRunner
 * @author: Powered by marklin
 * @datetime: 2023-06-03 01:49
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Slf4j
@AllArgsConstructor
public class SqlScriptCommandRunner {

    /**
     * 错误是否继续
     */
    private final boolean continueOnError;
    /**
     * 分隔符
     */
    private final String separator;

    /**
     * 执行数据库脚本
     *
     * @param dataSource 连接池
     * @param location   脚本位置
     */
    public void executeScript(DataSource dataSource, String location) {
        if (StringUtils.hasText(location)) {
            ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
            populator.setContinueOnError(continueOnError);
            populator.setSeparator(separator);
            try {
                ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
                populator.addScripts(resolver.getResources(location));
                DatabasePopulatorUtils.execute(populator, dataSource);
            } catch (DataAccessException e) {
                log.warn("execute sql error", e);
            } catch (Exception e1) {
                log.warn("failed to initialize dataSource from schema file {} ", location, e1);
            }
        }
    }
}
