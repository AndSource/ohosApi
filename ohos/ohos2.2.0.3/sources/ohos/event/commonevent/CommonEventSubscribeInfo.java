package ohos.event.commonevent;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/event/commonevent/CommonEventSubscribeInfo.class */
public final class CommonEventSubscribeInfo implements Sequenceable {
    public static final Sequenceable.Producer<CommonEventSubscribeInfo> PRODUCER = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/event/commonevent/CommonEventSubscribeInfo$ThreadMode.class */
    public enum ThreadMode {
        HANDLER,
        POST,
        ASYNC,
        BACKGROUND
    }

    public CommonEventSubscribeInfo(MatchingSkills matchingSkills) {
        throw new RuntimeException("Stub!");
    }

    public CommonEventSubscribeInfo(CommonEventSubscribeInfo subscribeInfo) {
        throw new RuntimeException("Stub!");
    }

    public MatchingSkills getMatchingSkills() {
        throw new RuntimeException("Stub!");
    }

    public ThreadMode getThreadMode() {
        throw new RuntimeException("Stub!");
    }

    public void setThreadMode(ThreadMode threadMode) {
        throw new RuntimeException("Stub!");
    }

    public String getPermission() {
        throw new RuntimeException("Stub!");
    }

    public void setPermission(String permission) {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceId(String deviceId) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public void setPriority(int priority) {
        throw new RuntimeException("Stub!");
    }

    public int getPriority() {
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
