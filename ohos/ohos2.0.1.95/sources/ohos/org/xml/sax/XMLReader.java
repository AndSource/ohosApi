package ohos.org.xml.sax;

import java.io.IOException;

/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/XMLReader.class */
public interface XMLReader {
    boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException;

    Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException;

    void setEntityResolver(EntityResolver entityResolver);

    EntityResolver getEntityResolver();

    void setDTDHandler(DTDHandler dTDHandler);

    DTDHandler getDTDHandler();

    void setContentHandler(ContentHandler contentHandler);

    ContentHandler getContentHandler();

    void setErrorHandler(ErrorHandler errorHandler);

    ErrorHandler getErrorHandler();

    void parse(InputSource inputSource) throws IOException, SAXException;

    void parse(String str) throws IOException, SAXException;
}
