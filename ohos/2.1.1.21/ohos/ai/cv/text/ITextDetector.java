package ohos.ai.cv.text;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

public interface ITextDetector extends ICvBase {
  int detect(VisionImage paramVisionImage, Text paramText, VisionCallback<Text> paramVisionCallback);
  
  void setVisionConfiguration(TextConfiguration paramTextConfiguration);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ai/cv/text/ITextDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */