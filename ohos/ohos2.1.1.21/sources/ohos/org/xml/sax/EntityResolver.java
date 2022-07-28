package ohos.org.xml.sax;

import java.io.IOException;

/* loaded from: ohos2.1.1.21.jar:ohos/org/xml/sax/EntityResolver.class */
public interface EntityResolver {
    InputSource resolveEntity(String str, String str2) throws IOException, SAXException;
}
