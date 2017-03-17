package code.tracker.repository.jdbc.daos;

import code.tracker.model.Exercise;
import code.tracker.repository.jdbc.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ExerciseDAO extends AbstractDAO {

  public ExerciseDAO(JDBCUtil jdbcUtil) throws Exception {
    super(jdbcUtil);
  }

  public List<Exercise> getAllExercises() throws Exception {
    PreparedStatement statement = null;
    ResultSet rs = null;
    try {
      String query = "SELECT * FROM exercises";
      statement = connection.prepareStatement(query);
      rs = statement.executeQuery();
      List<Exercise> result = new ArrayList<>();
      while (rs.next()) {
        result.add(new Exercise(rs.getInt(1), rs.getString(2)));
      }
      return result;
    } finally {
      jdbcUtil.closeResultSet(rs);
      jdbcUtil.closePrepareStatement(statement);
    }
  }
}
