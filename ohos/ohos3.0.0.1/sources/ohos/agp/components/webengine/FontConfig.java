package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/FontConfig.class */
public interface FontConfig {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/FontConfig$FontGenericFamily.class */
    public enum FontGenericFamily {
        GENERIC_FAMILY_STANDARD,
        GENERIC_FAMILY_FIXED,
        GENERIC_FAMILY_SERIF,
        GENERIC_FAMILY_SANS_SERIF,
        GENERIC_FAMILY_CURSIVE,
        GENERIC_FAMILY_FANTASY
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/FontConfig$FontSizeType.class */
    public enum FontSizeType {
        SIZE_TYPE_DEFAULT,
        SIZE_TYPE_DEFAULT_FIXED,
        SIZE_TYPE_MINIMUM,
        SIZE_TYPE_MINIMUM_LOGICAL
    }

    void setFontFamily(FontGenericFamily fontGenericFamily, String str);

    String getFontFamily(FontGenericFamily fontGenericFamily);

    void setFontSize(FontSizeType fontSizeType, int i);

    int getFontSize(FontSizeType fontSizeType);
}
