package ohos.ai.cv.common;

public interface VisionCallback<T> {
  void onResult(T paramT);
  
  void onError(int paramInt);
  
  void onProcessing(float paramFloat);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/ai/cv/common/VisionCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */