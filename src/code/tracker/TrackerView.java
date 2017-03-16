package code.tracker;

import code.tracker.utils.Component;
import code.tracker.utils.View;
import code.tracker.utils.types.ComponentTypes;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import java.util.Map;

/**
 * Created by razvanolar on 06.03.2017
 */
public class TrackerView implements TrackerController.ITrackerView {

  private BorderPane mainContainer;

  public TrackerView(Map<ComponentTypes, Component> componentsMap) {
    init(componentsMap);
  }

  private void init(Map<ComponentTypes, Component> componentsMap) {
    mainContainer = new BorderPane();
    View activitiesLayout = componentsMap.get(ComponentTypes.ACTIVITIES_LAYOUT).getView();

    mainContainer.setCenter(activitiesLayout.asNode());
  }

  @Override
  public Node asNode() {
    return mainContainer;
  }
}
