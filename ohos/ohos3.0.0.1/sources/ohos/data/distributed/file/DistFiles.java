package ohos.data.distributed.file;

import java.io.IOException;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/data/distributed/file/DistFiles.class */
public class DistFiles {
    @Deprecated
    public DistFiles() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean isSupported() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static DistFile createFile(String path) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static DistLinkFile createLinkFile(String path, String target) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static DistAgentFile createAgentFile(String path, String target) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static DistAgentFile createAgentFile(String path, String target, String targetDevice) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean delete(String path) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean delete(DistFile file) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean copy(DistFile src, DistFile dst) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean move(DistFile src, DistFile dst) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
