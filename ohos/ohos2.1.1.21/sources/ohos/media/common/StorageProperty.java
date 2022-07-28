package ohos.media.common;

import java.io.File;
import java.io.FileDescriptor;

/* loaded from: ohos2.1.1.21.jar:ohos/media/common/StorageProperty.class */
public final class StorageProperty {
    public static final int MAX_DURATION_MS_INIT = -1;
    public static final long MAX_FILE_SIZE_BYTES_INIT = -1;
    public static final FileDescriptor FD_INIT = null;
    public static final File FILE_INIT = null;
    public static final String PATH_INIT = null;

    StorageProperty() {
        throw new RuntimeException("Stub!");
    }

    public int getRecorderMaxDurationMs() {
        throw new RuntimeException("Stub!");
    }

    public long getRecorderMaxFileSizeBytes() {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor getRecorderFd() {
        throw new RuntimeException("Stub!");
    }

    public File getRecorderFile() {
        throw new RuntimeException("Stub!");
    }

    public String getRecorderPath() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/common/StorageProperty$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(StorageProperty property) {
            throw new RuntimeException("Stub!");
        }

        public StorageProperty build() {
            throw new RuntimeException("Stub!");
        }

        public Builder setRecorderMaxDurationMs(int recorderMaxDurationMs) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRecorderMaxFileSizeBytes(long recorderMaxFileSizeBytes) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRecorderFd(FileDescriptor recorderFd) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRecorderFile(File recorderFile) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRecorderPath(String recorderPath) {
            throw new RuntimeException("Stub!");
        }
    }
}
