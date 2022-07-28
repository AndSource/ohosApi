package ohos.global.icu.text;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/Replaceable.class */
public interface Replaceable {
    int length();

    char charAt(int i);

    int char32At(int i);

    void getChars(int i, int i2, char[] cArr, int i3);

    void replace(int i, int i2, String str);

    void replace(int i, int i2, char[] cArr, int i3, int i4);

    void copy(int i, int i2, int i3);

    boolean hasMetaData();
}
