package ohos.utils;

import java.util.List;
import java.util.Optional;

/* loaded from: ohos2.0.1.95.jar:ohos/utils/LruBuffer.class */
public class LruBuffer<K, V> {
    public LruBuffer() {
        throw new RuntimeException("Stub!");
    }

    public LruBuffer(int capacity) {
        throw new RuntimeException("Stub!");
    }

    protected void afterRemoval(boolean isEvict, K key, V value, V newValue) {
        throw new RuntimeException("Stub!");
    }

    protected V createDefault(K key) {
        throw new RuntimeException("Stub!");
    }

    public final int capacity() {
        throw new RuntimeException("Stub!");
    }

    public final void clear() {
        throw new RuntimeException("Stub!");
    }

    public final int getMatchCount() {
        throw new RuntimeException("Stub!");
    }

    public final int getMissCount() {
        throw new RuntimeException("Stub!");
    }

    public final int getPutCount() {
        throw new RuntimeException("Stub!");
    }

    public final boolean contains(K key) {
        throw new RuntimeException("Stub!");
    }

    public final V get(K key) {
        throw new RuntimeException("Stub!");
    }

    public final int getCreateCount() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public final List<K> keys() {
        throw new RuntimeException("Stub!");
    }

    public final V put(K key, V value) {
        throw new RuntimeException("Stub!");
    }

    public final int getRemovalCount() {
        throw new RuntimeException("Stub!");
    }

    public final Optional<V> remove(K key) {
        throw new RuntimeException("Stub!");
    }

    public final int size() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public final void updateCapacity(int newCapacity) {
        throw new RuntimeException("Stub!");
    }

    public final List<V> values() {
        throw new RuntimeException("Stub!");
    }
}
