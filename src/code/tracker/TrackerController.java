package code.tracker;

import code.tracker.utils.Controller;
import code.tracker.utils.View;

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
    trackerView = new TrackerView();
  }

  @Override
  public void bind(ITrackerView view) {
    // ignore received view object, trackerView is computed internally


  }

  public View getTrackerView() {
    return trackerView;
  }
}
