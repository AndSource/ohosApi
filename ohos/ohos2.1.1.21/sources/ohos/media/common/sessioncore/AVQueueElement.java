package ohos.media.common.sessioncore;

import ohos.media.common.AVDescription;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/media/common/sessioncore/AVQueueElement.class */
public final class AVQueueElement implements Sequenceable {
    public static final Sequenceable.Producer<AVQueueElement> CREATOR = null;
    public static final long INVALID_ID = -1;

    public AVQueueElement(AVDescription description, long elementId) {
        throw new RuntimeException("Stub!");
    }

    public AVDescription getDescription() {
        throw new RuntimeException("Stub!");
    }

    public long getElementId() {
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
