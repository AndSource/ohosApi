package ohos.global.icu.util;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/ValueIterator.class */
public interface ValueIterator {
    boolean next(Element element);

    void reset();

    void setRange(int i, int i2);

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/util/ValueIterator$Element.class */
    public static final class Element {
        public int integer;
        public Object value;

        public Element() {
            throw new RuntimeException("Stub!");
        }
    }
}
