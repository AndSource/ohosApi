package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/TaiwanCalendar.class */
public class TaiwanCalendar extends GregorianCalendar {
    public static final int BEFORE_MINGUO = 0;
    public static final int MINGUO = 1;

    public TaiwanCalendar() {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public TaiwanCalendar(int year, int month, int date, int hour, int minute, int second) {
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
}
