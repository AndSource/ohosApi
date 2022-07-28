package ohos.data.distributed.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/* loaded from: ohos2.0.1.95.jar:ohos/data/distributed/file/DistFile.class */
public class DistFile extends File {
    public DistFile(String path) {
        super((String) null);
        throw new RuntimeException("Stub!");
    }

    public boolean isDistFile() {
        throw new RuntimeException("Stub!");
    }

    public String getDevice() {
        throw new RuntimeException("Stub!");
    }

    public String getGroup() {
        throw new RuntimeException("Stub!");
    }

    public boolean copyTo(DistFile file) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    public DistFile getParentFile() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    public DistFile[] listFiles() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    public DistFile[] listFiles(FileFilter filter) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.File
    public DistFile[] listFiles(FilenameFilter filter) {
        throw new RuntimeException("Stub!");
    }
}
