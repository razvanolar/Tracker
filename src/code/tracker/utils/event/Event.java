package code.tracker.utils.event;

/**
 * Created by razvanolar on 16.03.2017
 */
public abstract class Event<T extends EventHandler> {

  public abstract EventType getAssociatedType();
  public abstract void dispatch(T handler);
}
