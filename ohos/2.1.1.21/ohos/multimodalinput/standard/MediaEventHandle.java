package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

public interface MediaEventHandle extends StandardizedEventHandle {
  boolean onPlay(MultimodalEvent paramMultimodalEvent);
  
  boolean onPause(MultimodalEvent paramMultimodalEvent);
  
  boolean onMediaControl(MultimodalEvent paramMultimodalEvent);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/multimodalinput/standard/MediaEventHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */