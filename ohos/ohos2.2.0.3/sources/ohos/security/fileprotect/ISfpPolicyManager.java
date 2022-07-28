package ohos.security.fileprotect;

import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/security/fileprotect/ISfpPolicyManager.class */
public interface ISfpPolicyManager {
    int setLabel(Context context, String str, String str2, String str3, int i);

    String getLabel(Context context, String str, String str2);

    int getFlag(Context context, String str, String str2);
}
