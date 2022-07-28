package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/AuthRequest.class */
public interface AuthRequest {
    void respond(String str, String str2);

    void cancel();

    boolean isCredentialsStored();
}
