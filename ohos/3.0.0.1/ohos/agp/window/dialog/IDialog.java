package ohos.agp.window.dialog;

import ohos.multimodalinput.event.KeyEvent;

public interface IDialog {
  public static final int BUTTON1 = 0;
  
  public static final int BUTTON2 = 1;
  
  public static final int BUTTON3 = 2;
  
  public static final int BUTTON_NUM = 3;
  
  public static final int DEF_RADIUS = 15;
  
  public static final int ICON1 = 0;
  
  public static final int ICON2 = 1;
  
  public static final int ICON3 = 2;
  
  public static final int ICON_NUM = 3;
  
  void show();
  
  void hide();
  
  void destroy();
  
  void remove();
  
  public static interface KeyboardCallback {
    boolean clickKey(IDialog param1IDialog, KeyEvent param1KeyEvent);
  }
  
  public static interface ItemClickedListener {
    void onClick(IDialog param1IDialog, int param1Int);
  }
  
  public static interface ClickedListener {
    void onClick(IDialog param1IDialog, int param1Int);
  }
  
  public static interface CheckBoxClickedListener {
    void onClick(IDialog param1IDialog, int param1Int, boolean param1Boolean);
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/window/dialog/IDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */