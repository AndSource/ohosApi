package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

public interface TelephoneEventHandle extends StandardizedEventHandle {
  boolean onAnswer(MultimodalEvent paramMultimodalEvent);
  
  boolean onRefuse(MultimodalEvent paramMultimodalEvent);
  
  boolean onHangup(MultimodalEvent paramMultimodalEvent);
  
  boolean onTelephoneControl(MultimodalEvent paramMultimodalEvent);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/multimodalinput/standard/TelephoneEventHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */