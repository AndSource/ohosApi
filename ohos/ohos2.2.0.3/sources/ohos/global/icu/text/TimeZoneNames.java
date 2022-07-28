package ohos.global.icu.text;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/TimeZoneNames.class */
public abstract class TimeZoneNames implements Serializable {

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/TimeZoneNames$NameType.class */
    public enum NameType {
        LONG_GENERIC,
        LONG_STANDARD,
        LONG_DAYLIGHT,
        SHORT_GENERIC,
        SHORT_STANDARD,
        SHORT_DAYLIGHT,
        EXEMPLAR_LOCATION
    }

    public abstract Set<String> getAvailableMetaZoneIDs();

    public abstract Set<String> getAvailableMetaZoneIDs(String str);

    public abstract String getMetaZoneID(String str, long j);

    public abstract String getReferenceZoneID(String str, String str2);

    public abstract String getMetaZoneDisplayName(String str, NameType nameType);

    public abstract String getTimeZoneDisplayName(String str, NameType nameType);

    TimeZoneNames() {
        throw new RuntimeException("Stub!");
    }

    public static TimeZoneNames getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZoneNames getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZoneNames getTZDBInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public final String getDisplayName(String tzID, NameType type, long date) {
        throw new RuntimeException("Stub!");
    }

    public String getExemplarLocationName(String tzID) {
        throw new RuntimeException("Stub!");
    }
}
