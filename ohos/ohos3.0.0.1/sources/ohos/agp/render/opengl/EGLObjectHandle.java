package ohos.agp.render.opengl;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/opengl/EGLObjectHandle.class */
public abstract class EGLObjectHandle {
    public int dafaultCodeKey = 31;
    public int defaultCodeBit = 32;
    public int defaultResult = 17;

    protected EGLObjectHandle(long handle) {
        throw new RuntimeException("Stub!");
    }

    public long getNativeHandle() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
