package ohos.global.icu.util;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/Freezable.class */
public interface Freezable<T> extends Cloneable {
    boolean isFrozen();

    T freeze();

    T cloneAsThawed();
}
