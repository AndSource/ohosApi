package ohos.data.distributed.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/data/distributed/file/DistFile.class */
public class DistFile extends File {
    @Deprecated
    public DistFile(String path) {
        super((String) null);
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean isDistFile() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getDevice() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getGroup() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean copyTo(DistFile file) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    @Deprecated
    public DistFile getParentFile() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    @Deprecated
    public DistFile[] listFiles() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    @Deprecated
    public DistFile[] listFiles(FileFilter filter) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    @Deprecated
    public DistFile[] listFiles(FilenameFilter filter) {
        throw new RuntimeException("Stub!");
    }
}
