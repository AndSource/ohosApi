package ohos.agp.components.webengine;

import java.util.Set;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/LocationAccessController.class */
public abstract class LocationAccessController {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/LocationAccessController$Response.class */
    public interface Response {
        void apply(String str, boolean z, boolean z2);
    }

    public abstract void setOriginAllow(String str, boolean z);

    public abstract void disallowAll();

    public abstract void checkOriginAllowed(String str, AsyncCallback<Boolean> asyncCallback);

    public abstract void getAllOrigins(AsyncCallback<Set<String>> asyncCallback);

    public LocationAccessController() {
        throw new RuntimeException("Stub!");
    }

    public static LocationAccessController getInstance() {
        throw new RuntimeException("Stub!");
    }
}
