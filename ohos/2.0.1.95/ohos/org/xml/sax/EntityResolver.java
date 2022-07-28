package ohos.org.xml.sax;

import java.io.IOException;

public interface EntityResolver {
  InputSource resolveEntity(String paramString1, String paramString2) throws IOException, SAXException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/org/xml/sax/EntityResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */