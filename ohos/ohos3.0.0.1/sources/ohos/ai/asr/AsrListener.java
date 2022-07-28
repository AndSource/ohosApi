package ohos.ai.asr;

import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/asr/AsrListener.class */
public interface AsrListener {
    void onInit(PacMap pacMap);

    void onBeginningOfSpeech();

    void onRmsChanged(float f);

    void onBufferReceived(byte[] bArr);

    void onEndOfSpeech();

    void onError(int i);

    void onResults(PacMap pacMap);

    void onIntermediateResults(PacMap pacMap);

    void onEnd();

    void onEvent(int i, PacMap pacMap);

    void onAudioStart();

    void onAudioEnd();
}
