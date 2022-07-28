package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Clock.class */
public class Clock extends Text {
    public Clock(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Clock(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Clock(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setFormatIn12HourMode(CharSequence format) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getFormatIn12HourMode() {
        throw new RuntimeException("Stub!");
    }

    public void setFormatIn24HourMode(CharSequence format) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getFormatIn24HourMode() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeZone(String timeZone) {
        throw new RuntimeException("Stub!");
    }

    public String getTimeZone() {
        throw new RuntimeException("Stub!");
    }

    public void setTime(long time) {
        throw new RuntimeException("Stub!");
    }

    public long getTime() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void set24HourModeEnabled(boolean format24Hour) {
        throw new RuntimeException("Stub!");
    }

    public boolean is24HourMode() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeFormat(TimeFormat timeFormat) {
        throw new RuntimeException("Stub!");
    }

    public TimeFormat getTimeFormat() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Clock$TimeFormat.class */
    public enum TimeFormat {
        CLOCK_12,
        CLOCK_24,
        CLOCK_SYSTEM;

        protected int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
