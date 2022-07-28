package ohos.security.seoperator;

import java.util.Map;

/* loaded from: ohos2.1.1.21.jar:ohos/security/seoperator/SEOperatorAbs.class */
public abstract class SEOperatorAbs {
    public static final int INIT_ERROR = -100;

    public abstract int checkEligibility(String str);

    public abstract int syncSeInfo(String str, String str2, String str3);

    public abstract int createSSD(String str, String str2, String str3, String str4);

    public abstract int deleteSSD(String str, String str2, String str3, String str4);

    public abstract int commonExecute(String str, String str2, String str3);

    public abstract String getCplc(String str);

    public abstract boolean isEnable(String str, String str2);

    public abstract int setEnable(String str, String str2, boolean z);

    public abstract String[] getLastErrorInfo(String str);

    public abstract int setConfig(String str, Map<String, String> map);

    public SEOperatorAbs() {
        throw new RuntimeException("Stub!");
    }
}
