package code.tracker.utils.factories;

import code.tracker.components.activities_layout.ActivitiesLayoutController;
import code.tracker.utils.Controller;
import code.tracker.utils.types.ComponentTypes;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ControllerFactory {

  public Controller createController(ComponentTypes type) {
    switch (type) {
      case ACTIVITIES_LAYOUT:
        return new ActivitiesLayoutController();
    }
    return null;
  }
}
