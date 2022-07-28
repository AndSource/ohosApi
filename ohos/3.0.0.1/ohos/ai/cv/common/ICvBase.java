package ohos.ai.cv.common;

import ohos.ai.engine.pluginservice.ILoadPluginCallback;

public interface ICvBase {
  int prepare();
  
  int getAvailability();
  
  void loadPlugin(ILoadPluginCallback paramILoadPluginCallback);
  
  int release();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/ai/cv/common/ICvBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */