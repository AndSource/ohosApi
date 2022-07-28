package ohos.global.icu.text;

import java.io.InvalidObjectException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.EnumMap;
import java.util.Locale;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter.class */
public final class RelativeDateTimeFormatter {

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$AbsoluteUnit.class */
    public enum AbsoluteUnit {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        NOW,
        QUARTER
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$Direction.class */
    public enum Direction {
        LAST_2,
        LAST,
        THIS,
        NEXT,
        NEXT_2,
        PLAIN
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$RelativeDateTimeUnit.class */
    public enum RelativeDateTimeUnit {
        YEAR,
        QUARTER,
        MONTH,
        WEEK,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$RelativeUnit.class */
    public enum RelativeUnit {
        SECONDS,
        MINUTES,
        HOURS,
        DAYS,
        WEEKS,
        MONTHS,
        YEARS
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$Style.class */
    public enum Style {
        LONG,
        SHORT,
        NARROW
    }

    RelativeDateTimeFormatter(EnumMap<Style, EnumMap<AbsoluteUnit, EnumMap<Direction, String>>> qualitativeUnitMap, EnumMap<Style, EnumMap<RelativeUnit, String[][]>> patternMap, String combinedDateAndTime, PluralRules pluralRules, NumberFormat numberFormat, Style style, DisplayContext capitalizationContext, BreakIterator breakIterator, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf) {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf, Style style, DisplayContext capitalizationContext) {
        throw new RuntimeException("Stub!");
    }

    public static RelativeDateTimeFormatter getInstance(Locale locale, NumberFormat nf) {
        throw new RuntimeException("Stub!");
    }

    public String format(double quantity, Direction direction, RelativeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public FormattedRelativeDateTime formatToValue(double quantity, Direction direction, RelativeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public String formatNumeric(double offset, RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public FormattedRelativeDateTime formatNumericToValue(double offset, RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public String format(Direction direction, AbsoluteUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public FormattedRelativeDateTime formatToValue(Direction direction, AbsoluteUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public String format(double offset, RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public FormattedRelativeDateTime formatToValue(double offset, RelativeDateTimeUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public String combineDateAndTime(String relativeDateString, String timeString) {
        throw new RuntimeException("Stub!");
    }

    public NumberFormat getNumberFormat() {
        throw new RuntimeException("Stub!");
    }

    public DisplayContext getCapitalizationContext() {
        throw new RuntimeException("Stub!");
    }

    public Style getFormatStyle() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$Field.class */
    public static class Field extends Format.Field {
        public static final Field LITERAL = null;
        public static final Field NUMERIC = null;

        Field(String fieldName) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        protected Object readResolve() throws InvalidObjectException {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/RelativeDateTimeFormatter$FormattedRelativeDateTime.class */
    public static class FormattedRelativeDateTime implements CharSequence {
        FormattedRelativeDateTime() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.CharSequence
        public String toString() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.CharSequence
        public int length() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.CharSequence
        public char charAt(int index) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int start, int end) {
            throw new RuntimeException("Stub!");
        }

        public <A extends Appendable> A appendTo(A appendable) {
            throw new RuntimeException("Stub!");
        }

        public boolean nextPosition(ConstrainedFieldPosition cfpos) {
            throw new RuntimeException("Stub!");
        }

        public AttributedCharacterIterator toCharacterIterator() {
            throw new RuntimeException("Stub!");
        }
    }
}
