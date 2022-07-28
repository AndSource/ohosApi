package ohos.agp.render;

import java.io.FileInputStream;
import java.io.IOException;
import ohos.media.image.PixelMap;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/PdfDisplay.class */
public class PdfDisplay implements AutoCloseable {
    public PdfDisplay(FileInputStream fileInputStream) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public Page openPage(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getPageCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/PdfDisplay$Page.class */
    public final class Page implements AutoCloseable {
        Page(int index) {
            throw new RuntimeException("Stub!");
        }

        public int getIndex() {
            throw new RuntimeException("Stub!");
        }

        public int getWidth() {
            throw new RuntimeException("Stub!");
        }

        public int getHeight() {
            throw new RuntimeException("Stub!");
        }

        public void show(PixelMap destPixelMap) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            throw new RuntimeException("Stub!");
        }
    }
}
