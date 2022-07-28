package ohos.global.icu.text;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/UnicodeMatcher.class */
public interface UnicodeMatcher {
    public static final char ETHER = '\uffff';
    public static final int U_MATCH = 2;
    public static final int U_MISMATCH = 0;
    public static final int U_PARTIAL_MATCH = 1;

    int matches(Replaceable replaceable, int[] iArr, int i, boolean z);

    String toPattern(boolean z);

    boolean matchesIndexValue(int i);

    void addMatchSetTo(UnicodeSet unicodeSet);
}
