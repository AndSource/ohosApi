package ohos.global.resource.solidxml;

import java.util.HashMap;

/* loaded from: ohos2.0.1.95.jar:ohos/global/resource/solidxml/Theme.class */
public abstract class Theme {
    public abstract HashMap<String, TypedAttribute> getThemeHash();

    public abstract Theme getCombinedTheme(Theme theme);

    public abstract void set(Theme theme);

    public abstract HashMap<String, TypedAttribute> getThemeHash(String[] strArr);

    public Theme() {
        throw new RuntimeException("Stub!");
    }
}
