package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

public interface SystemEventHandle extends StandardizedEventHandle {
  boolean onClosePage(MultimodalEvent paramMultimodalEvent);
  
  boolean onMute(MultimodalEvent paramMultimodalEvent);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/multimodalinput/standard/SystemEventHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */