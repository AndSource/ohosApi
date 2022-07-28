package ohos.org.w3c.dom.ls;

import java.io.InputStream;
import java.io.Reader;

/* loaded from: ohos2.0.1.95.jar:ohos/org/w3c/dom/ls/LSInput.class */
public interface LSInput {
    Reader getCharacterStream();

    void setCharacterStream(Reader reader);

    InputStream getByteStream();

    void setByteStream(InputStream inputStream);

    String getStringData();

    void setStringData(String str);

    String getSystemId();

    void setSystemId(String str);

    String getPublicId();

    void setPublicId(String str);

    String getBaseURI();

    void setBaseURI(String str);

    String getEncoding();

    void setEncoding(String str);

    boolean getCertifiedText();

    void setCertifiedText(boolean z);
}
