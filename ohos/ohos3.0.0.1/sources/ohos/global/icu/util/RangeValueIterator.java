package ohos.global.icu.util;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/RangeValueIterator.class */
public interface RangeValueIterator {
    boolean next(Element element);

    void reset();

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/RangeValueIterator$Element.class */
    public static class Element {
        public int limit;
        public int start;
        public int value;

        public Element() {
            throw new RuntimeException("Stub!");
        }
    }
}
