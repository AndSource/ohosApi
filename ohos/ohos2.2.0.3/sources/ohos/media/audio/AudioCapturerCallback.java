package ohos.media.audio;

import java.util.List;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioCapturerCallback.class */
public abstract class AudioCapturerCallback {
    public abstract void onCapturerConfigChanged(List<AudioCapturerConfig> list);

    public AudioCapturerCallback() {
        throw new RuntimeException("Stub!");
    }
}
