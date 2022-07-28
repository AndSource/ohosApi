package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.app.Context;

public interface Attr {
  String getName();
  
  String getStringValue();
  
  int getIntegerValue();
  
  boolean getBoolValue();
  
  float getFloatValue();
  
  long getLongValue();
  
  Element getElement();
  
  int getDimensionValue();
  
  Color getColorValue();
  
  Context getContext();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/components/Attr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */