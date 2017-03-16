package code.tracker;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

/**
 * Created by razvanolar on 06.03.2017
 */
public class TrackerView implements TrackerController.ITrackerView {

  private BorderPane mainContainer;

  public TrackerView() {
    init();
  }

  private void init() {
    mainContainer = new BorderPane();
  }

  @Override
  public Node asNode() {
    return mainContainer;
  }
}
