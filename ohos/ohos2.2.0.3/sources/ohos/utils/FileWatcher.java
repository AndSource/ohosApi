package ohos.utils;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/utils/FileWatcher.class */
public class FileWatcher {

    /* loaded from: ohos2.2.0.3.jar:ohos/utils/FileWatcher$EventHandler.class */
    public interface EventHandler {
        void onEvent(WatchEvent<?> watchEvent);
    }

    public FileWatcher() {
        throw new RuntimeException("Stub!");
    }

    public void addWatch(Path directory, EventHandler eventHandler, boolean isRecursive, WatchEvent.Kind<?>... events) {
        throw new RuntimeException("Stub!");
    }
}
