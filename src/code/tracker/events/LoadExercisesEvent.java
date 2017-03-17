package code.tracker.events;

import code.tracker.utils.event.Event;
import code.tracker.utils.event.EventType;

/**
 * Created by razvanolar on 16.03.2017
 */
public class LoadExercisesEvent extends Event<LoadExercisesEventHandler> {

  public static final EventType<LoadExercisesEventHandler> TYPE = new EventType<>();

  @Override
  public EventType getAssociatedType() {
    return TYPE;
  }

  @Override
  public void dispatch(LoadExercisesEventHandler handler) {
    handler.onLoadExercisesEvent(this);
  }
}
