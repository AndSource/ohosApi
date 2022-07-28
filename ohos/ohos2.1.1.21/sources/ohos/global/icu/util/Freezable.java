package ohos.global.icu.util;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/util/Freezable.class */
public interface Freezable<T> extends Cloneable {
    boolean isFrozen();

    T freeze();

    T cloneAsThawed();
}
