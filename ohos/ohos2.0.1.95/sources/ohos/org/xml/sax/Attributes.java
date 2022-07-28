package ohos.org.xml.sax;

/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/Attributes.class */
public interface Attributes {
    int getLength();

    String getURI(int i);

    String getLocalName(int i);

    String getQName(int i);

    String getType(int i);

    String getValue(int i);

    int getIndex(String str, String str2);

    int getIndex(String str);

    String getType(String str, String str2);

    String getType(String str);

    String getValue(String str, String str2);

    String getValue(String str);
}
