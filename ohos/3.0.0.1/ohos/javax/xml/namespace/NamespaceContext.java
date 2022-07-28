package ohos.javax.xml.namespace;

import java.util.Iterator;

public interface NamespaceContext {
  String getNamespaceURI(String paramString);
  
  String getPrefix(String paramString);
  
  Iterator getPrefixes(String paramString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/javax/xml/namespace/NamespaceContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */