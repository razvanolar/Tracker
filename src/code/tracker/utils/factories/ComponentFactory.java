package code.tracker.utils.factories;

import code.tracker.utils.Component;
import code.tracker.utils.Controller;
import code.tracker.utils.View;
import code.tracker.utils.types.ComponentTypes;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ComponentFactory {

  private static ControllerFactory controllerFactory = new ControllerFactory();
  private static ViewFactory viewFactory = new ViewFactory();

  public static Component createComponent(ComponentTypes type) {
    Controller controller = controllerFactory.createController(type);
    View view = viewFactory.createView(type);
    return controller != null && view != null ? new Component(controller, view) : null;
  }
}
