package ohos.agp.render;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/PdfGenerator.class */
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

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/PdfGenerator$PageInfo.class */
    public static final class PageInfo {
        PageInfo() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/PdfGenerator$PageInfo$Builder.class */
        public static final class Builder {
            public Builder(int width, int height, int number) {
                throw new RuntimeException("Stub!");
            }

            public PageInfo create() {
                throw new RuntimeException("Stub!");
            }
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/PdfGenerator$PdfPage.class */
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
