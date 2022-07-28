package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/JapaneseCalendar.class */
public class JapaneseCalendar extends GregorianCalendar {
    public static final int CURRENT_ERA = 0;
    public static final int HEISEI = 0;
    public static final int MEIJI = 0;
    public static final int REIWA = 0;
    public static final int SHOWA = 0;
    public static final int TAISHO = 0;

    public JapaneseCalendar() {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(int era, int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public JapaneseCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.GregorianCalendar, ohos.global.icu.util.Calendar
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.GregorianCalendar, ohos.global.icu.util.Calendar
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.GregorianCalendar, ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.GregorianCalendar, ohos.global.icu.util.Calendar
    public String getType() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.GregorianCalendar, ohos.global.icu.util.Calendar
    public int getActualMaximum(int field) {
        throw new RuntimeException("Stub!");
    }
}
