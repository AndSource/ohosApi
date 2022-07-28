package ohos.org.xml.sax;

/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/Locator.class */
public interface Locator {
    String getPublicId();

    String getSystemId();

    int getLineNumber();

    int getColumnNumber();
}
