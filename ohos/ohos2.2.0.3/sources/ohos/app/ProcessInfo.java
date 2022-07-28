package ohos.app;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/app/ProcessInfo.class */
public class ProcessInfo implements Sequenceable {
    public static final Sequenceable.Producer<ProcessInfo> PRODUCER = null;

    public ProcessInfo() {
        throw new RuntimeException("Stub!");
    }

    public ProcessInfo(String name, int pid) {
        throw new RuntimeException("Stub!");
    }

    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }

    public int getPid() {
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
