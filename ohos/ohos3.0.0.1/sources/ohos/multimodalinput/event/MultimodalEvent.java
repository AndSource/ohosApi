package ohos.multimodalinput.event;

import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/event/MultimodalEvent.class */
public abstract class MultimodalEvent implements Sequenceable {
    public static final int BUILTIN_KEY = 4;
    public static final int DEFAULT_TYPE = -1;
    public static final int KEYBOARD = 1;
    public static final int MOUSE = 2;
    public static final int ROTATION = 5;
    public static final int SPEECH = 6;
    public static final int STYLUS = 3;
    public static final int TOUCH_PANEL = 0;
    public static final int UNSUPPORTED_DEVICE = -1;
    protected int highLevelEvent = -1;
    protected final UUID uuid = null;

    public abstract int getSourceDevice();

    public abstract String getDeviceId();

    public abstract int getInputDeviceId();

    public abstract long getOccurredTime();

    MultimodalEvent() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSameEvent(UUID id) {
        throw new RuntimeException("Stub!");
    }

    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
}
