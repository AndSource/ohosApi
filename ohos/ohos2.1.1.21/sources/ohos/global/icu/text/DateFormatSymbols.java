package ohos.global.icu.text;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;
import ohos.global.icu.util.Calendar;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/DateFormatSymbols.class */
public class DateFormatSymbols implements Serializable, Cloneable {
    public static final int ABBREVIATED = 0;
    public static final int FORMAT = 0;
    public static final int NARROW = 2;
    public static final int SHORT = 3;
    public static final int STANDALONE = 1;
    public static final int WIDE = 1;

    public DateFormatSymbols() {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(Calendar cal, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(Calendar cal, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(Class<? extends Calendar> calendarClass, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(Class<? extends Calendar> calendarClass, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(ResourceBundle bundle, Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateFormatSymbols(ResourceBundle bundle, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static DateFormatSymbols getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static DateFormatSymbols getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static DateFormatSymbols getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }

    public String[] getEras() {
        throw new RuntimeException("Stub!");
    }

    public void setEras(String[] newEras) {
        throw new RuntimeException("Stub!");
    }

    public String[] getEraNames() {
        throw new RuntimeException("Stub!");
    }

    public void setEraNames(String[] newEraNames) {
        throw new RuntimeException("Stub!");
    }

    public String[] getNarrowEras() {
        throw new RuntimeException("Stub!");
    }

    public void setNarrowEras(String[] newNarrowEras) {
        throw new RuntimeException("Stub!");
    }

    public String[] getMonths() {
        throw new RuntimeException("Stub!");
    }

    public String[] getMonths(int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setMonths(String[] newMonths) {
        throw new RuntimeException("Stub!");
    }

    public void setMonths(String[] newMonths, int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public String[] getShortMonths() {
        throw new RuntimeException("Stub!");
    }

    public void setShortMonths(String[] newShortMonths) {
        throw new RuntimeException("Stub!");
    }

    public String[] getWeekdays() {
        throw new RuntimeException("Stub!");
    }

    public String[] getWeekdays(int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setWeekdays(String[] newWeekdays, int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setWeekdays(String[] newWeekdays) {
        throw new RuntimeException("Stub!");
    }

    public String[] getShortWeekdays() {
        throw new RuntimeException("Stub!");
    }

    public void setShortWeekdays(String[] newAbbrevWeekdays) {
        throw new RuntimeException("Stub!");
    }

    public String[] getQuarters(int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setQuarters(String[] newQuarters, int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public String[] getYearNames(int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setYearNames(String[] yearNames, int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public String[] getZodiacNames(int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public void setZodiacNames(String[] zodiacNames, int context, int width) {
        throw new RuntimeException("Stub!");
    }

    public String[] getAmPmStrings() {
        throw new RuntimeException("Stub!");
    }

    public void setAmPmStrings(String[] newAmpms) {
        throw new RuntimeException("Stub!");
    }

    public String[][] getZoneStrings() {
        throw new RuntimeException("Stub!");
    }

    public void setZoneStrings(String[][] newZoneStrings) {
        throw new RuntimeException("Stub!");
    }

    public String getLocalPatternChars() {
        throw new RuntimeException("Stub!");
    }

    public void setLocalPatternChars(String newLocalPatternChars) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    protected void initializeData(ULocale desiredLocale, String type) {
        throw new RuntimeException("Stub!");
    }
}
