package ohos.dcall;

import ohos.eventhandler.EventRunner;

/* loaded from: ohos2.1.1.21.jar:ohos/dcall/CallStateObserver.class */
public class CallStateObserver {
    public static final int CALL_STATE_IDLE = 0;
    public static final int CALL_STATE_OFFHOOK = 2;
    public static final int CALL_STATE_RINGING = 1;
    public static final int CALL_STATE_UNKNOWN = -1;
    public static final int OBSERVE_MASK_CALL_FORWARDING_UNCONDITIONAL_INDICATOR = 2;
    public static final int OBSERVE_MASK_CALL_STATE = 4;
    public static final int OBSERVE_MASK_VOICE_MAIL_MESSAGE_INDICATOR = 1;

    public CallStateObserver() throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public CallStateObserver(int slot) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public CallStateObserver(int slot, EventRunner runner) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void onVoiceMailMsgIndicatorUpdated(boolean isExist) {
        throw new RuntimeException("Stub!");
    }

    public void onCfuIndicatorUpdated(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void onCallStateUpdated(int state, String number) {
        throw new RuntimeException("Stub!");
    }
}
