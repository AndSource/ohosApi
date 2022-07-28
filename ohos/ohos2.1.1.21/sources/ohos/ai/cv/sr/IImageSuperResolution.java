package ohos.ai.cv.sr;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.ImageResult;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

/* loaded from: ohos2.1.1.21.jar:ohos/ai/cv/sr/IImageSuperResolution.class */
public interface IImageSuperResolution extends ICvBase {
    int doSuperResolution(VisionImage visionImage, ImageResult imageResult, VisionCallback<ImageResult> visionCallback);

    void setVisionConfiguration(SisrConfiguration sisrConfiguration);
}
