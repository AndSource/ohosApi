package ohos.media.audio;

import java.util.List;

/* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturerCallback.class */
public abstract class AudioCapturerCallback {
    public abstract void onCapturerConfigChanged(List<AudioCapturerConfig> list);

    public AudioCapturerCallback() {
        throw new RuntimeException("Stub!");
    }
}
