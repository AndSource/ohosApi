package ohos.agp.components.webengine;

import java.util.Map;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/ResourceRequest.class */
public interface ResourceRequest {
    Uri getRequestUrl();

    Map<String, String> getHeaders();

    boolean isServerSideRedirected();

    boolean isMainFrame();

    String getMethod();
}
