package ohos.global.resource;

/* loaded from: ohos3.0.0.1.jar:ohos/global/resource/Entry.class */
public abstract class Entry {

    /* loaded from: ohos3.0.0.1.jar:ohos/global/resource/Entry$Type.class */
    public enum Type {
        FOLDER,
        FILE,
        UNKNOWN
    }

    public abstract String getPath();

    public abstract Type getType();

    public Entry() {
        throw new RuntimeException("Stub!");
    }
}
