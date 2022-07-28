package ohos.global.resource;

/* loaded from: ohos2.0.1.95.jar:ohos/global/resource/Entry.class */
public abstract class Entry {

    /* loaded from: ohos2.0.1.95.jar:ohos/global/resource/Entry$Type.class */
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
