package ohos.org.xml.sax;

/* loaded from: ohos2.1.1.21.jar:ohos/org/xml/sax/Locator.class */
public interface Locator {
    String getPublicId();

    String getSystemId();

    int getLineNumber();

    int getColumnNumber();
}
