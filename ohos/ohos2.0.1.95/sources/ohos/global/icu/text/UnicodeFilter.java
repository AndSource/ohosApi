package ohos.global.icu.text;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/UnicodeFilter.class */
public abstract class UnicodeFilter implements UnicodeMatcher {
    public abstract boolean contains(int i);

    @Deprecated
    UnicodeFilter() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeMatcher
    public int matches(Replaceable text, int[] offset, int limit, boolean incremental) {
        throw new RuntimeException("Stub!");
    }
}
