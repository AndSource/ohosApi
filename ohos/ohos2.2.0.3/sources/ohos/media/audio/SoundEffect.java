package ohos.media.audio;

import java.util.UUID;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/SoundEffect.class */
public class SoundEffect {
    public static final String SOUND_EFFECT_MODE_AUXILIARY = "Auxiliary";
    public static final String SOUND_EFFECT_MODE_INSERT = "Insert";
    public static final String SOUND_EFFECT_MODE_PRE_PROCESSING = "Pre Processing";
    public static final UUID SOUND_EFFECT_TYPE_AE = null;
    public static final UUID SOUND_EFFECT_TYPE_EC = null;
    public static final UUID SOUND_EFFECT_TYPE_GC = null;
    public static final UUID SOUND_EFFECT_TYPE_INVALID = null;
    public static final UUID SOUND_EFFECT_TYPE_NS = null;

    public SoundEffect(UUID uid, UUID type, int priority, int sessionId, String packageName) throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public static boolean isEffectAvailable(UUID type) {
        throw new RuntimeException("Stub!");
    }

    public static SoundEffectInfo[] acquireEffects() {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectInfo getEffectInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getEffectId() {
        throw new RuntimeException("Stub!");
    }

    public boolean setActivated(boolean activated) {
        throw new RuntimeException("Stub!");
    }

    public boolean getActivated() {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/SoundEffect$SoundEffectInfo.class */
    public static class SoundEffectInfo {
        public SoundEffectInfo() {
            throw new RuntimeException("Stub!");
        }

        public SoundEffectInfo(String uid, String type, String mode, String name) {
            throw new RuntimeException("Stub!");
        }

        public UUID getUid() {
            throw new RuntimeException("Stub!");
        }

        public void setUid(UUID uid) {
            throw new RuntimeException("Stub!");
        }

        public UUID getType() {
            throw new RuntimeException("Stub!");
        }

        public void setType(UUID type) {
            throw new RuntimeException("Stub!");
        }

        public String getMode() {
            throw new RuntimeException("Stub!");
        }

        public void setMode(String mode) {
            throw new RuntimeException("Stub!");
        }

        public String getName() {
            throw new RuntimeException("Stub!");
        }

        public void setName(String name) {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object obj) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
