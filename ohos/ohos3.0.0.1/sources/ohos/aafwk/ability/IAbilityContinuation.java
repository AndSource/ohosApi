package ohos.aafwk.ability;

import ohos.aafwk.content.IntentParams;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/IAbilityContinuation.class */
public interface IAbilityContinuation {
    public static final int ERR_ABILITY_QUERY_FAILED = -2;
    public static final int ERR_CONTINUE_TIMEOUT = -8;
    public static final int ERR_DEVICE_OFFLINE = -9;
    public static final int ERR_INSTALL_FREE_NOT_SUPPORTED = -4;
    public static final int ERR_NETWORK_UNAVAILABLE = -3;
    public static final int ERR_PARAMETER_INVALID = -6;
    public static final int ERR_PERMISSION_DENIED = -5;
    public static final int ERR_REMOTE_DEVICE_INCOMPATIBLE = -7;
    public static final int ERR_UNKNOWN = -1;
    public static final int SUCCESS = 0;

    boolean onStartContinuation();

    boolean onSaveData(IntentParams intentParams);

    boolean onRestoreData(IntentParams intentParams);

    void onCompleteContinuation(int i);

    default void onRemoteTerminated() {
        throw new RuntimeException("Stub!");
    }

    default void onFailedContinuation(int errorCode) {
        throw new RuntimeException("Stub!");
    }
}
