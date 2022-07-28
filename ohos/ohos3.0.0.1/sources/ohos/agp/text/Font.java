package ohos.agp.text;

import java.io.File;
import java.io.FileDescriptor;
import ohos.global.resource.ResourceManager;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/Font.class */
public class Font {
    public static final int BOLD = 700;
    public static final int MEDIUM = 500;
    public static final int REGULAR = 400;
    public static final Font DEFAULT = null;
    public static final Font DEFAULT_BOLD = null;
    public static final Font MONOSPACE = null;
    public static final Font SANS_SERIF = null;
    public static final Font SERIF = null;

    Font(long nativePtr, boolean isNeedRelease) {
        throw new RuntimeException("Stub!");
    }

    public int getWeight() {
        throw new RuntimeException("Stub!");
    }

    public boolean isItalic() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBold() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public static Font getDefaultByStyle(int weight, boolean isItalic) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/Font$Builder.class */
    public static class Builder {
        public static final int MAX_FALLBACK_NUM = 64;

        public Builder(String name) {
            throw new RuntimeException("Stub!");
        }

        public Builder(File file) {
            throw new RuntimeException("Stub!");
        }

        public Builder(FileDescriptor fileDescriptor) {
            throw new RuntimeException("Stub!");
        }

        public Builder(ResourceManager resourceManager, String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder(Font font) {
            throw new RuntimeException("Stub!");
        }

        public Builder(FontFamily fontFamily) {
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

        public Builder setSystemFallback(String fontFamilyName) {
            throw new RuntimeException("Stub!");
        }

        public Builder addCustomFallback(FontFamily fontFamily) {
            throw new RuntimeException("Stub!");
        }

        public Builder setFontCollectionIndex(int fontCollectionIndex) {
            throw new RuntimeException("Stub!");
        }

        public Builder setFontVariations(String variations) {
            throw new RuntimeException("Stub!");
        }
    }
}
