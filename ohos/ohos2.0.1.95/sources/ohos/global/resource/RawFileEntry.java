package ohos.global.resource;

import java.io.IOException;
import ohos.global.resource.Entry;

/* loaded from: ohos2.0.1.95.jar:ohos/global/resource/RawFileEntry.class */
public abstract class RawFileEntry {
    public abstract Resource openRawFile() throws IOException;

    public abstract RawFileDescriptor openRawFileDescriptor() throws IOException;

    public abstract Entry[] getEntries() throws IOException;

    public abstract Entry.Type getType();

    public RawFileEntry() {
        throw new RuntimeException("Stub!");
    }
}
