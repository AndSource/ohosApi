package ohos.aafwk.abilityjet.activedata;

import ohos.aafwk.ability.Lifecycle;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/abilityjet/activedata/DataObserver.class */
public abstract class DataObserver<T> {
    public abstract void onChanged(T t);

    public DataObserver() {
        throw new RuntimeException("Stub!");
    }

    public final void setLifecycle(Lifecycle owner) {
        throw new RuntimeException("Stub!");
    }
}
