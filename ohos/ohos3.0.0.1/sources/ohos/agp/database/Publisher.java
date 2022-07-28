package ohos.agp.database;

import java.util.List;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/database/Publisher.class */
public abstract class Publisher<T> {
    protected final List<T> mSubscribers = null;

    public Publisher() {
        throw new RuntimeException("Stub!");
    }

    public void registerSubscriber(T subscriber) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterSubscriber(T subscriber) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterSubscriber(long subscriber) {
        throw new RuntimeException("Stub!");
    }
}
