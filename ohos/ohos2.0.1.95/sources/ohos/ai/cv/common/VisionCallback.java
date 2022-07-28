package ohos.ai.cv.common;

/* loaded from: ohos2.0.1.95.jar:ohos/ai/cv/common/VisionCallback.class */
public interface VisionCallback<T> {
    void onResult(T t);

    void onError(int i);

    void onProcessing(float f);
}
