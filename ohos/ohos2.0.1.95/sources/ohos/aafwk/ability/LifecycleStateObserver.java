package ohos.aafwk.ability;

import ohos.aafwk.ability.Lifecycle;
import ohos.aafwk.content.Intent;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/ability/LifecycleStateObserver.class */
public interface LifecycleStateObserver extends ILifecycleObserver {
    void onStateChanged(Lifecycle.Event event, Intent intent);
}
