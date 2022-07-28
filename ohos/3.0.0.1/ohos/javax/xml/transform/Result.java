package ohos.javax.xml.transform;

public interface Result {
  public static final String PI_DISABLE_OUTPUT_ESCAPING = "javax.xml.transform.disable-output-escaping";
  
  public static final String PI_ENABLE_OUTPUT_ESCAPING = "javax.xml.transform.enable-output-escaping";
  
  void setSystemId(String paramString);
  
  String getSystemId();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/javax/xml/transform/Result.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */