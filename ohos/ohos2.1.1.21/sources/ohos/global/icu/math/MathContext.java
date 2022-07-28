package ohos.global.icu.math;

import java.io.Serializable;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/math/MathContext.class */
public final class MathContext implements Serializable {
    public static final MathContext DEFAULT = null;
    public static final int ENGINEERING = 2;
    public static final int PLAIN = 0;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    public static final int SCIENTIFIC = 1;

    public MathContext(int setdigits) {
        throw new RuntimeException("Stub!");
    }

    public MathContext(int setdigits, int setform) {
        throw new RuntimeException("Stub!");
    }

    public MathContext(int setdigits, int setform, boolean setlostdigits) {
        throw new RuntimeException("Stub!");
    }

    public MathContext(int setdigits, int setform, boolean setlostdigits, int setroundingmode) {
        throw new RuntimeException("Stub!");
    }

    public int getDigits() {
        throw new RuntimeException("Stub!");
    }

    public int getForm() {
        throw new RuntimeException("Stub!");
    }

    public boolean getLostDigits() {
        throw new RuntimeException("Stub!");
    }

    public int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
