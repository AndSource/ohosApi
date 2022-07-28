package ohos.global.resource.solidxml;

import java.io.IOException;
import java.util.HashMap;
import ohos.global.resource.NotExistException;
import ohos.global.resource.Resource;
import ohos.global.resource.ResourceManager;
import ohos.global.resource.WrongTypeException;

/* loaded from: ohos2.1.1.21.jar:ohos/global/resource/solidxml/Theme.class */
public abstract class Theme {
    public abstract HashMap<String, TypedAttribute> getThemeHash();

    public abstract Theme getCombinedTheme(Theme theme);

    public abstract void set(Theme theme);

    public abstract HashMap<String, TypedAttribute> getThemeHash(String[] strArr);

    public abstract String getStringValue(String str) throws IOException, NotExistException, WrongTypeException;

    public abstract boolean getBooleanValue(String str, boolean z) throws IOException, NotExistException, WrongTypeException;

    public abstract int getColorValue(String str) throws IOException, NotExistException, WrongTypeException;

    public abstract int getIntegerValue(String str, int i) throws IOException, NotExistException, WrongTypeException;

    public abstract float getFloatValue(String str, float f) throws IOException, NotExistException, WrongTypeException;

    public abstract int getPixelValue(String str, boolean z) throws IOException, NotExistException, WrongTypeException;

    public abstract Resource getMediaValue(String str, ResourceManager resourceManager) throws IOException, NotExistException, WrongTypeException;

    public abstract TypedAttribute getValue(String str) throws NotExistException;

    public abstract int size();

    public abstract Pattern getPatternValue(String str) throws IOException, NotExistException, WrongTypeException;

    public Theme() {
        throw new RuntimeException("Stub!");
    }
}
