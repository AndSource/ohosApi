package ohos.global.icu.text;

import java.text.ParsePosition;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/SymbolTable.class */
public interface SymbolTable {
    public static final char SYMBOL_REF = '$';

    char[] lookup(String str);

    UnicodeMatcher lookupMatcher(int i);

    String parseReference(String str, ParsePosition parsePosition, int i);
}
