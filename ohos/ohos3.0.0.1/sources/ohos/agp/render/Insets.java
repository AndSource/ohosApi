package ohos.agp.render;

import ohos.agp.utils.Rect;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Insets.class */
public class Insets implements Sequenceable {
    public static final Insets NULL_INSET = null;
    public final int bottomValue = 0;
    public final int leftValue = 0;
    public final int rightValue = 0;
    public final int topValue = 0;

    public Insets(int leftValue, int topValue, int rightValue, int bottomValue) {
        throw new RuntimeException("Stub!");
    }

    public static Insets setValue(int leftValue, int topValue, int rightValue, int bottomValue) {
        throw new RuntimeException("Stub!");
    }

    public static Insets setValue(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean hasFileDescriptor() {
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
