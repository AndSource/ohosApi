package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

public interface CommonEventHandle extends StandardizedEventHandle {
  boolean onShowMenu(MultimodalEvent paramMultimodalEvent);
  
  boolean onSend(MultimodalEvent paramMultimodalEvent);
  
  boolean onCopy(MultimodalEvent paramMultimodalEvent);
  
  boolean onPaste(MultimodalEvent paramMultimodalEvent);
  
  boolean onCut(MultimodalEvent paramMultimodalEvent);
  
  boolean onUndo(MultimodalEvent paramMultimodalEvent);
  
  boolean onRefresh(MultimodalEvent paramMultimodalEvent);
  
  boolean onStartDrag(MultimodalEvent paramMultimodalEvent);
  
  boolean onCancel(MultimodalEvent paramMultimodalEvent);
  
  boolean onEnter(MultimodalEvent paramMultimodalEvent);
  
  boolean onPrevious(MultimodalEvent paramMultimodalEvent);
  
  boolean onNext(MultimodalEvent paramMultimodalEvent);
  
  boolean onBack(MultimodalEvent paramMultimodalEvent);
  
  boolean onPrint(MultimodalEvent paramMultimodalEvent);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/multimodalinput/standard/CommonEventHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */