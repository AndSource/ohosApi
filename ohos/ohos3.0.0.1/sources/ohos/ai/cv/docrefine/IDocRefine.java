package ohos.ai.cv.docrefine;

import ohos.ai.cv.common.ICvBase;
import ohos.ai.cv.common.ImageResult;
import ohos.ai.cv.common.VisionCallback;
import ohos.ai.cv.common.VisionImage;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/docrefine/IDocRefine.class */
public interface IDocRefine extends ICvBase {
    int docDetect(VisionImage visionImage, DocCoordinates docCoordinates, VisionCallback<DocCoordinates> visionCallback);

    int docRefine(VisionImage visionImage, DocCoordinates docCoordinates, ImageResult imageResult, VisionCallback<ImageResult> visionCallback);

    void setVisionConfiguration(DocRefineConfiguration docRefineConfiguration);
}
