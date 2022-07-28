package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/util/IndianCalendar.class */
public class IndianCalendar extends Calendar {
    public static final int AGRAHAYANA = 8;
    public static final int ASADHA = 3;
    public static final int ASVINA = 6;
    public static final int BHADRA = 5;
    public static final int CHAITRA = 0;
    public static final int IE = 0;
    public static final int JYAISTHA = 2;
    public static final int KARTIKA = 7;
    public static final int MAGHA = 10;
    public static final int PAUSA = 9;
    public static final int PHALGUNA = 11;
    public static final int SRAVANA = 4;
    public static final int VAISAKHA = 1;

    public IndianCalendar() {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public IndianCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetYearLength(int extendedYear) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetMonthLength(int extendedYear, int month) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleComputeMonthStart(int year, int month, boolean useMonth) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public String getType() {
        throw new RuntimeException("Stub!");
    }
}
