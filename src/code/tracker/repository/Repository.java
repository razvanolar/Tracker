package code.tracker.repository;

import code.tracker.model.Exercise;
import code.tracker.repository.jdbc.JDBCUtil;
import code.tracker.repository.jdbc.daos.ExerciseDAO;

import java.sql.Connection;
import java.util.List;

/**
 * Created by razvanolar on 16.03.2017
 */
public class Repository {

  private JDBCUtil jdbcUtil;

  public Repository() throws Exception {
    this.jdbcUtil = new JDBCUtil();
  }

  public List<Exercise> getAllExercises() throws Exception {
    ExerciseDAO dao = null;
    try {
      dao = new ExerciseDAO(jdbcUtil);
      return dao.getAllExercises();
    } finally {
      jdbcUtil.closeDAO(dao);
    }
  }

  public void testConnection() throws Exception {
    Connection connection = null;
    try {
      connection = jdbcUtil.getNewConnection();
    } finally {
      jdbcUtil.closeConnection(connection);
    }
  }
}
