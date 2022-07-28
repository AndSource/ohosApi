package ohos.global.icu.text;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Locale;
import ohos.global.icu.util.Calendar;
import ohos.global.icu.util.DateInterval;
import ohos.global.icu.util.TimeZone;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/DateIntervalFormat.class */
public class DateIntervalFormat extends UFormat {
    DateIntervalFormat() {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton) {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton, DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton, Locale locale, DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }

    public static final DateIntervalFormat getInstance(String skeleton, ULocale locale, DateIntervalInfo dtitvinf) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public synchronized Object clone() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer appendTo, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    public final StringBuffer format(DateInterval dtInterval, StringBuffer appendTo, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    public final StringBuffer format(Calendar fromCalendar, Calendar toCalendar, StringBuffer appendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    @Deprecated
    public Object parseObject(String source, ParsePosition parse_pos) {
        throw new RuntimeException("Stub!");
    }

    public DateIntervalInfo getDateIntervalInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setDateIntervalInfo(DateIntervalInfo newItvPattern) {
        throw new RuntimeException("Stub!");
    }

    public TimeZone getTimeZone() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeZone(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public synchronized DateFormat getDateFormat() {
        throw new RuntimeException("Stub!");
    }
}
