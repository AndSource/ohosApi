package ohos.global.icu.text;

import java.text.ParsePosition;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/SymbolTable.class */
public interface SymbolTable {
    public static final char SYMBOL_REF = '$';

    char[] lookup(String str);

    UnicodeMatcher lookupMatcher(int i);

    String parseReference(String str, ParsePosition parsePosition, int i);
}
