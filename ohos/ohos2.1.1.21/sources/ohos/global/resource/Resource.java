package ohos.global.resource;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: ohos2.1.1.21.jar:ohos/global/resource/Resource.class */
public abstract class Resource extends InputStream {
    @Override // java.io.InputStream
    public abstract int available() throws IOException;

    @Override // java.io.InputStream
    public abstract int read(byte[] bArr, int i, int i2) throws IOException, IndexOutOfBoundsException, NullPointerException;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public Resource() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
