package code.tracker.components.activities_layout;

import com.jfoenix.controls.JFXMasonryPane;
import javafx.scene.Node;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ActivitiesLayoutView implements ActivitiesLayoutController.IActivitiesLayoutView {

  private JFXMasonryPane activitiesPane;

  public ActivitiesLayoutView() {
    init();
  }

  private void init() {
    activitiesPane = new JFXMasonryPane();

  }

  @Override
  public Node asNode() {
    return activitiesPane;
  }
}
