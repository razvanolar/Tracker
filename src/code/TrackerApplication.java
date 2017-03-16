package code;

import code.tracker.TrackerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TrackerApplication extends Application {

  private Scene scene;

  @Override
  public void init() throws Exception {
    BorderPane mainContainer = new BorderPane();
    try {
      TrackerController trackerController = new TrackerController();
      trackerController.bind(null);
      mainContainer.setCenter(trackerController.getTrackerView().asNode());
    } catch (Exception e) {
      e.printStackTrace();
    }
    scene = new Scene(mainContainer, 600, 350);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true);
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
