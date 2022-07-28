package ohos.data.orm;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: ohos2.0.1.95.jar:ohos/data/orm/Clob.class */
public class Clob implements java.sql.Clob {
    public Clob(String charData) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public long length() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public String getSubString(long startPos, int length) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public Reader getCharacterStream() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public InputStream getAsciiStream() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public long position(String stringToFind, long startPos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public long position(java.sql.Clob clob, long startPos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public int setString(long pos, String str) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public int setString(long pos, String str, int offset, int len) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public OutputStream setAsciiStream(long indexToWriteAt) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public Writer setCharacterStream(long indexToWriteAt) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public void truncate(long length) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public void free() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.sql.Clob
    public Reader getCharacterStream(long pos, long length) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
