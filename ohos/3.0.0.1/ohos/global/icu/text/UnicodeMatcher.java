package ohos.global.icu.text;

public interface UnicodeMatcher {
  public static final char ETHER = '￿';
  
  public static final int U_MATCH = 2;
  
  public static final int U_MISMATCH = 0;
  
  public static final int U_PARTIAL_MATCH = 1;
  
  int matches(Replaceable paramReplaceable, int[] paramArrayOfint, int paramInt, boolean paramBoolean);
  
  String toPattern(boolean paramBoolean);
  
  boolean matchesIndexValue(int paramInt);
  
  void addMatchSetTo(UnicodeSet paramUnicodeSet);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/icu/text/UnicodeMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */