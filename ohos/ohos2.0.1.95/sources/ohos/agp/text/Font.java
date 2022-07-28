package ohos.agp.text;

import java.io.File;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/text/Font.class */
public class Font {
    public static final int BOLD = 700;
    public static final int MEDIUM = 500;
    public static final int REGULAR = 400;
    public static final Font DEFAULT = null;
    public static final Font DEFAULT_BOLD = null;
    public static final Font MONOSPACE = null;
    public static final Font SANS_SERIF = null;
    public static final Font SERIF = null;

    Font() {
        throw new RuntimeException("Stub!");
    }

    public int getWeight() {
        throw new RuntimeException("Stub!");
    }

    public boolean isItalic() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/text/Font$Builder.class */
    public static class Builder {
        public Builder(String name) {
            throw new RuntimeException("Stub!");
        }

        public Builder(File file) {
            throw new RuntimeException("Stub!");
        }

        public Builder makeItalic(boolean italic) {
            throw new RuntimeException("Stub!");
        }

        public Builder setWeight(int weight) {
            throw new RuntimeException("Stub!");
        }

        public Font build() {
            throw new RuntimeException("Stub!");
        }
    }
}
