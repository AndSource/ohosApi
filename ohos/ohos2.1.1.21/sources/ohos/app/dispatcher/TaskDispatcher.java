package ohos.app.dispatcher;

import java.util.function.Consumer;
import ohos.app.dispatcher.task.Revocable;

/* loaded from: ohos2.1.1.21.jar:ohos/app/dispatcher/TaskDispatcher.class */
public interface TaskDispatcher {
    void syncDispatch(Runnable runnable);

    Revocable asyncDispatch(Runnable runnable);

    Revocable delayDispatch(Runnable runnable, long j);

    void syncDispatchBarrier(Runnable runnable);

    void asyncDispatchBarrier(Runnable runnable);

    Group createDispatchGroup();

    Revocable asyncGroupDispatch(Group group, Runnable runnable);

    boolean groupDispatchWait(Group group, long j);

    void groupDispatchNotify(Group group, Runnable runnable);

    void applyDispatch(Consumer<Long> consumer, long j);
}
