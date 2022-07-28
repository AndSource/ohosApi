package ohos.global.icu.text;

import java.text.CharacterIterator;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/UCharacterIterator.class */
public abstract class UCharacterIterator implements Cloneable {
    public static final int DONE = -1;

    public abstract int current();

    public abstract int getLength();

    public abstract int getIndex();

    public abstract int next();

    public abstract int previous();

    public abstract void setIndex(int i);

    public abstract int getText(char[] cArr, int i);

    protected UCharacterIterator() {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(Replaceable source) {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(String source) {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(char[] source) {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(char[] source, int start, int limit) {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(StringBuffer source) {
        throw new RuntimeException("Stub!");
    }

    public static final UCharacterIterator getInstance(CharacterIterator source) {
        throw new RuntimeException("Stub!");
    }

    public CharacterIterator getCharacterIterator() {
        throw new RuntimeException("Stub!");
    }

    public int currentCodePoint() {
        throw new RuntimeException("Stub!");
    }

    public int nextCodePoint() {
        throw new RuntimeException("Stub!");
    }

    public int previousCodePoint() {
        throw new RuntimeException("Stub!");
    }

    public void setToLimit() {
        throw new RuntimeException("Stub!");
    }

    public void setToStart() {
        throw new RuntimeException("Stub!");
    }

    public final int getText(char[] fillIn) {
        throw new RuntimeException("Stub!");
    }

    public String getText() {
        throw new RuntimeException("Stub!");
    }

    public int moveIndex(int delta) {
        throw new RuntimeException("Stub!");
    }

    public int moveCodePointIndex(int delta) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
