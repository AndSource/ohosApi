package ohos.media.common;

import java.io.FileDescriptor;
import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/media/common/Source.class */
public class Source {
    public static final int AUDIO_SOURCE_INIT = -1;
    public static final int VIDEO_SOURCE_INIT = -1;

    public Source() {
        throw new RuntimeException("Stub!");
    }

    public Source(String uri) {
        throw new RuntimeException("Stub!");
    }

    public Source(String uri, Map<String, String> header) {
        throw new RuntimeException("Stub!");
    }

    public Source(FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }

    public Source(FileDescriptor fd, long offset, long len) {
        throw new RuntimeException("Stub!");
    }

    public int getFileType() {
        throw new RuntimeException("Stub!");
    }

    public int getRecorderAudioSource() {
        throw new RuntimeException("Stub!");
    }

    public void setRecorderAudioSource(int recorderAudioSource) {
        throw new RuntimeException("Stub!");
    }

    public int getRecorderVideoSource() {
        throw new RuntimeException("Stub!");
    }

    public void setRecorderVideoSource(int recorderVideoSource) {
        throw new RuntimeException("Stub!");
    }

    public String getUri() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/common/Source$AudioSource.class */
    public static final class AudioSource {
        public static final int SOUND_CALL = 2002;
        public static final int SOUND_MIC = 2001;

        AudioSource() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/common/Source$VideoSource.class */
    public static final class VideoSource {
        public static final int SURFACE = 1001;

        VideoSource() {
            throw new RuntimeException("Stub!");
        }
    }
}
