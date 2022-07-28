package ohos.global.icu.text;

import java.text.CharacterIterator;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/SearchIterator.class */
public abstract class SearchIterator {
    public static final int DONE = -1;
    protected BreakIterator breakIterator;
    protected int matchLength;
    protected CharacterIterator targetText;

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/SearchIterator$ElementComparisonType.class */
    public enum ElementComparisonType {
        STANDARD_ELEMENT_COMPARISON,
        PATTERN_BASE_WEIGHT_IS_WILDCARD,
        ANY_BASE_WEIGHT_IS_WILDCARD
    }

    public abstract int getIndex();

    protected abstract int handleNext(int i);

    protected abstract int handlePrevious(int i);

    protected SearchIterator(CharacterIterator target, BreakIterator breaker) {
        throw new RuntimeException("Stub!");
    }

    public void setIndex(int position) {
        throw new RuntimeException("Stub!");
    }

    public void setOverlapping(boolean allowOverlap) {
        throw new RuntimeException("Stub!");
    }

    public void setBreakIterator(BreakIterator breakiter) {
        throw new RuntimeException("Stub!");
    }

    public void setTarget(CharacterIterator text) {
        throw new RuntimeException("Stub!");
    }

    public int getMatchStart() {
        throw new RuntimeException("Stub!");
    }

    public int getMatchLength() {
        throw new RuntimeException("Stub!");
    }

    public BreakIterator getBreakIterator() {
        throw new RuntimeException("Stub!");
    }

    public CharacterIterator getTarget() {
        throw new RuntimeException("Stub!");
    }

    public String getMatchedText() {
        throw new RuntimeException("Stub!");
    }

    public int next() {
        throw new RuntimeException("Stub!");
    }

    public int previous() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOverlapping() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public final int first() {
        throw new RuntimeException("Stub!");
    }

    public final int following(int position) {
        throw new RuntimeException("Stub!");
    }

    public final int last() {
        throw new RuntimeException("Stub!");
    }

    public final int preceding(int position) {
        throw new RuntimeException("Stub!");
    }

    protected void setMatchLength(int length) {
        throw new RuntimeException("Stub!");
    }

    public void setElementComparisonType(ElementComparisonType type) {
        throw new RuntimeException("Stub!");
    }

    public ElementComparisonType getElementComparisonType() {
        throw new RuntimeException("Stub!");
    }
}
