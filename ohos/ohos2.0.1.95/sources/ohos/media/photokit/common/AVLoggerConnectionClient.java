package ohos.media.photokit.common;

import ohos.utils.net.Uri;

/* loaded from: ohos2.0.1.95.jar:ohos/media/photokit/common/AVLoggerConnectionClient.class */
public interface AVLoggerConnectionClient {
    void onLoggerConnected();

    void onLogCompleted(String str, Uri uri);
}
