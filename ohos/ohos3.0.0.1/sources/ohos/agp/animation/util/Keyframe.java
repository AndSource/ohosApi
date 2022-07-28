package ohos.agp.animation.util;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/animation/util/Keyframe.class */
public abstract class Keyframe implements Cloneable {
    public abstract Object getValue();

    public abstract void setValue(Object obj);

    public abstract Keyframe clone();

    public Keyframe() {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofInt(float progress, int value) {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofInt(float progress) {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofFloat(float progress, float value) {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofFloat(float progress) {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofObject(float progress, Object value) {
        throw new RuntimeException("Stub!");
    }

    public static Keyframe ofObject(float progress) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasValue() {
        throw new RuntimeException("Stub!");
    }

    public float getProgress() {
        throw new RuntimeException("Stub!");
    }

    public void setProgress(float progress) {
        throw new RuntimeException("Stub!");
    }

    public Class getType() {
        throw new RuntimeException("Stub!");
    }
}
