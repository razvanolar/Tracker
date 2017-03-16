package code.tracker.utils;

/**
 * Created by razvanolar on 06.03.2017
 */
public interface Controller<T extends View> {
  void bind(T view);
}
