package ohos.agp.text;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/InputFilter.class */
public abstract class InputFilter {
    public abstract CharSequence filter(CharSequence charSequence, Range range, CharSequence charSequence2, Range range2);

    public InputFilter() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/InputFilter$Range.class */
    public static class Range {
        public Range(int inStart, int inEnd) {
            throw new RuntimeException("Stub!");
        }

        public int getStart() {
            throw new RuntimeException("Stub!");
        }

        public int getEnd() {
            throw new RuntimeException("Stub!");
        }
    }
}
