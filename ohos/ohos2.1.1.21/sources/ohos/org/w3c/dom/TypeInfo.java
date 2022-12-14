package ohos.org.w3c.dom;

/* loaded from: ohos2.1.1.21.jar:ohos/org/w3c/dom/TypeInfo.class */
public interface TypeInfo {
    public static final int DERIVATION_EXTENSION = 2;
    public static final int DERIVATION_LIST = 8;
    public static final int DERIVATION_RESTRICTION = 1;
    public static final int DERIVATION_UNION = 4;

    String getTypeName();

    String getTypeNamespace();

    boolean isDerivedFrom(String str, String str2, int i);
}
