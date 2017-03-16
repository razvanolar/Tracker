package code.tracker.repository.jdbc;

/**
 * Created by razvanolar on 16.03.2017
 */
public class JDBCUtil {

  public JDBCUtil() throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
  }
}
