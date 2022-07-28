package ohos.media.photokit.common;

import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/media/photokit/common/AVLoggerConnectionClient.class */
public interface AVLoggerConnectionClient {
    void onLoggerConnected();

    void onLogCompleted(String str, Uri uri);
}
