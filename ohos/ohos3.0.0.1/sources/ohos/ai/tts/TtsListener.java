package ohos.ai.tts;

import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/tts/TtsListener.class */
public interface TtsListener {
    void onStart(String str);

    void onProgress(String str, byte[] bArr, int i);

    void onFinish(String str);

    void onError(String str, String str2);

    void onEvent(int i, PacMap pacMap);

    void onSpeechStart(String str);

    void onSpeechProgressChanged(String str, int i);

    void onSpeechFinish(String str);
}
