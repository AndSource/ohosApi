package ohos.multimodalinput.event;

import java.util.Optional;

/* loaded from: ohos2.2.0.3.jar:ohos/multimodalinput/event/SpeechEvent.class */
public class SpeechEvent extends MultimodalEvent {
    public static final int ACTION_HIT_HOTWORD = 3;
    public static final int ACTION_SWITCH_OFF = 2;
    public static final int ACTION_SWITCH_ON = 1;
    public static final int MATCH_MODE_EXACT = 1;
    public static final int MATCH_MODE_FUZZY = 2;
    public static final int SCENES_AUDIO = 2;
    public static final int SCENES_COMMON = 5;
    public static final int SCENES_PAGE = 3;
    public static final int SCENES_SWITCH = 4;
    public static final int SCENES_VIDEO = 1;

    SpeechEvent() {
        throw new RuntimeException("Stub!");
    }

    public static Optional<SpeechEvent> createEvent(long occurTime, int action, String value) {
        throw new RuntimeException("Stub!");
    }

    public int getAction() {
        throw new RuntimeException("Stub!");
    }

    public int getScene() {
        throw new RuntimeException("Stub!");
    }

    public String getActionProperty() {
        throw new RuntimeException("Stub!");
    }

    public int getMatchMode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.multimodalinput.event.MultimodalEvent
    public int getSourceDevice() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.multimodalinput.event.MultimodalEvent
    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.multimodalinput.event.MultimodalEvent
    public int getInputDeviceId() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.multimodalinput.event.MultimodalEvent
    public long getOccurredTime() {
        throw new RuntimeException("Stub!");
    }
}
