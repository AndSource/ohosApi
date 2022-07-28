package ohos.bundle;

import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/CommonEventInfo.class */
public class CommonEventInfo implements Sequenceable {
    public static final Sequenceable.Producer<CommonEventInfo> PRODUCER = null;

    public CommonEventInfo() {
        throw new RuntimeException("Stub!");
    }

    public CommonEventInfo(CommonEventInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public int getUid() {
        throw new RuntimeException("Stub!");
    }

    public String getClassName() {
        throw new RuntimeException("Stub!");
    }

    public String getPermission() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getData() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getType() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getEvents() {
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
