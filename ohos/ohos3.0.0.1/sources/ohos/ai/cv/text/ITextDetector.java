package ohos.ai.cv.text;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/text/ITextDetector.class */
public interface ITextDetector extends ICvBase {
    int detect(VisionImage visionImage, Text text, VisionCallback<Text> visionCallback);

    void setVisionConfiguration(TextConfiguration textConfiguration);
}
