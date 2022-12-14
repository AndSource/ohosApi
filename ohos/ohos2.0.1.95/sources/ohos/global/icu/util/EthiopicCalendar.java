package ohos.global.icu.util;

import java.util.Date;
import java.util.Locale;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/util/EthiopicCalendar.class */
public final class EthiopicCalendar extends Calendar {
    public static final int GENBOT = 8;
    public static final int HAMLE = 10;
    public static final int HEDAR = 2;
    public static final int MEGABIT = 6;
    public static final int MESKEREM = 0;
    public static final int MIAZIA = 7;
    public static final int NEHASSE = 11;
    public static final int PAGUMEN = 12;
    public static final int SENE = 9;
    public static final int TAHSAS = 3;
    public static final int TEKEMT = 1;
    public static final int TER = 4;
    public static final int YEKATIT = 5;

    public EthiopicCalendar() {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(TimeZone zone) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(TimeZone zone, Locale aLocale) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(TimeZone zone, ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(int year, int month, int date) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(Date date) {
        throw new RuntimeException("Stub!");
    }

    public EthiopicCalendar(int year, int month, int date, int hour, int minute, int second) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    public String getType() {
        throw new RuntimeException("Stub!");
    }

    public void setAmeteAlemEra(boolean onOff) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAmeteAlemEra() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected int handleGetExtendedYear() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected void handleComputeFields(int julianDay) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    @Deprecated
    protected int handleGetLimit(int field, int limitType) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Calendar
    protected int handleComputeMonthStart(int eyear, int emonth, boolean useMonth) {
        throw new RuntimeException("Stub!");
    }
}
