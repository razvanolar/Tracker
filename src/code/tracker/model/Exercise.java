package code.tracker.model;

/**
 * Created by razvanolar on 16.03.2017
 */
public class Exercise {

  private int id;
  private String name;

  public Exercise(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
