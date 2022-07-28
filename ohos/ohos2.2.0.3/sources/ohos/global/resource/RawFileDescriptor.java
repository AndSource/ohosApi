package ohos.global.resource;

import java.io.FileDescriptor;

/* loaded from: ohos2.2.0.3.jar:ohos/global/resource/RawFileDescriptor.class */
public abstract class RawFileDescriptor extends BaseFileDescriptor {
    @Override // ohos.global.resource.BaseFileDescriptor
    public abstract FileDescriptor getFileDescriptor();

    @Override // ohos.global.resource.BaseFileDescriptor
    public abstract long getFileSize();

    @Override // ohos.global.resource.BaseFileDescriptor
    public abstract long getStartPosition();

    public RawFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
}
