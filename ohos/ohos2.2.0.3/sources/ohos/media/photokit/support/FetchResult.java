package ohos.media.photokit.support;

import java.io.Closeable;
import ohos.app.Context;
import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/support/FetchResult.class */
public class FetchResult<Type> implements Closeable {
    public static final String MEDIA_TYPE_ALBUM_LIST = "6";
    public static final String MEDIA_TYPE_ALBUM_LIST_INFO = "7";

    public FetchResult(Context callerContext, ResultSet resultSet, String type) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("Stub!");
    }

    public boolean isContain() {
        throw new RuntimeException("Stub!");
    }

    public int getCount() {
        throw new RuntimeException("Stub!");
    }

    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }

    public Type getPositionObject(int index) {
        throw new RuntimeException("Stub!");
    }

    public Type getFirstObject() {
        throw new RuntimeException("Stub!");
    }

    public Type getNextObject() {
        throw new RuntimeException("Stub!");
    }

    public Type getLastObject() {
        throw new RuntimeException("Stub!");
    }
}
