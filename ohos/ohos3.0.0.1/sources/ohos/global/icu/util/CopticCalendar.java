package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/CopticCalendar.class */
public final class CopticCalendar extends Calendar {
    public static final int AMSHIR = 5;
    public static final int BABA = 1;
    public static final int BARAMHAT = 6;
    public static final int BARAMOUDA = 7;
    public static final int BASHANS = 8;
    public static final int EPEP = 10;
    public static final int HATOR = 2;
    public static final int KIAHK = 3;
    public static final int MESRA = 11;
    public static final int NASIE = 12;
    public static final int PAONA = 9;
    public static final int TOBA = 4;
    public static final int TOUT = 0;

    public CopticCalendar() {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public CopticCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public String getType() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleComputeMonthStart(int eyear, int emonth, boolean useMonth) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }
}
