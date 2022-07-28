package ohos.global.icu.util;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/Freezable.class */
public interface Freezable<T> extends Cloneable {
    boolean isFrozen();

    T freeze();

    T cloneAsThawed();
}
