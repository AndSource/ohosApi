package ohos.security.permission;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/security/permission/PermissionGroupDef.class */
public class PermissionGroupDef implements Sequenceable {
    public int descriptionRes;
    public int iconRes;
    public int labelRes;
    public String name;
    public int order;
    public int requestRes;

    public PermissionGroupDef() {
        throw new RuntimeException("Stub!");
    }

    public PermissionGroupDef(PermissionGroupDef orig) {
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
