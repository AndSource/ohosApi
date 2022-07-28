package ohos.global.icu.text;

import java.text.CharacterIterator;
import java.util.Locale;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/StringSearch.class */
public final class StringSearch extends SearchIterator {
    public StringSearch(String pattern, CharacterIterator target, RuleBasedCollator collator, BreakIterator breakiter) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public StringSearch(String pattern, CharacterIterator target, RuleBasedCollator collator) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public StringSearch(String pattern, CharacterIterator target, Locale locale) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public StringSearch(String pattern, CharacterIterator target, ULocale locale) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public StringSearch(String pattern, String target) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public RuleBasedCollator getCollator() {
        throw new RuntimeException("Stub!");
    }

    public void setCollator(RuleBasedCollator collator) {
        throw new RuntimeException("Stub!");
    }

    public String getPattern() {
        throw new RuntimeException("Stub!");
    }

    public void setPattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCanonical() {
        throw new RuntimeException("Stub!");
    }

    public void setCanonical(boolean allowCanonical) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    public void setTarget(CharacterIterator text) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    public int getIndex() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    public void setIndex(int position) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    public void reset() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    protected int handleNext(int position) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.SearchIterator
    protected int handlePrevious(int position) {
        throw new RuntimeException("Stub!");
    }
}
