package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/HebrewCalendar.class */
public class HebrewCalendar extends Calendar {
    public static final int ADAR = 6;
    public static final int ADAR_1 = 5;
    public static final int AV = 11;
    public static final int ELUL = 12;
    public static final int HESHVAN = 1;
    public static final int IYAR = 8;
    public static final int KISLEV = 2;
    public static final int NISAN = 7;
    public static final int SHEVAT = 4;
    public static final int SIVAN = 9;
    public static final int TAMUZ = 10;
    public static final int TEVET = 3;
    public static final int TISHRI = 0;

    public HebrewCalendar() {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public HebrewCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public void add(int field, int amount) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public void roll(int field, int amount) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetMonthLength(int extendedYear, int month) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetYearLength(int eyear) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected void validateField(int field) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleComputeMonthStart(int eyear, int month, boolean useMonth) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
