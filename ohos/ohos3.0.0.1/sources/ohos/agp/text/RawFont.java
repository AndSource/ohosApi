package ohos.agp.text;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import ohos.global.configuration.LocaleProfile;
import ohos.global.resource.ResourceManager;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/RawFont.class */
public final class RawFont {
    RawFont(long nativePtr) {
        throw new RuntimeException("Stub!");
    }

    public String getFontVariations() {
        throw new RuntimeException("Stub!");
    }

    public File getFile() {
        throw new RuntimeException("Stub!");
    }

    public int getFontCollectionIndex() {
        throw new RuntimeException("Stub!");
    }

    public ByteBuffer getByteBuffer() {
        throw new RuntimeException("Stub!");
    }

    public boolean isItalic() {
        throw new RuntimeException("Stub!");
    }

    public int getWeight() {
        throw new RuntimeException("Stub!");
    }

    public LocaleProfile getLocaleProfile() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object compared) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public String[] getSupportedAxes() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/RawFont$Builder.class */
    public static final class Builder {
        public Builder(ByteBuffer buffer) {
            throw new RuntimeException("Stub!");
        }

        public Builder(File path) {
            throw new RuntimeException("Stub!");
        }

        public Builder(FileDescriptor fileDescriptor) {
            throw new RuntimeException("Stub!");
        }

        public Builder(FileDescriptor fileDescriptor, long offset, long size) {
            throw new RuntimeException("Stub!");
        }

        public Builder(ResourceManager resourceManager, int resourceId) {
            throw new RuntimeException("Stub!");
        }

        public Builder(ResourceManager resourceManager, String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder setFontVariations(String variations) {
            throw new RuntimeException("Stub!");
        }

        public Builder setItalic(boolean isItalic) {
            throw new RuntimeException("Stub!");
        }

        public Builder setFontCollectionIndex(int fontCollectionIndex) {
            throw new RuntimeException("Stub!");
        }

        public Builder setWeight(int weight) {
            throw new RuntimeException("Stub!");
        }

        public RawFont build() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
