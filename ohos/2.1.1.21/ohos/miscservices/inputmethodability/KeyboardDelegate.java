package ohos.miscservices.inputmethodability;

import ohos.miscservices.inputmethod.EditingText;
import ohos.multimodalinput.event.KeyEvent;

public interface KeyboardDelegate {
  boolean onKeyDown(KeyEvent paramKeyEvent);
  
  boolean onKeyUp(KeyEvent paramKeyEvent);
  
  void onSelectionChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void onCursorContextChanged(float paramFloat1, float paramFloat2, float paramFloat3);
  
  void onTextChanged(int paramInt, EditingText paramEditingText);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/miscservices/inputmethodability/KeyboardDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */