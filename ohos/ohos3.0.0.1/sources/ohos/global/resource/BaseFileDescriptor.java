package ohos.global.resource;

import java.io.Closeable;
import java.io.FileDescriptor;

/* loaded from: ohos3.0.0.1.jar:ohos/global/resource/BaseFileDescriptor.class */
public abstract class BaseFileDescriptor implements Closeable {
    public abstract FileDescriptor getFileDescriptor();

    public abstract long getFileSize();

    public abstract long getStartPosition();

    public BaseFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
}
