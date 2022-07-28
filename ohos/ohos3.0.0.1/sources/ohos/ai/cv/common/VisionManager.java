package ohos.ai.cv.common;

import ohos.ai.cv.docrefine.IDocRefine;
import ohos.ai.cv.qrcode.IBarcodeDetector;
import ohos.ai.cv.sr.IImageSuperResolution;
import ohos.ai.cv.sr.ITxtImageSuperResolution;
import ohos.ai.cv.text.ITextDetector;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/common/VisionManager.class */
public class VisionManager {
    VisionManager() {
        throw new RuntimeException("Stub!");
    }

    public static int init(Context context, ConnectionCallback connectionCallback) {
        throw new RuntimeException("Stub!");
    }

    public static void destroy() {
        throw new RuntimeException("Stub!");
    }

    public static IImageSuperResolution getSisr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static ITxtImageSuperResolution getTisr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static IDocRefine getDocRefine(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static ITextDetector getTextDetector(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static IBarcodeDetector getBarcodeDetector(Context context) {
        throw new RuntimeException("Stub!");
    }
}
