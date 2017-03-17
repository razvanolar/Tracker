package code.tracker.repository.jdbc.daos;

import code.tracker.repository.jdbc.JDBCUtil;

import java.sql.Connection;

/**
 * Created by razvanolar on 16.03.2017
 */
public abstract class AbstractDAO {

  protected Connection connection;
  protected JDBCUtil jdbcUtil;

  public AbstractDAO(JDBCUtil jdbcUtil) throws Exception {
    this.jdbcUtil = jdbcUtil;
    this.connection = jdbcUtil.getNewConnection();
  }

  public void close() {
    jdbcUtil.closeConnection(connection);
  }
}
