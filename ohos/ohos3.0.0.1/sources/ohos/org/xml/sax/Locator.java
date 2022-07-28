package ohos.org.xml.sax;

/* loaded from: ohos3.0.0.1.jar:ohos/org/xml/sax/Locator.class */
public interface Locator {
    String getPublicId();

    String getSystemId();

    int getLineNumber();

    int getColumnNumber();
}
