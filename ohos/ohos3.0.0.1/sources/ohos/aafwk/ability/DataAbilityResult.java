package ohos.aafwk.ability;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/DataAbilityResult.class */
public class DataAbilityResult implements Sequenceable {
    public static final Sequenceable.Producer<DataAbilityResult> PRODUCER = null;

    public DataAbilityResult(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityResult(int count) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityResult(Uri uri, Integer count) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityResult(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }

    public Integer getCount() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static DataAbilityResult createFromParcel(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
