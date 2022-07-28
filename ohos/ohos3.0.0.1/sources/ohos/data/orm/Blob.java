package ohos.data.orm;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: ohos3.0.0.1.jar:ohos/data/orm/Blob.class */
public class Blob implements java.sql.Blob {
    public Blob() {
        throw new RuntimeException("Stub!");
    }

    public Blob(byte[] blob) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public long length() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public byte[] getBytes(long pos, int length) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public InputStream getBinaryStream() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public long position(byte[] pattern, long start) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public long position(java.sql.Blob pattern, long start) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public int setBytes(long writeAt, byte[] bytes) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public int setBytes(long writeAt, byte[] bytes, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public OutputStream setBinaryStream(long indexToWriteAt) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public void truncate(long len) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public void free() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Blob
    public InputStream getBinaryStream(long pos, long length) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
