package ohos.global.icu.text;

import java.text.ParsePosition;

public interface SymbolTable {
  public static final char SYMBOL_REF = '$';
  
  char[] lookup(String paramString);
  
  UnicodeMatcher lookupMatcher(int paramInt);
  
  String parseReference(String paramString, ParsePosition paramParsePosition, int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/SymbolTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */