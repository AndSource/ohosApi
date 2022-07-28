package ohos.ai.asr;

/* loaded from: ohos2.2.0.3.jar:ohos/ai/asr/AsrIntent.class */
public class AsrIntent {
    public AsrIntent() {
        throw new RuntimeException("Stub!");
    }

    public int getVadEndWaitMs() {
        throw new RuntimeException("Stub!");
    }

    public void setVadEndWaitMs(int vadEndWaitMs) {
        throw new RuntimeException("Stub!");
    }

    public int getVadFrontWaitMs() {
        throw new RuntimeException("Stub!");
    }

    public void setVadFrontWaitMs(int vadFrontWaitMs) {
        throw new RuntimeException("Stub!");
    }

    public int getTimeoutThresholdMs() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeoutThresholdMs(int timeoutThresholdMs) {
        throw new RuntimeException("Stub!");
    }

    public String getFilePath() {
        throw new RuntimeException("Stub!");
    }

    public void setFilePath(String filePath) {
        throw new RuntimeException("Stub!");
    }

    public int getAudioSourceType() {
        throw new RuntimeException("Stub!");
    }

    public void setAudioSourceType(AsrAudioSrcType audioSourceType) {
        throw new RuntimeException("Stub!");
    }

    public int getEngineType() {
        throw new RuntimeException("Stub!");
    }

    public void setEngineType(AsrEngineType engineType) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/ai/asr/AsrIntent$AsrAudioSrcType.class */
    public enum AsrAudioSrcType {
        ASR_SRC_TYPE_PCM,
        ASR_SRC_TYPE_FILE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/ai/asr/AsrIntent$AsrEngineType.class */
    public enum AsrEngineType {
        ASR_ENGINE_TYPE_LOCAL;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
