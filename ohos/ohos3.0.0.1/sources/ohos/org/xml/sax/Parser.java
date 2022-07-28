package ohos.org.xml.sax;

import java.io.IOException;
import java.util.Locale;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/org/xml/sax/Parser.class */
public interface Parser {
    @Deprecated
    void setLocale(Locale locale) throws SAXException;

    @Deprecated
    void setEntityResolver(EntityResolver entityResolver);

    @Deprecated
    void setDTDHandler(DTDHandler dTDHandler);

    @Deprecated
    void setDocumentHandler(DocumentHandler documentHandler);

    @Deprecated
    void setErrorHandler(ErrorHandler errorHandler);

    @Deprecated
    void parse(InputSource inputSource) throws IOException, SAXException;

    @Deprecated
    void parse(String str) throws IOException, SAXException;
}
