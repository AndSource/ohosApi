package ohos.global.icu.util;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/util/Freezable.class */
public interface Freezable<T> extends Cloneable {
    boolean isFrozen();

    T freeze();

    T cloneAsThawed();
}
