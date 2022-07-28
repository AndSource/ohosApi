package ohos.security.permission;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/security/permission/PermissionDef.class */
public class PermissionDef implements Sequenceable {
    public static final int FLAG_DISCARDED = 1;
    public static final int PRIVILEGED = 8;
    public static final int RESTRICTED = 2;
    public static final int SIGNATURE = 1;
    public static final int SYSTEM = 4;
    public static final int SYSTEM_GRANT = 0;
    public static final int USER_GRANT = 1;
    public int availableScope;
    public int descriptionRes;
    public int grantMode;
    public String group;
    public int labelRes;
    public String name;
    public int permissionFlags;
    public String reminderDesc;
    public int reminderIcon;
    public int usageInfo;

    public PermissionDef() {
        throw new RuntimeException("Stub!");
    }

    public PermissionDef(PermissionDef orig) {
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
