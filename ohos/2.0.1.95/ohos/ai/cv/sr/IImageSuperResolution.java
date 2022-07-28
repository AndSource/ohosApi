package ohos.ai.cv.sr;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.ImageResult;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

public interface IImageSuperResolution extends ICvBase {
  int doSuperResolution(VisionImage paramVisionImage, ImageResult paramImageResult, VisionCallback<ImageResult> paramVisionCallback);
  
  void setVisionConfiguration(SisrConfiguration paramSisrConfiguration);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/ai/cv/sr/IImageSuperResolution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */