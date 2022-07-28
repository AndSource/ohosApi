package ohos.media.audio;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/ToneDescriptor.class */
public class ToneDescriptor {
    public ToneDescriptor(ToneType type) {
        throw new RuntimeException("Stub!");
    }

    public double getHighFrequency() {
        throw new RuntimeException("Stub!");
    }

    public double getLowFrequency() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/ToneDescriptor$ToneType.class */
    public enum ToneType {
        DTMF_0,
        DTMF_1,
        DTMF_2,
        DTMF_3,
        DTMF_4,
        DTMF_5,
        DTMF_6,
        DTMF_7,
        DTMF_8,
        DTMF_9,
        DTMF_S,
        DTMF_P,
        DTMF_A,
        DTMF_B,
        DTMF_C,
        DTMF_D,
        PROP_PROMPT,
        SUP_CALL_WAITING;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
