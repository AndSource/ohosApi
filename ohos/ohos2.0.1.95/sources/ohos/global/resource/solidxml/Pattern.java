package ohos.global.resource.solidxml;

import java.util.HashMap;

/* loaded from: ohos2.0.1.95.jar:ohos/global/resource/solidxml/Pattern.class */
public abstract class Pattern {
    public abstract HashMap<String, TypedAttribute> getPatternHash();

    public abstract Pattern getCombinedPattern(Pattern pattern);

    public abstract void set(Pattern pattern);

    public abstract HashMap<String, TypedAttribute> getPatternHash(String[] strArr);

    public Pattern() {
        throw new RuntimeException("Stub!");
    }
}
