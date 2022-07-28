package ohos.utils;

/* loaded from: ohos3.0.0.1.jar:ohos/utils/Sequenceable.class */
public interface Sequenceable {

    /* loaded from: ohos3.0.0.1.jar:ohos/utils/Sequenceable$Producer.class */
    public interface Producer<T> {
        T createFromParcel(Parcel parcel);
    }

    boolean marshalling(Parcel parcel);

    boolean unmarshalling(Parcel parcel);

    default boolean hasFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
}
