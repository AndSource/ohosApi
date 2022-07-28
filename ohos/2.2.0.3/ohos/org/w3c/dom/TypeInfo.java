package ohos.org.w3c.dom;

public interface TypeInfo {
  public static final int DERIVATION_EXTENSION = 2;
  
  public static final int DERIVATION_LIST = 8;
  
  public static final int DERIVATION_RESTRICTION = 1;
  
  public static final int DERIVATION_UNION = 4;
  
  String getTypeName();
  
  String getTypeNamespace();
  
  boolean isDerivedFrom(String paramString1, String paramString2, int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/org/w3c/dom/TypeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */