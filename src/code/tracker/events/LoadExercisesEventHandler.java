package code.tracker.events;

import code.tracker.utils.event.EventHandler;

/**
 * Created by razvanolar on 16.03.2017
 */
public interface LoadExercisesEventHandler extends EventHandler {
  void onLoadExercisesEvent(LoadExercisesEvent event);
}
