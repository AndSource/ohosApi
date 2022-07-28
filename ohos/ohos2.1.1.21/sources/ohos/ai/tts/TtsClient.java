package ohos.ai.tts;

import java.util.Optional;
import ohos.app.Context;
import ohos.media.audio.AudioManager;

/* loaded from: ohos2.1.1.21.jar:ohos/ai/tts/TtsClient.class */
public class TtsClient {
    public static final int METHOD_CREATE = 1000;
    public static final int METHOD_DESTROY = 1003;
    public static final int METHOD_RELEASE = 1005;
    public static final int METHOD_SPEAK_LONG_TEXT = 1006;
    public static final int METHOD_SPEAK_TEXT = 1001;
    public static final int METHOD_STOP_SPEAK = 1004;
    public static final String PAC_MAP_KEY_METHOD_ID = "methodId";

    TtsClient() {
        throw new RuntimeException("Stub!");
    }

    public static TtsClient getInstance() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void create(Context context, TtsListener ttsListener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void release() {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean init(TtsParams ttsParams) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean setParams(TtsParams ttsParams) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean setAudioType(AudioManager.AudioVolumeType audioType) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void speakText(String text, String utteranceId) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void speakLongText(String longText, String utteranceId) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isSpeaking() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void stopSpeak() {
        throw new RuntimeException("Stub!");
    }

    public synchronized Optional<String> getVersion() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void destroy() {
        throw new RuntimeException("Stub!");
    }
}
