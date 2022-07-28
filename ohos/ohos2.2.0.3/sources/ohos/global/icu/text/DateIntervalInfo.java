package ohos.global.icu.text;

import java.io.Serializable;
import java.util.Locale;
import ohos.global.icu.util.Freezable;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/DateIntervalInfo.class */
public class DateIntervalInfo implements Cloneable, Freezable<DateIntervalInfo>, Serializable {
    public DateIntervalInfo(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public DateIntervalInfo(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public void setIntervalPattern(String skeleton, int lrgDiffCalUnit, String intervalPattern) {
        throw new RuntimeException("Stub!");
    }

    public PatternInfo getIntervalPattern(String skeleton, int field) {
        throw new RuntimeException("Stub!");
    }

    public String getFallbackIntervalPattern() {
        throw new RuntimeException("Stub!");
    }

    public void setFallbackIntervalPattern(String fallbackPattern) {
        throw new RuntimeException("Stub!");
    }

    public boolean getDefaultOrder() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public DateIntervalInfo freeze() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public DateIntervalInfo cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object a) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/DateIntervalInfo$PatternInfo.class */
    public static final class PatternInfo implements Cloneable, Serializable {
        public PatternInfo(String firstPart, String secondPart, boolean firstDateInPtnIsLaterDate) {
            throw new RuntimeException("Stub!");
        }

        public String getFirstPart() {
            throw new RuntimeException("Stub!");
        }

        public String getSecondPart() {
            throw new RuntimeException("Stub!");
        }

        public boolean firstDateInPtnIsLaterDate() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object a) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
