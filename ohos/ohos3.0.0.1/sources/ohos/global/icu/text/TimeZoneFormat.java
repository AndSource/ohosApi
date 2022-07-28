package ohos.global.icu.text;

import java.io.Serializable;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.EnumSet;
import java.util.Locale;
import ohos.global.icu.util.Freezable;
import ohos.global.icu.util.Output;
import ohos.global.icu.util.TimeZone;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/TimeZoneFormat.class */
public class TimeZoneFormat extends UFormat implements Freezable<TimeZoneFormat>, Serializable {

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/TimeZoneFormat$GMTOffsetPatternType.class */
    public enum GMTOffsetPatternType {
        POSITIVE_HM,
        POSITIVE_HMS,
        NEGATIVE_HM,
        NEGATIVE_HMS,
        POSITIVE_H,
        NEGATIVE_H
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/TimeZoneFormat$ParseOption.class */
    public enum ParseOption {
        ALL_STYLES,
        TZ_DATABASE_ABBREVIATIONS
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/TimeZoneFormat$Style.class */
    public enum Style {
        GENERIC_LOCATION,
        GENERIC_LONG,
        GENERIC_SHORT,
        SPECIFIC_LONG,
        SPECIFIC_SHORT,
        LOCALIZED_GMT,
        LOCALIZED_GMT_SHORT,
        ISO_BASIC_SHORT,
        ISO_BASIC_LOCAL_SHORT,
        ISO_BASIC_FIXED,
        ISO_BASIC_LOCAL_FIXED,
        ISO_BASIC_FULL,
        ISO_BASIC_LOCAL_FULL,
        ISO_EXTENDED_FIXED,
        ISO_EXTENDED_LOCAL_FIXED,
        ISO_EXTENDED_FULL,
        ISO_EXTENDED_LOCAL_FULL,
        ZONE_ID,
        ZONE_ID_SHORT,
        EXEMPLAR_LOCATION
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/TimeZoneFormat$TimeType.class */
    public enum TimeType {
        UNKNOWN,
        STANDARD,
        DAYLIGHT
    }

    protected TimeZoneFormat(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZoneFormat getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static TimeZoneFormat getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneNames getTimeZoneNames() {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setTimeZoneNames(TimeZoneNames tznames) {
        throw new RuntimeException("Stub!");
    }

    public String getGMTPattern() {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setGMTPattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public String getGMTOffsetPattern(GMTOffsetPatternType type) {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setGMTOffsetPattern(GMTOffsetPatternType type, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public String getGMTOffsetDigits() {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setGMTOffsetDigits(String digits) {
        throw new RuntimeException("Stub!");
    }

    public String getGMTZeroFormat() {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setGMTZeroFormat(String gmtZeroFormat) {
        throw new RuntimeException("Stub!");
    }

    public TimeZoneFormat setDefaultParseOptions(EnumSet<ParseOption> options) {
        throw new RuntimeException("Stub!");
    }

    public EnumSet<ParseOption> getDefaultParseOptions() {
        throw new RuntimeException("Stub!");
    }

    public final String formatOffsetISO8601Basic(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) {
        throw new RuntimeException("Stub!");
    }

    public final String formatOffsetISO8601Extended(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) {
        throw new RuntimeException("Stub!");
    }

    public String formatOffsetLocalizedGMT(int offset) {
        throw new RuntimeException("Stub!");
    }

    public String formatOffsetShortLocalizedGMT(int offset) {
        throw new RuntimeException("Stub!");
    }

    public final String format(Style style, TimeZone tz, long date) {
        throw new RuntimeException("Stub!");
    }

    public String format(Style style, TimeZone tz, long date, Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }

    public final int parseOffsetISO8601(String text, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public int parseOffsetLocalizedGMT(String text, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public int parseOffsetShortLocalizedGMT(String text, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public TimeZone parse(Style style, String text, ParsePosition pos, EnumSet<ParseOption> options, Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }

    public TimeZone parse(Style style, String text, ParsePosition pos, Output<TimeType> timeType) {
        throw new RuntimeException("Stub!");
    }

    public final TimeZone parse(String text, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public final TimeZone parse(String text) throws ParseException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public Object parseObject(String source, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public TimeZoneFormat freeze() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public TimeZoneFormat cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
}
