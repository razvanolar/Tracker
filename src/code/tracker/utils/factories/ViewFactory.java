package code.tracker.utils.factories;

import code.tracker.components.activities_layout.ActivitiesLayoutView;
import code.tracker.utils.View;
import code.tracker.utils.types.ComponentTypes;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ViewFactory {

  public View createView(ComponentTypes type) {
    switch (type) {
      case ACTIVITIES_LAYOUT:
        return new ActivitiesLayoutView();
    }
    return null;
  }
}
