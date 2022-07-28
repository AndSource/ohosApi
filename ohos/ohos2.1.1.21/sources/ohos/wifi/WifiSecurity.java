package ohos.wifi;

/* loaded from: ohos2.1.1.21.jar:ohos/wifi/WifiSecurity.class */
public final class WifiSecurity {
    public static final int EAP = 3;
    public static final int EAP_SUITE_B = 5;
    public static final int INVALID = -1;
    public static final int OPEN = 0;
    public static final int OWE = 6;
    public static final int PSK = 2;
    public static final int SAE = 4;
    public static final int WEP = 1;

    /* loaded from: ohos2.1.1.21.jar:ohos/wifi/WifiSecurity$EapMethod.class */
    public enum EapMethod {
        NONE,
        PEAP,
        TLS,
        TTLS,
        PWD,
        SIM,
        AKA,
        AKA_PRIME,
        UNAUTH_TLS
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/wifi/WifiSecurity$Phase2Method.class */
    public enum Phase2Method {
        NONE,
        PAP,
        MSCHAP,
        MSCHAPV2,
        GTC,
        SIM,
        AKA,
        AKA_PRIME
    }

    public WifiSecurity() {
        throw new RuntimeException("Stub!");
    }
}
