package ohos.global.icu.text;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/Normalizer.class */
public final class Normalizer implements Cloneable {
    public static final int COMPARE_CODE_POINT_ORDER = 32768;
    public static final int COMPARE_IGNORE_CASE = 65536;
    public static final int FOLD_CASE_DEFAULT = 0;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
    public static final int INPUT_IS_FCD = 131072;
    public static final QuickCheckResult MAYBE = null;
    public static final QuickCheckResult NO = null;
    public static final QuickCheckResult YES = null;

    Normalizer() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public static int compare(char[] s1, int s1Start, int s1Limit, char[] s2, int s2Start, int s2Limit, int options) {
        throw new RuntimeException("Stub!");
    }

    public static int compare(String s1, String s2, int options) {
        throw new RuntimeException("Stub!");
    }

    public static int compare(char[] s1, char[] s2, int options) {
        throw new RuntimeException("Stub!");
    }

    public static int compare(int char32a, int char32b, int options) {
        throw new RuntimeException("Stub!");
    }

    public static int compare(int char32a, String str2, int options) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/Normalizer$QuickCheckResult.class */
    public static final class QuickCheckResult {
        QuickCheckResult(int value) {
            throw new RuntimeException("Stub!");
        }
    }
}
