package ohos.media.camera.params;

import ohos.utils.Scope;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ParameterKey.class */
public final class ParameterKey {
    public static final Key<Boolean> AUTO_ZOOM = null;
    public static final Key<Scope<Integer>> EXPOSURE_FPS_RANGE = null;
    public static final Key<Boolean> FACE_AE = null;
    public static final Key<Byte> IMAGE_COMPRESSION_QUALITY = null;
    public static final Key<Boolean> IMAGE_MIRROR = null;
    public static final Key<byte[]> VENDOR_CUSTOM = null;
    public static final Key<Boolean> VIDEO_STABILIZATION = null;

    ParameterKey() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ParameterKey$Key.class */
    public static final class Key<T> {
        public Key(String name, Class<T> type) {
            throw new RuntimeException("Stub!");
        }

        public String getName() {
            throw new RuntimeException("Stub!");
        }

        public boolean checkType(Class<?> clazz) {
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

        public Object cloneValue(Object value) {
            throw new RuntimeException("Stub!");
        }
    }
}
