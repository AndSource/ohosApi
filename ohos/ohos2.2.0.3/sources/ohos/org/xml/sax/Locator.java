package ohos.org.xml.sax;

/* loaded from: ohos2.2.0.3.jar:ohos/org/xml/sax/Locator.class */
public interface Locator {
    String getPublicId();

    String getSystemId();

    int getLineNumber();

    int getColumnNumber();
}
