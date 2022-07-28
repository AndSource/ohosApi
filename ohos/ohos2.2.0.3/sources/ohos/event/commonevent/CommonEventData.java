package ohos.event.commonevent;

import ohos.aafwk.content.Intent;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/event/commonevent/CommonEventData.class */
public final class CommonEventData implements Sequenceable {
    public static final Sequenceable.Producer<CommonEventData> PRODUCER = null;

    public CommonEventData() {
        throw new RuntimeException("Stub!");
    }

    public CommonEventData(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public CommonEventData(Intent intent, int code, String data) {
        throw new RuntimeException("Stub!");
    }

    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }

    public void setCode(int code) {
        throw new RuntimeException("Stub!");
    }

    public int getCode() {
        throw new RuntimeException("Stub!");
    }

    public void setData(String data) {
        throw new RuntimeException("Stub!");
    }

    public String getData() {
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

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
