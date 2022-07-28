package ohos.agp.text;

import java.util.ArrayList;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/FontFamily.class */
public class FontFamily {
    FontFamily(ArrayList<RawFont> fonts, long nativePointer) {
        throw new RuntimeException("Stub!");
    }

    public RawFont getRawFont(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getSize() {
        throw new RuntimeException("Stub!");
    }

    public RawFont getRawFont(int weight, boolean isItalic) {
        throw new RuntimeException("Stub!");
    }

    public FontFamily createFamilyWithVariations(String variations) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasGlyph(int codePoint, int variationSelector) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/FontFamily$Builder.class */
    public static final class Builder {
        public Builder(RawFont font) {
            throw new RuntimeException("Stub!");
        }

        public Builder addRawFont(RawFont font) {
            throw new RuntimeException("Stub!");
        }

        public FontFamily build() {
            throw new RuntimeException("Stub!");
        }
    }
}
