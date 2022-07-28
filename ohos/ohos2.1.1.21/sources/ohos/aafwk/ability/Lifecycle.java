package ohos.aafwk.ability;

import ohos.aafwk.content.Intent;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/Lifecycle.class */
public class Lifecycle {

    /* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/Lifecycle$Event.class */
    public enum Event {
        UNDEFINED,
        ON_START,
        ON_INACTIVE,
        ON_ACTIVE,
        ON_BACKGROUND,
        ON_FOREGROUND,
        ON_STOP
    }

    public Lifecycle() {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLifecycle(Event event, Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void addObserver(ILifecycleObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void removeObserver(ILifecycleObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public Event getLifecycleState() {
        throw new RuntimeException("Stub!");
    }
}
