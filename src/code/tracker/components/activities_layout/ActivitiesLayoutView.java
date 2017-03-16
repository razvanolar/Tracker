package code.tracker.components.activities_layout;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ActivitiesLayoutView implements ActivitiesLayoutController.IActivitiesLayoutView {

  private BorderPane mainContainer;

  public ActivitiesLayoutView() {
    init();
  }

  private void init() {
    mainContainer = new BorderPane(new Label("Activities Panel"));
  }

  @Override
  public Node asNode() {
    return mainContainer;
  }
}
