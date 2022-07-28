package ohos.interwork.utils;

import ohos.utils.Parcel;
import ohos.utils.ParcelException;

/* loaded from: ohos3.0.0.1.jar:ohos/interwork/utils/ParcelableEx.class */
public interface ParcelableEx {
    void marshallingEx(Parcel parcel) throws ParcelException;

    default void unmarshallingEx(Parcel in) throws ParcelException {
        throw new RuntimeException("Stub!");
    }
}
