package ohos.event.intentagent;

import ohos.aafwk.content.Intent;
import ohos.aafwk.content.IntentParams;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/event/intentagent/IntentAgent.class */
public final class IntentAgent implements Sequenceable {
    public static final Sequenceable.Producer<IntentAgent> PRODUCER = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/event/intentagent/IntentAgent$OnCompleted.class */
    public interface OnCompleted {
        void onSendCompleted(IntentAgent intentAgent, Intent intent, int i, String str, IntentParams intentParams);
    }

    IntentAgent(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}