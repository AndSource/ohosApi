package ohos.global.resource.solidxml;

import java.io.IOException;
import ohos.global.configuration.Configuration;
import ohos.global.configuration.DeviceCapability;
import ohos.global.resource.NotExistException;
import ohos.global.resource.Resource;
import ohos.global.resource.ResourceManager;
import ohos.global.resource.WrongTypeException;

/* loaded from: ohos2.1.1.21.jar:ohos/global/resource/solidxml/TypedAttribute.class */
public abstract class TypedAttribute {
    public static final int BOOLEAN_ATTR = 0;
    public static final int COLOR_ATTR = 1;
    public static final int FLOAT_ATTR = 2;
    public static final int GRAPHIC_ATTR = 8;
    public static final int INTEGER_ATTR = 3;
    public static final int LAYOUT_ATTR = 5;
    public static final int MEDIA_ATTR = 6;
    public static final int PATTERN_ATTR = 7;
    public static final int STRING_ATTR = 4;
    public static final int UNDEFINED_ATTR = -1;

    public abstract int getType();

    public abstract boolean getBooleanValue() throws IOException, NotExistException, WrongTypeException;

    public abstract int getColorValue() throws IOException, NotExistException, WrongTypeException;

    public abstract float getFloatValue() throws IOException, NotExistException, WrongTypeException;

    public abstract int getIntegerValue() throws IOException, NotExistException, WrongTypeException;

    public abstract String getStringValue() throws IOException, NotExistException, WrongTypeException;

    public abstract SolidXml getLayoutValue() throws IOException, NotExistException, WrongTypeException;

    public abstract String getMediaValue() throws IOException, NotExistException, WrongTypeException;

    public abstract String getOriginalValue();

    public abstract Pattern getPatternValue() throws IOException, NotExistException, WrongTypeException;

    public abstract String getName();

    public abstract int getResId() throws IOException, NotExistException, WrongTypeException;

    public abstract String getParsedValue() throws IOException, NotExistException, WrongTypeException;

    public abstract ResourceManager getResourceManager();

    public abstract Resource getMediaResource() throws IOException, NotExistException, WrongTypeException;

    public abstract int getPixelValue(boolean z) throws IOException, NotExistException, WrongTypeException;

    public TypedAttribute() {
        throw new RuntimeException("Stub!");
    }

    public static float computeTranslateRatio(DeviceCapability devCap) {
        throw new RuntimeException("Stub!");
    }

    public static int computePixelValue(String original, Configuration config, DeviceCapability devCap, boolean truncat) throws WrongTypeException {
        throw new RuntimeException("Stub!");
    }

    public static float computeFloatValue(String original, Configuration config, DeviceCapability devCap) throws WrongTypeException {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/global/resource/solidxml/TypedAttribute$AttrData.class */
    public static class AttrData {
        public AttrData() {
            throw new RuntimeException("Stub!");
        }

        public AttrData(String attrName, String attrValue) {
            throw new RuntimeException("Stub!");
        }

        public String getAttrName() {
            throw new RuntimeException("Stub!");
        }

        public void setAttrName(String attrName) {
            throw new RuntimeException("Stub!");
        }

        public String getAttrValue() {
            throw new RuntimeException("Stub!");
        }

        public void setAttrValue(String attrValue) {
            throw new RuntimeException("Stub!");
        }

        public int getAttrType() {
            throw new RuntimeException("Stub!");
        }

        public void setAttrType(int attrType) {
            throw new RuntimeException("Stub!");
        }
    }
}
