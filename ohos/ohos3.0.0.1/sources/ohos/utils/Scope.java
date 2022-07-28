package ohos.utils;

import java.lang.Comparable;

/* loaded from: ohos3.0.0.1.jar:ohos/utils/Scope.class */
public final class Scope<T extends Comparable<? super T>> {
    public Scope(T lowerObj, T upperObj) {
        throw new RuntimeException("Stub!");
    }

    public static <T extends Comparable<? super T>> Scope<T> create(T lowerObj, T upperObj) {
        throw new RuntimeException("Stub!");
    }

    public T getLower() {
        throw new RuntimeException("Stub!");
    }

    public T getUpper() {
        throw new RuntimeException("Stub!");
    }

    public T clamp(T value) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(T value) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(Scope<T> range) {
        throw new RuntimeException("Stub!");
    }

    public Scope<T> expand(Scope<T> range) {
        throw new RuntimeException("Stub!");
    }

    public Scope<T> expand(T lowerObj, T upperObj) {
        throw new RuntimeException("Stub!");
    }

    public Scope<T> expand(T value) {
        throw new RuntimeException("Stub!");
    }

    public Scope<T> intersect(Scope<T> range) {
        throw new RuntimeException("Stub!");
    }

    public Scope<T> intersect(T lowerObj, T upperObj) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
