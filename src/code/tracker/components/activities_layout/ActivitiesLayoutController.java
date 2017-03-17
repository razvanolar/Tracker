package code.tracker.components.activities_layout;

import code.tracker.EventBus;
import code.tracker.events.ShowExercisesEvent;
import code.tracker.events.ShowExercisesEventHandler;
import code.tracker.model.Exercise;
import code.tracker.utils.Controller;
import code.tracker.utils.View;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.List;
import java.util.Random;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ActivitiesLayoutController implements Controller<ActivitiesLayoutController.IActivitiesLayoutView> {

  public interface IActivitiesLayoutView extends View {
    Pane getActivitiesPane();
  }

  @Override
  public void bind(IActivitiesLayoutView view) {

    EventBus.addHandler(ShowExercisesEvent.TYPE, (ShowExercisesEventHandler) event -> {
      Random rand = new Random();
      List<Exercise> exercises = event.getExercises();
      for (Exercise exercise : exercises) {
        Label label = new Label(exercise.getName());
        label.setPrefSize(rand.nextInt(200) + 150, rand.nextInt(100) + 100);
        label.setStyle("-fx-background-color: rgb(" + rand.nextInt(255) + "," + rand.nextInt(255) +',' + rand.nextInt(255) + ")");
        view.getActivitiesPane().getChildren().add(label);
      }
    });
  }
}
