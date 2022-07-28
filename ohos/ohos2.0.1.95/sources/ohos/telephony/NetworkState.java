package ohos.telephony;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/telephony/NetworkState.class */
public final class NetworkState implements Sequenceable {
    public static final int NSA_STATE_CONNECTED_DETECT = 3;
    public static final int NSA_STATE_DUAL_CONNECTED = 5;
    public static final int NSA_STATE_IDLE_DETECT = 4;
    public static final int NSA_STATE_NOT_SUPPORT = 1;
    public static final int NSA_STATE_NO_DETECT = 2;
    public static final int NSA_STATE_SA_ATTACHED = 6;
    public static final int REG_STATE_EMERGENCY_CALL_ONLY = 2;
    public static final int REG_STATE_IN_SERVICE = 1;
    public static final int REG_STATE_NO_SERVICE = 0;
    public static final int REG_STATE_POWER_OFF = 3;

    public NetworkState() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel dest) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String getLongOperatorName() {
        throw new RuntimeException("Stub!");
    }

    public String getShortOperatorName() {
        throw new RuntimeException("Stub!");
    }

    public String getPlmnNumeric() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRoaming() {
        throw new RuntimeException("Stub!");
    }

    public int getRegState() {
        throw new RuntimeException("Stub!");
    }

    public int getNsaState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCaActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmergency() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }
}
