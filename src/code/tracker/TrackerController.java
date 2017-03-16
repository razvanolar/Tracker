package code.tracker;

import code.tracker.utils.Component;
import code.tracker.utils.Controller;
import code.tracker.utils.View;
import code.tracker.utils.factories.ComponentFactory;
import code.tracker.utils.types.ComponentTypes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by razvanolar on 06.03.2017
 */
public class TrackerController implements Controller<TrackerController.ITrackerView> {

  interface ITrackerView extends View {

  }

  private ITrackerView trackerView;

  public TrackerController() throws Exception {
    init();
  }

  private void init() throws Exception {
    Map<ComponentTypes, Component> componentsMap = new HashMap<>();
    for (ComponentTypes type : ComponentTypes.mainTypes()) {
      Component component = ComponentFactory.createComponent(type);
      if (component != null)
        componentsMap.put(type, component);
      else
        System.out.println("[UI_ERROR] Unable to instantiate " + type.name());
    }
    trackerView = new TrackerView(componentsMap);
  }

  @Override
  public void bind(ITrackerView view) {
    // ignore received view object, trackerView is computed internally


  }

  public View getTrackerView() {
    return trackerView;
  }
}
