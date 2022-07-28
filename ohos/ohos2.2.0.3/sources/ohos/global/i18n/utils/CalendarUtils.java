package ohos.global.i18n.utils;

import java.util.Locale;
import ohos.global.icu.util.Calendar;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/i18n/utils/CalendarUtils.class */
public abstract class CalendarUtils {
    @Deprecated
    public abstract String getCalendarName(Calendar calendar, ULocale uLocale);

    public CalendarUtils() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static CalendarUtils getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static String getCalendarName(Calendar cal, Locale loc) {
        throw new RuntimeException("Stub!");
    }

    public static Calendar getPersianCalendar(Locale locale) {
        throw new RuntimeException("Stub!");
    }
}
