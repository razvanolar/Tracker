package code.tracker.events;

import code.tracker.model.Exercise;
import code.tracker.utils.event.Event;
import code.tracker.utils.event.EventType;

import java.util.List;

/**
 * Created by razvanolar on 16.03.2017
 */
public class ShowExercisesEvent extends Event<ShowExercisesEventHandler> {

  public static final EventType<ShowExercisesEventHandler> TYPE = new EventType<>();
  private List<Exercise> exercises;

  public ShowExercisesEvent(List<Exercise> exercises) {
    this.exercises = exercises;
  }

  public List<Exercise> getExercises() {
    return exercises;
  }

  @Override
  public EventType getAssociatedType() {
    return TYPE;
  }

  @Override
  public void dispatch(ShowExercisesEventHandler handler) {
    handler.onShowExercisesEvent(this);
  }
}
