package ohos.data.usage;

import java.io.File;
import java.util.List;
import java.util.Optional;
import ohos.app.Context;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/data/usage/DataUsage.class */
public final class DataUsage {
    DataUsage() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isSupported() {
        throw new RuntimeException("Stub!");
    }

    public static MountState getDiskMountedStatus() {
        throw new RuntimeException("Stub!");
    }

    public static MountState getDiskMountedStatus(File path) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDiskPluggable() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDiskPluggable(File path) {
        throw new RuntimeException("Stub!");
    }

    public static Optional<List<Volume>> getVolumes() {
        throw new RuntimeException("Stub!");
    }

    public static Optional<Volume> getVolume(File file) {
        throw new RuntimeException("Stub!");
    }

    public static Optional<Volume> getVolume(Context context, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDiskEmulated() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDiskEmulated(File path) {
        throw new RuntimeException("Stub!");
    }
}
