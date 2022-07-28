package ohos.aafwk.ability;

import ohos.aafwk.ability.Lifecycle;
import ohos.aafwk.content.Intent;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/LifecycleStateObserver.class */
public interface LifecycleStateObserver extends ILifecycleObserver {
    void onStateChanged(Lifecycle.Event event, Intent intent);
}
