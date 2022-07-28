package ohos.agp.text.richstyles;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/RangedRichStyle.class */
public class RangedRichStyle {
    public RangedRichStyle(int start, int end, Flag includeFlag, RichStyle richStyle) {
        throw new RuntimeException("Stub!");
    }

    public RichStyle getRichStyle() {
        throw new RuntimeException("Stub!");
    }

    public int getStart() {
        throw new RuntimeException("Stub!");
    }

    public int getEnd() {
        throw new RuntimeException("Stub!");
    }

    public Flag getIncludeFlag() {
        throw new RuntimeException("Stub!");
    }

    public void setEnd(int end) {
        throw new RuntimeException("Stub!");
    }

    public void setStart(int start) {
        throw new RuntimeException("Stub!");
    }

    public void setIncludeFlag(Flag flag) {
        throw new RuntimeException("Stub!");
    }

    public void setRichStyle(RichStyle richStyle) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/RangedRichStyle$Flag.class */
    public enum Flag {
        EXCLUDE,
        INCLUDE_START,
        INCLUDE_END,
        INCLUDE_START_AND_END;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static Flag getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
