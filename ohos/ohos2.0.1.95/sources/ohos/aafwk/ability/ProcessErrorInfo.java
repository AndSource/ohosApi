package ohos.aafwk.ability;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/ability/ProcessErrorInfo.class */
public class ProcessErrorInfo implements Sequenceable {
    public static final int CRASHED = 1;
    public static final int NOT_RESPONDING = 2;
    public static final int NO_ERROR = 0;
    public static final Sequenceable.Producer<ProcessErrorInfo> PRODUCER = null;

    public ProcessErrorInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getCondition() {
        throw new RuntimeException("Stub!");
    }

    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }

    public int getPid() {
        throw new RuntimeException("Stub!");
    }

    public int getUid() {
        throw new RuntimeException("Stub!");
    }

    public String getTag() {
        throw new RuntimeException("Stub!");
    }

    public String getShortMsg() {
        throw new RuntimeException("Stub!");
    }

    public String getLongMsg() {
        throw new RuntimeException("Stub!");
    }

    public String getStackTrace() {
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
