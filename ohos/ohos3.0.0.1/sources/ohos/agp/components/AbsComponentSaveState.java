package ohos.agp.components;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/AbsComponentSaveState.class */
public abstract class AbsComponentSaveState implements Sequenceable {
    public static final AbsComponentSaveState EMPTY_STATE = null;
    public static final Sequenceable.Producer<AbsComponentSaveState> PRODUCER = null;

    protected AbsComponentSaveState(Sequenceable superState) {
        throw new RuntimeException("Stub!");
    }

    protected AbsComponentSaveState(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    protected AbsComponentSaveState(Parcel in, ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }

    public final Sequenceable getSuperState() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
}
