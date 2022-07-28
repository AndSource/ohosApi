package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/GregorianCalendar.class */
public class GregorianCalendar extends Calendar {
    public static final int AD = 1;
    public static final int BC = 0;
    protected transient boolean invertGregorian;
    protected transient boolean isGregorian;

    public GregorianCalendar() {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(int year, int month, int date, int hour, int minute) {
        throw new RuntimeException("Stub!");
    }

    public GregorianCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    public void setGregorianChange(Date date) {
        throw new RuntimeException("Stub!");
    }

    public final Date getGregorianChange() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLeapYear(int year) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public boolean isEquivalentTo(Calendar other) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public void roll(int field, int amount) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public int getActualMinimum(int field) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public int getActualMaximum(int field) {
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
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleComputeJulianDay(int bestField) {
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
