package ohos.media.audio;

import java.util.List;

/* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioRendererCallback.class */
public abstract class AudioRendererCallback {
    public abstract void onRendererConfigChanged(List<AudioRendererInfo> list);

    public AudioRendererCallback() {
        throw new RuntimeException("Stub!");
    }
}
