package ohos.app.dispatcher;

import java.util.function.Consumer;
import ohos.app.dispatcher.task.Revocable;

public interface TaskDispatcher {
  void syncDispatch(Runnable paramRunnable);
  
  Revocable asyncDispatch(Runnable paramRunnable);
  
  Revocable delayDispatch(Runnable paramRunnable, long paramLong);
  
  void syncDispatchBarrier(Runnable paramRunnable);
  
  void asyncDispatchBarrier(Runnable paramRunnable);
  
  Group createDispatchGroup();
  
  Revocable asyncGroupDispatch(Group paramGroup, Runnable paramRunnable);
  
  boolean groupDispatchWait(Group paramGroup, long paramLong);
  
  void groupDispatchNotify(Group paramGroup, Runnable paramRunnable);
  
  void applyDispatch(Consumer<Long> paramConsumer, long paramLong);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/app/dispatcher/TaskDispatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */