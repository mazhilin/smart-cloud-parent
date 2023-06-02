package com.smart.cloud.datasource.boot.dynamic;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 * @packageName com.smart.cloud.datasource.boot.dynamic.AbstractDatasource
 * @projectName: SmartCloud
 * @className: AbstractDatasource
 * @title: 封装SmartCloud项目-AbstractDatasource类
 * @content: AbstractDatasource
 * @description: SmartCloud项目-AbstractDatasource类,主要用作AbstractDatasource。
 * @author: Powered by Marklin
 * @datetime: 2023-06-02 12:31
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public abstract class AbstractDatasource implements DataSource {

  /** Returns 0, indicating the default system timeout is to be used. */
  @Override
  public int getLoginTimeout() throws SQLException {
    return 0;
  }

  /** Setting a login timeout is not supported. */
  @Override
  public void setLoginTimeout(int timeout) throws SQLException {
    throw new UnsupportedOperationException("setLoginTimeout");
  }

  /** LogWriter methods are not supported. */
  @Override
  public PrintWriter getLogWriter() {
    throw new UnsupportedOperationException("getLogWriter");
  }

  /** LogWriter methods are not supported. */
  @Override
  public void setLogWriter(PrintWriter pw) throws SQLException {
    throw new UnsupportedOperationException("setLogWriter");
  }

  // ---------------------------------------------------------------------
  // Implementation of JDBC 4.0's Wrapper interface
  // ---------------------------------------------------------------------

  @Override
  @SuppressWarnings("unchecked")
  public <T> T unwrap(Class<T> instance) throws SQLException {
    if (instance.isInstance(this)) {
      return (T) this;
    }
    throw new SQLException(
        "DataSource of type ["
            + getClass().getName()
            + "] cannot be unwrapped as ["
            + instance.getName()
            + "]");
  }

  @Override
  public boolean isWrapperFor(Class<?> instance) throws SQLException {
    return instance.isInstance(this);
  }

  // ---------------------------------------------------------------------
  // Implementation of JDBC 4.1's getParentLogger method
  // ---------------------------------------------------------------------

  @Override
  public Logger getParentLogger() {
    return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  }
}
