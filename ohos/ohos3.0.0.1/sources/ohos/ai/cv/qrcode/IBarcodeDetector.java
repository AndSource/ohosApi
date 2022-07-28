package ohos.ai.cv.qrcode;

import ohos.ai.cv.common.ICvBase;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/qrcode/IBarcodeDetector.class */
public interface IBarcodeDetector extends ICvBase {
    int detect(String str, byte[] bArr, int i, int i2);
}
