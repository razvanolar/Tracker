package code.tracker.repository.jdbc;

import code.tracker.repository.jdbc.daos.AbstractDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Created by razvanolar on 16.03.2017
 */
public class JDBCUtil {

  private static String USER_PROPERTY = "user";
  private static String PASSWORD_PROPERTY = "password";
  private static String CREDENTALS_FILE = "db_credentials.txt";

  private static String DB_URL = "jdbc:mysql://localhost:3306/training";

  private static int CLOSE_ATTEMPTS = 5;

  private String user;
  private String password;

  public JDBCUtil() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    initDBCredentials();
  }

  public Connection getNewConnection() throws Exception {
    return DriverManager.getConnection(DB_URL, user, password);
  }

  public void closeConnection(Connection connection) {
    if (connection == null) {
      System.out.println("WARN: Trying to close null db connection");
      return;
    }
    closeConnection(connection, CLOSE_ATTEMPTS);
  }

  private void closeConnection(Connection connection, int attempts) {
    if (attempts <= 0) {
      System.out.println("Unable to close db connection. Please investigate the issue.");
      return;
    }
    try {
      connection.close();
    } catch (Exception e) {
      attempts--;
      System.out.println("Unable to close db connection. Attempts left: " + (attempts));
      closeConnection(connection, attempts);
    }
  }

  public void closePrepareStatement(PreparedStatement statement) {
    if (statement == null) {
      System.out.println("WARN: Trying to close null prepare statement");
      return;
    }
    closePrepareStatement(statement, CLOSE_ATTEMPTS);
  }

  private void closePrepareStatement(PreparedStatement statement, int attempts) {
    if (attempts <= 0) {
      System.out.println("Unable to close prepare statement. Please investigate the issue");
      return;
    }
    try {
      statement.close();
    } catch (Exception e) {
      attempts--;
      System.out.println("Unable to close prepare statement. Attempts left: " + attempts);
      closePrepareStatement(statement, attempts);
    }
  }

  public void closeResultSet(ResultSet rs) {
    if (rs == null) {
      System.out.println("WARN: Trying to close null result set");
      return;
    }
    closeResultSet(rs, CLOSE_ATTEMPTS);
  }

  private void closeResultSet(ResultSet rs, int attempts) {
    if (attempts <= 0) {
      System.out.println("Unable to close result set. Please investigate the issue.");
      return;
    }
    try {
      rs.close();
    } catch (Exception e) {
      attempts--;
      System.out.println("Unable to close result set. Attepts left: " + attempts);
      closeResultSet(rs, attempts);
    }
  }

  public void closeDAO(AbstractDAO dao) {
    if (dao == null) {
      System.out.println("Unable to close null dao object");
      return;
    }
    dao.close();
  }

  private void initDBCredentials() throws Exception {
    Properties p = new Properties();
    p.load(JDBCUtil.class.getResourceAsStream(CREDENTALS_FILE));

    this.user = p.getProperty(USER_PROPERTY);
    this.password = p.getProperty(PASSWORD_PROPERTY);
  }
}
