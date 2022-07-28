package ohos.utils.zson;

import java.io.Reader;

/* loaded from: ohos2.1.1.21.jar:ohos/utils/zson/ZSONReader.class */
public class ZSONReader implements AutoCloseable {
    public ZSONReader(Reader reader) {
        throw new RuntimeException("Stub!");
    }

    public void startArray() {
        throw new RuntimeException("Stub!");
    }

    public void startObject() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasNext() {
        throw new RuntimeException("Stub!");
    }

    public String readName() {
        throw new RuntimeException("Stub!");
    }

    public boolean readBoolean() {
        throw new RuntimeException("Stub!");
    }

    public double readDouble() {
        throw new RuntimeException("Stub!");
    }

    public int readInt() {
        throw new RuntimeException("Stub!");
    }

    public float readFloat() {
        throw new RuntimeException("Stub!");
    }

    public long readLong() {
        throw new RuntimeException("Stub!");
    }

    public Object readNull() {
        throw new RuntimeException("Stub!");
    }

    public String readString() {
        throw new RuntimeException("Stub!");
    }

    public ZSONType peek() {
        throw new RuntimeException("Stub!");
    }

    public void skipValue() {
        throw new RuntimeException("Stub!");
    }

    public void endArray() {
        throw new RuntimeException("Stub!");
    }

    public void endObject() {
        throw new RuntimeException("Stub!");
    }

    public <T> T read(Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }

    public <T> T read(Class<T> clazz, boolean isExt) {
        throw new RuntimeException("Stub!");
    }

    public void read(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public void read(Object obj, boolean isExt) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
