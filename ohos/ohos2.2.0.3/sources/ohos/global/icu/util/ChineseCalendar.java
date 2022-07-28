package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;
import ohos.global.icu.text.DateFormat;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/ChineseCalendar.class */
public class ChineseCalendar extends Calendar {
    public ChineseCalendar() {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(int year, int month, int isLeapMonth, int date) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(int year, int month, int isLeapMonth, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(int era, int year, int month, int isLeapMonth, int date) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(int era, int year, int month, int isLeapMonth, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public ChineseCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleGetMonthLength(int extendedYear, int month) {
        throw new RuntimeException("Stub!");
    }

    protected DateFormat handleGetDateFormat(String pattern, String override, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int[][][] getFieldResolutionTable() {
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
    protected void handleComputeFields(int julianDay) {
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
