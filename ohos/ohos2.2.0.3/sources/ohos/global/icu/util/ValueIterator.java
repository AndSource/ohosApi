package ohos.global.icu.util;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/ValueIterator.class */
public interface ValueIterator {
    boolean next(Element element);

    void reset();

    void setRange(int i, int i2);

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/util/ValueIterator$Element.class */
    public static final class Element {
        public int integer;
        public Object value;

        public Element() {
            throw new RuntimeException("Stub!");
        }
    }
}
