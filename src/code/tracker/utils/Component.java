package code.tracker.utils;

/**
 * Created by razvanolar on 16.03.2017
 */
public class Component {

  private Controller controller;
  private View view;

  @SuppressWarnings("unchecked")
  public Component(Controller controller, View view) {
    this.controller = controller;
    this.view = view;
    this.controller.bind(view);
  }

  public Controller getController() {
    return controller;
  }

  public View getView() {
    return view;
  }
}
