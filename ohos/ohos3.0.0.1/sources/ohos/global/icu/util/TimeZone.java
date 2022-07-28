package ohos.global.icu.util;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/TimeZone.class */
public abstract class TimeZone implements Serializable, Cloneable, Freezable<TimeZone> {
    public static final int GENERIC_LOCATION = 7;
    public static final int LONG = 1;
    public static final int LONG_GENERIC = 3;
    public static final int LONG_GMT = 5;
    public static final int SHORT = 0;
    public static final int SHORT_COMMONLY_USED = 6;
    public static final int SHORT_GENERIC = 2;
    public static final int SHORT_GMT = 4;
    public static final int TIMEZONE_ICU = 0;
    public static final int TIMEZONE_JDK = 1;
    public static final String UNKNOWN_ZONE_ID = "Etc/Unknown";
    public static final TimeZone GMT_ZONE = null;
    public static final TimeZone UNKNOWN_ZONE = null;

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/TimeZone$SystemTimeZoneType.class */
    public enum SystemTimeZoneType {
        ANY,
        CANONICAL,
        CANONICAL_LOCATION
    }

    public abstract int getOffset(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void setRawOffset(int i);

    public abstract int getRawOffset();

    public abstract boolean useDaylightTime();

    public abstract boolean inDaylightTime(Date date);

    public TimeZone() {
        throw new RuntimeException("Stub!");
    }

    public int getOffset(long date) {
        throw new RuntimeException("Stub!");
    }

    public void getOffset(long date, boolean local, int[] offsets) {
        throw new RuntimeException("Stub!");
    }

    public String getID() {
        throw new RuntimeException("Stub!");
    }

    public void setID(String ID) {
        throw new RuntimeException("Stub!");
    }

    public final String getDisplayName() {
        throw new RuntimeException("Stub!");
    }

    public final String getDisplayName(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public final String getDisplayName(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public final String getDisplayName(boolean daylight, int style) {
        throw new RuntimeException("Stub!");
    }

    public String getDisplayName(boolean daylight, int style, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public String getDisplayName(boolean daylight, int style, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public int getDSTSavings() {
        throw new RuntimeException("Stub!");
    }

    public boolean observesDaylightTime() {
        throw new RuntimeException("Stub!");
    }

    public static TimeZone getTimeZone(String ID) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZone getFrozenTimeZone(String ID) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZone getTimeZone(String ID, int type) {
        throw new RuntimeException("Stub!");
    }

    public static Set<String> getAvailableIDs(SystemTimeZoneType zoneType, String region, Integer rawOffset) {
        throw new RuntimeException("Stub!");
    }

    public static String[] getAvailableIDs(int rawOffset) {
        throw new RuntimeException("Stub!");
    }

    public static String[] getAvailableIDs(String country) {
        throw new RuntimeException("Stub!");
    }

    public static String[] getAvailableIDs() {
        throw new RuntimeException("Stub!");
    }

    public static int countEquivalentIDs(String id) {
        throw new RuntimeException("Stub!");
    }

    public static String getEquivalentID(String id, int index) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZone getDefault() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSameRules(TimeZone other) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static String getTZDataVersion() {
        throw new RuntimeException("Stub!");
    }

    public static String getCanonicalID(String id) {
        throw new RuntimeException("Stub!");
    }

    public static String getCanonicalID(String id, boolean[] isSystemID) {
        throw new RuntimeException("Stub!");
    }

    public static String getRegion(String id) {
        throw new RuntimeException("Stub!");
    }

    public static String getWindowsID(String id) {
        throw new RuntimeException("Stub!");
    }

    public static String getIDForWindowsID(String winid, String region) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public TimeZone freeze() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public TimeZone cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
}
