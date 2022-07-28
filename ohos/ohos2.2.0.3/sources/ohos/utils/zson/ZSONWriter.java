package ohos.utils.zson;

import java.io.Flushable;
import java.io.Writer;

/* loaded from: ohos2.2.0.3.jar:ohos/utils/zson/ZSONWriter.class */
public class ZSONWriter implements AutoCloseable, Flushable {
    public ZSONWriter(Writer writer) {
        throw new RuntimeException("Stub!");
    }

    public ZSONWriter(Writer writer, boolean isPretty) {
        throw new RuntimeException("Stub!");
    }

    public void startArray() {
        throw new RuntimeException("Stub!");
    }

    public void startObject() {
        throw new RuntimeException("Stub!");
    }

    public void writeName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void writeBoolean(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public void writeNull() {
        throw new RuntimeException("Stub!");
    }

    public void writeNumber(Number value) {
        throw new RuntimeException("Stub!");
    }

    public void writeString(String value) {
        throw new RuntimeException("Stub!");
    }

    public void writeObject(Object object) {
        throw new RuntimeException("Stub!");
    }

    public void endArray() {
        throw new RuntimeException("Stub!");
    }

    public void endObject() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.Flushable
    public void flush() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
