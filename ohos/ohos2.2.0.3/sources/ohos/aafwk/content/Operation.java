package ohos.aafwk.content;

import java.util.Set;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/content/Operation.class */
public interface Operation {
    String getAction();

    Set<String> getEntities();

    String getBundleName();

    Uri getUri();

    int getFlags();

    String getDeviceId();

    String getAbilityName();
}
