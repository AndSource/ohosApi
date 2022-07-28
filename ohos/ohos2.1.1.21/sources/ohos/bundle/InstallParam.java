package ohos.bundle;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/InstallParam.class */
public class InstallParam implements Sequenceable {
    public static final int INSTALL_FLAG_DEFAULT = 0;
    public static final Sequenceable.Producer<InstallParam> PRODUCER = null;
    public static final int UNSPECIFIED_USER_ID = -2;

    public InstallParam() {
        throw new RuntimeException("Stub!");
    }

    public InstallParam(int userId, int installFlag) {
        throw new RuntimeException("Stub!");
    }

    public int getUserId() {
        throw new RuntimeException("Stub!");
    }

    public void setUserId(int userId) {
        throw new RuntimeException("Stub!");
    }

    public int getInstallFlag() {
        throw new RuntimeException("Stub!");
    }

    public void setInstallFlag(int installFlag) {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeepData() {
        throw new RuntimeException("Stub!");
    }

    public void setKeepData(boolean keepData) {
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
