package ohos.aafwk.ability;

import ohos.aafwk.content.IntentParams;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/ability/IAbilityContinuation.class */
public interface IAbilityContinuation {
    boolean onStartContinuation();

    boolean onSaveData(IntentParams intentParams);

    boolean onRestoreData(IntentParams intentParams);

    void onCompleteContinuation(int i);

    default void onRemoteTerminated() {
        throw new RuntimeException("Stub!");
    }
}
