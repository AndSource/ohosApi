package ohos.global.icu.util;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import ohos.global.icu.text.DateFormat;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/Calendar.class */
public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
    public static final int AM = 0;
    public static final int AM_PM = 9;
    public static final int APRIL = 3;
    public static final int AUGUST = 7;
    @Deprecated
    protected static final int BASE_FIELD_COUNT = 23;
    public static final int DATE = 5;
    public static final int DAY_OF_MONTH = 5;
    public static final int DAY_OF_WEEK = 7;
    public static final int DAY_OF_WEEK_IN_MONTH = 8;
    public static final int DAY_OF_YEAR = 6;
    public static final int DECEMBER = 11;
    public static final int DOW_LOCAL = 18;
    public static final int DST_OFFSET = 16;
    protected static final int EPOCH_JULIAN_DAY = 2440588;
    public static final int ERA = 0;
    public static final int EXTENDED_YEAR = 19;
    public static final int FEBRUARY = 1;
    public static final int FRIDAY = 6;
    protected static final int GREATEST_MINIMUM = 1;
    public static final int HOUR = 10;
    public static final int HOUR_OF_DAY = 11;
    protected static final int INTERNALLY_SET = 1;
    public static final int IS_LEAP_MONTH = 22;
    public static final int JANUARY = 0;
    protected static final int JAN_1_1_JULIAN_DAY = 1721426;
    public static final int JULIAN_DAY = 20;
    public static final int JULY = 6;
    public static final int JUNE = 5;
    protected static final int LEAST_MAXIMUM = 2;
    public static final int MARCH = 2;
    protected static final int MAXIMUM = 3;
    @Deprecated
    protected static final int MAX_FIELD_COUNT = 32;
    protected static final int MAX_JULIAN = 2130706432;
    protected static final long MAX_MILLIS = 183882168921600000L;
    public static final int MAY = 4;
    public static final int MILLISECOND = 14;
    public static final int MILLISECONDS_IN_DAY = 21;
    protected static final int MINIMUM = 0;
    protected static final int MINIMUM_USER_STAMP = 2;
    public static final int MINUTE = 12;
    protected static final int MIN_JULIAN = -2130706432;
    protected static final long MIN_MILLIS = -184303902528000000L;
    public static final int MONDAY = 2;
    public static final int MONTH = 2;
    public static final int NOVEMBER = 10;
    public static final int OCTOBER = 9;
    protected static final long ONE_DAY = 86400000;
    protected static final int ONE_HOUR = 3600000;
    protected static final int ONE_MINUTE = 60000;
    protected static final int ONE_SECOND = 1000;
    protected static final long ONE_WEEK = 604800000;
    public static final int PM = 1;
    protected static final int RESOLVE_REMAP = 32;
    public static final int SATURDAY = 7;
    public static final int SECOND = 13;
    public static final int SEPTEMBER = 8;
    public static final int SUNDAY = 1;
    public static final int THURSDAY = 5;
    public static final int TUESDAY = 3;
    public static final int UNDECIMBER = 12;
    protected static final int UNSET = 0;
    public static final int WALLTIME_FIRST = 1;
    public static final int WALLTIME_LAST = 0;
    public static final int WALLTIME_NEXT_VALID = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEK_OF_MONTH = 4;
    public static final int WEEK_OF_YEAR = 3;
    public static final int YEAR = 1;
    public static final int YEAR_WOY = 17;
    public static final int ZONE_OFFSET = 15;
    protected static final Date MAX_DATE = null;
    protected static final Date MIN_DATE = null;

    protected abstract int handleGetLimit(int i, int i2);

    protected abstract int handleComputeMonthStart(int i, int i2, boolean z);

    protected abstract int handleGetExtendedYear();

    protected Calendar() {
        throw new RuntimeException("Stub!");
    }

    protected Calendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    protected Calendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getInstance(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }

    public static final String[] getKeywordValuesForLocale(String key, ULocale locale, boolean commonlyUsed) {
        throw new RuntimeException("Stub!");
    }

    public final Date getTime() {
        throw new RuntimeException("Stub!");
    }

    public final void setTime(Date date) {
        throw new RuntimeException("Stub!");
    }

    public long getTimeInMillis() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeInMillis(long millis) {
        throw new RuntimeException("Stub!");
    }

    public final int get(int field) {
        throw new RuntimeException("Stub!");
    }

    protected final int internalGet(int field) {
        throw new RuntimeException("Stub!");
    }

    protected final int internalGet(int field, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public final void set(int field, int value) {
        throw new RuntimeException("Stub!");
    }

    public final void set(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public final void set(int year, int month, int date, int hour, int minute) {
        throw new RuntimeException("Stub!");
    }

    public final void set(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    public final void clear() {
        throw new RuntimeException("Stub!");
    }

    public final void clear(int field) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isSet(int field) {
        throw new RuntimeException("Stub!");
    }

    protected void complete() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEquivalentTo(Calendar other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean before(Object when) {
        throw new RuntimeException("Stub!");
    }

    public boolean after(Object when) {
        throw new RuntimeException("Stub!");
    }

    public int getActualMaximum(int field) {
        throw new RuntimeException("Stub!");
    }

    public int getActualMinimum(int field) {
        throw new RuntimeException("Stub!");
    }

    protected void prepareGetActual(int field, boolean isMinimum) {
        throw new RuntimeException("Stub!");
    }

    public final void roll(int field, boolean up) {
        throw new RuntimeException("Stub!");
    }

    public void roll(int field, int amount) {
        throw new RuntimeException("Stub!");
    }

    public void add(int field, int amount) {
        throw new RuntimeException("Stub!");
    }

    public String getDisplayName(Locale loc) {
        throw new RuntimeException("Stub!");
    }

    public String getDisplayName(ULocale loc) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(Calendar that) {
        throw new RuntimeException("Stub!");
    }

    public DateFormat getDateTimeFormat(int dateStyle, int timeStyle, Locale loc) {
        throw new RuntimeException("Stub!");
    }

    public DateFormat getDateTimeFormat(int dateStyle, int timeStyle, ULocale loc) {
        throw new RuntimeException("Stub!");
    }

    protected DateFormat handleGetDateFormat(String pattern, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    protected DateFormat handleGetDateFormat(String pattern, String override, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    protected DateFormat handleGetDateFormat(String pattern, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    protected void pinField(int field) {
        throw new RuntimeException("Stub!");
    }

    protected int weekNumber(int desiredDay, int dayOfPeriod, int dayOfWeek) {
        throw new RuntimeException("Stub!");
    }

    protected final int weekNumber(int dayOfPeriod, int dayOfWeek) {
        throw new RuntimeException("Stub!");
    }

    public int fieldDifference(Date when, int field) {
        throw new RuntimeException("Stub!");
    }

    public void setTimeZone(TimeZone value) {
        throw new RuntimeException("Stub!");
    }

    public TimeZone getTimeZone() {
        throw new RuntimeException("Stub!");
    }

    public void setLenient(boolean lenient) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLenient() {
        throw new RuntimeException("Stub!");
    }

    public void setRepeatedWallTimeOption(int option) {
        throw new RuntimeException("Stub!");
    }

    public int getRepeatedWallTimeOption() {
        throw new RuntimeException("Stub!");
    }

    public void setSkippedWallTimeOption(int option) {
        throw new RuntimeException("Stub!");
    }

    public int getSkippedWallTimeOption() {
        throw new RuntimeException("Stub!");
    }

    public void setFirstDayOfWeek(int value) {
        throw new RuntimeException("Stub!");
    }

    public int getFirstDayOfWeek() {
        throw new RuntimeException("Stub!");
    }

    public void setMinimalDaysInFirstWeek(int value) {
        throw new RuntimeException("Stub!");
    }

    public int getMinimalDaysInFirstWeek() {
        throw new RuntimeException("Stub!");
    }

    protected int getLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    public final int getMinimum(int field) {
        throw new RuntimeException("Stub!");
    }

    public final int getMaximum(int field) {
        throw new RuntimeException("Stub!");
    }

    public final int getGreatestMinimum(int field) {
        throw new RuntimeException("Stub!");
    }

    public final int getLeastMaximum(int field) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWeekend(Date date) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWeekend() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public static WeekData getWeekDataForRegion(String region) {
        throw new RuntimeException("Stub!");
    }

    public WeekData getWeekData() {
        throw new RuntimeException("Stub!");
    }

    public Calendar setWeekData(WeekData wdata) {
        throw new RuntimeException("Stub!");
    }

    protected void computeFields() {
        throw new RuntimeException("Stub!");
    }

    protected final void computeGregorianFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    protected int resolveFields(int[][][] precedenceTable) {
        throw new RuntimeException("Stub!");
    }

    protected int newestStamp(int first, int last, int bestStampSoFar) {
        throw new RuntimeException("Stub!");
    }

    protected final int getStamp(int field) {
        throw new RuntimeException("Stub!");
    }

    protected int newerField(int defaultField, int alternateField) {
        throw new RuntimeException("Stub!");
    }

    protected void validateFields() {
        throw new RuntimeException("Stub!");
    }

    protected void validateField(int field) {
        throw new RuntimeException("Stub!");
    }

    protected final void validateField(int field, int min, int max) {
        throw new RuntimeException("Stub!");
    }

    protected void computeTime() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected int computeMillisInDay() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected int computeZoneOffset(long millis, int millisInDay) {
        throw new RuntimeException("Stub!");
    }

    protected int computeJulianDay() {
        throw new RuntimeException("Stub!");
    }

    protected int[][][] getFieldResolutionTable() {
        throw new RuntimeException("Stub!");
    }

    protected int handleGetMonthLength(int extendedYear, int month) {
        throw new RuntimeException("Stub!");
    }

    protected int handleGetYearLength(int eyear) {
        throw new RuntimeException("Stub!");
    }

    protected int[] handleCreateFields() {
        throw new RuntimeException("Stub!");
    }

    protected int handleComputeJulianDay(int bestField) {
        throw new RuntimeException("Stub!");
    }

    protected int computeGregorianMonthStart(int year, int month) {
        throw new RuntimeException("Stub!");
    }

    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    protected final int getGregorianYear() {
        throw new RuntimeException("Stub!");
    }

    protected final int getGregorianMonth() {
        throw new RuntimeException("Stub!");
    }

    protected final int getGregorianDayOfYear() {
        throw new RuntimeException("Stub!");
    }

    protected final int getGregorianDayOfMonth() {
        throw new RuntimeException("Stub!");
    }

    public final int getFieldCount() {
        throw new RuntimeException("Stub!");
    }

    protected final void internalSet(int field, int value) {
        throw new RuntimeException("Stub!");
    }

    protected static final boolean isGregorianLeapYear(int year) {
        throw new RuntimeException("Stub!");
    }

    protected static final int gregorianMonthLength(int y, int m) {
        throw new RuntimeException("Stub!");
    }

    protected static final int gregorianPreviousMonthLength(int y, int m) {
        throw new RuntimeException("Stub!");
    }

    protected static final long floorDivide(long numerator, long denominator) {
        throw new RuntimeException("Stub!");
    }

    protected static final int floorDivide(int numerator, int denominator) {
        throw new RuntimeException("Stub!");
    }

    protected static final int floorDivide(int numerator, int denominator, int[] remainder) {
        throw new RuntimeException("Stub!");
    }

    protected static final int floorDivide(long numerator, int denominator, int[] remainder) {
        throw new RuntimeException("Stub!");
    }

    protected String fieldName(int field) {
        throw new RuntimeException("Stub!");
    }

    protected static final int millisToJulianDay(long millis) {
        throw new RuntimeException("Stub!");
    }

    protected static final long julianDayToMillis(int julian) {
        throw new RuntimeException("Stub!");
    }

    protected static final int julianDayToDayOfWeek(int julian) {
        throw new RuntimeException("Stub!");
    }

    protected final long internalGetTimeInMillis() {
        throw new RuntimeException("Stub!");
    }

    public String getType() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/Calendar$WeekData.class */
    public static final class WeekData {
        public final int firstDayOfWeek = 0;
        public final int minimalDaysInFirstWeek = 0;
        public final int weekendCease = 0;
        public final int weekendCeaseMillis = 0;
        public final int weekendOnset = 0;
        public final int weekendOnsetMillis = 0;

        public WeekData(int fdow, int mdifw, int weekendOnset, int weekendOnsetMillis, int weekendCease, int weekendCeaseMillis) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object other) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
