package ohos.global.icu.text;

import java.io.InputStream;
import ohos.global.icu.text.Normalizer;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/Normalizer2.class */
public abstract class Normalizer2 {

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/Normalizer2$Mode.class */
    public enum Mode {
        COMPOSE,
        DECOMPOSE,
        FCD,
        COMPOSE_CONTIGUOUS
    }

    public abstract StringBuilder normalize(CharSequence charSequence, StringBuilder sb);

    public abstract Appendable normalize(CharSequence charSequence, Appendable appendable);

    public abstract StringBuilder normalizeSecondAndAppend(StringBuilder sb, CharSequence charSequence);

    public abstract StringBuilder append(StringBuilder sb, CharSequence charSequence);

    public abstract String getDecomposition(int i);

    public abstract boolean isNormalized(CharSequence charSequence);

    public abstract Normalizer.QuickCheckResult quickCheck(CharSequence charSequence);

    public abstract int spanQuickCheckYes(CharSequence charSequence);

    public abstract boolean hasBoundaryBefore(int i);

    public abstract boolean hasBoundaryAfter(int i);

    public abstract boolean isInert(int i);

    @Deprecated
    Normalizer2() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getNFCInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getNFDInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getNFKCInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getNFKDInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getNFKCCasefoldInstance() {
        throw new RuntimeException("Stub!");
    }

    public static Normalizer2 getInstance(InputStream data, String name, Mode mode) {
        throw new RuntimeException("Stub!");
    }

    public String normalize(CharSequence src) {
        throw new RuntimeException("Stub!");
    }

    public String getRawDecomposition(int c) {
        throw new RuntimeException("Stub!");
    }

    public int composePair(int a, int b) {
        throw new RuntimeException("Stub!");
    }

    public int getCombiningClass(int c) {
        throw new RuntimeException("Stub!");
    }
}
