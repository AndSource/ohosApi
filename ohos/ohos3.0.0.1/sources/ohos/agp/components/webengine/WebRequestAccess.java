package ohos.agp.components.webengine;

import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/WebRequestAccess.class */
public interface WebRequestAccess {
    public static final String ACCESS_CAMERA = "ohos.webengine.access.CAMERA";
    public static final String ACCESS_MICROPHONE = "ohos.webengine.access.MICROPHONE";
    public static final String ACCESS_MIDI_PRIVILEGED_MESSAGES = "ohos.webengine.access.MIDI_PRIVILEGED_MESSAGES";
    public static final String ACCESS_PROTECTED_MEDIA_IDENTIFIER = "ohos.webengine.access.PROTECTED_MEDIA_IDENTIFIER";

    Uri getWebContentOrigin();

    String[] getWebContentAccess();

    void grantAccess(String[] strArr);

    void denyAccess();
}
