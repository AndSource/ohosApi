package ohos.ai.cv.docrefine;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.ImageResult;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

public interface IDocRefine extends ICvBase {
  int docDetect(VisionImage paramVisionImage, DocCoordinates paramDocCoordinates, VisionCallback<DocCoordinates> paramVisionCallback);
  
  int docRefine(VisionImage paramVisionImage, DocCoordinates paramDocCoordinates, ImageResult paramImageResult, VisionCallback<ImageResult> paramVisionCallback);
  
  void setVisionConfiguration(DocRefineConfiguration paramDocRefineConfiguration);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/ai/cv/docrefine/IDocRefine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */