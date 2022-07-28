package ohos.media.audio;

import java.util.List;

/* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioCapturerCallback.class */
public abstract class AudioCapturerCallback {
    public abstract void onCapturerConfigChanged(List<AudioCapturerConfig> list);

    public AudioCapturerCallback() {
        throw new RuntimeException("Stub!");
    }
}
