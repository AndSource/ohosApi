package ohos.global.configuration;

import java.util.Locale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/configuration/Configuration.class */
public class Configuration {
    public static final int AUTO_MODE = -1;
    public static final int DARK_MODE = 0;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_UNDEFINED = -1;
    public static final int DIRECTION_VERTICAL = 0;
    public static final int LIGHT_MODE = 1;
    public static final int MCC_UNDEFINED = 0;
    public static final int MNC_UNDEFINED = 0;
    public static final float SCALE_UNDEFINED = -1.0f;
    public int colorMode;
    public int direction;
    public float fontRatio;
    public boolean isLayoutRTL;
    public int mcc;
    public int mnc;

    public Configuration() {
        throw new RuntimeException("Stub!");
    }

    public Configuration(Configuration config) {
        throw new RuntimeException("Stub!");
    }

    public LocaleProfile getLocaleProfile() {
        throw new RuntimeException("Stub!");
    }

    public void setLocaleProfile(LocaleProfile localeProfile) {
        throw new RuntimeException("Stub!");
    }

    public Locale getFirstLocale() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public int getSystemColorMode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
