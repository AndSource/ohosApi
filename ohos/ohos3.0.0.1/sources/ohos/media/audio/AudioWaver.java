package ohos.media.audio;

/* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioWaver.class */
public class AudioWaver {

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioWaver$FrequencyDataObserver.class */
    public interface FrequencyDataObserver {
        void onFrequencyData(byte[] bArr, int i);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioWaver$WaveDataObserver.class */
    public interface WaveDataObserver {
        void onWaveData(byte[] bArr, int i);
    }

    public AudioWaver(int sessionId, String packageName) throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    public boolean setDataSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public boolean setActivated(boolean activated) {
        throw new RuntimeException("Stub!");
    }

    public static int getMinDataSize() {
        throw new RuntimeException("Stub!");
    }

    public static int getMaxDataSize() {
        throw new RuntimeException("Stub!");
    }

    public static int getMinInterval() {
        throw new RuntimeException("Stub!");
    }

    public boolean setWaveDataObserver(WaveDataObserver observer, int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setFrequencyDataObserver(FrequencyDataObserver observer, int interval) {
        throw new RuntimeException("Stub!");
    }
}
