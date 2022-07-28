package ohos.aafwk.ability;

import java.io.FileDescriptor;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/PipeFileWriter.class */
public interface PipeFileWriter<T> {
    void write(FileDescriptor fileDescriptor, Uri uri, String str, PacMap pacMap, T t);
}
