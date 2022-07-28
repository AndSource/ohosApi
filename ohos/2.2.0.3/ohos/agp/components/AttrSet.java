package ohos.agp.components;

import java.util.Optional;

public interface AttrSet {
  public static final String STYLE_ATTR = "style";
  
  Optional<String> getStyle();
  
  int getLength();
  
  Optional<Attr> getAttr(int paramInt);
  
  Optional<Attr> getAttr(String paramString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/components/AttrSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */