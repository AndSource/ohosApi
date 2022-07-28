package ohos.agp.render;

import java.io.IOException;
import java.io.OutputStream;
import ohos.agp.utils.Rect;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/PdfGenerator.class */
public class PdfGenerator {
    public PdfGenerator() {
        throw new RuntimeException("Stub!");
    }

    public PdfPage beginDrawing(PageInfo pageInfo) {
        throw new RuntimeException("Stub!");
    }

    public void endDrawing(PdfPage pdfPage) {
        throw new RuntimeException("Stub!");
    }

    public void close() {
        throw new RuntimeException("Stub!");
    }

    public void writeTo(OutputStream stream) throws IOException {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/render/PdfGenerator$PageInfo.class */
    public static final class PageInfo {
        PageInfo() {
            throw new RuntimeException("Stub!");
        }

        public int getPageWidth() {
            throw new RuntimeException("Stub!");
        }

        public int getPageHeight() {
            throw new RuntimeException("Stub!");
        }

        public Rect getRect() {
            throw new RuntimeException("Stub!");
        }

        public int getPageIndex() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.1.1.21.jar:ohos/agp/render/PdfGenerator$PageInfo$Builder.class */
        public static final class Builder {
            public Builder(int width, int height, int number) {
                throw new RuntimeException("Stub!");
            }

            public PageInfo create() {
                throw new RuntimeException("Stub!");
            }

            public Builder setRect(Rect contentRect) {
                throw new RuntimeException("Stub!");
            }
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/render/PdfGenerator$PdfPage.class */
    public static final class PdfPage {
        PdfPage(PageInfo pageInfo, Canvas canvas) {
            throw new RuntimeException("Stub!");
        }

        public Canvas getCanvas() {
            throw new RuntimeException("Stub!");
        }

        public PageInfo getPageInfo() {
            throw new RuntimeException("Stub!");
        }
    }
}
