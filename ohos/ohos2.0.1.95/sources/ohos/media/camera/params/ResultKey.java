package ohos.media.camera.params;

import ohos.utils.Scope;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ResultKey.class */
public final class ResultKey {
    public static final Key<Byte> AUTO_ZOOM_STATE = null;
    public static final Key<Scope<Integer>> EXPOSURE_FPS_RANGE_RESULT = null;
    public static final Key<Byte> FACE_AE_STATE = null;
    public static final Key<byte[]> VENDOR_CUSTOM_RESULT = null;
    public static final Key<Boolean> VIDEO_STABILIZATION_STATE = null;

    ResultKey() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ResultKey$Key.class */
    public static final class Key<T> {
        public Key(String name, Class<T> type) {
            throw new RuntimeException("Stub!");
        }

        public String getName() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object key) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
