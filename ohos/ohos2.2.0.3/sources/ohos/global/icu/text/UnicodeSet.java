package ohos.global.icu.text;

import java.text.ParsePosition;
import java.util.Collection;
import java.util.Iterator;
import ohos.global.icu.util.Freezable;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/UnicodeSet.class */
public class UnicodeSet extends UnicodeFilter implements Iterable<String>, Comparable<UnicodeSet>, Freezable<UnicodeSet> {
    public static final int ADD_CASE_MAPPINGS = 4;
    public static final int CASE = 2;
    public static final int CASE_INSENSITIVE = 2;
    public static final int IGNORE_SPACE = 1;
    public static final int MAX_VALUE = 1114111;
    public static final int MIN_VALUE = 0;
    public static final UnicodeSet ALL_CODE_POINTS = null;
    public static final UnicodeSet EMPTY = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/UnicodeSet$ComparisonStyle.class */
    public enum ComparisonStyle {
        SHORTER_FIRST,
        LEXICOGRAPHIC,
        LONGER_FIRST
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/UnicodeSet$SpanCondition.class */
    public enum SpanCondition {
        NOT_CONTAINED,
        CONTAINED,
        SIMPLE,
        CONDITION_COUNT
    }

    public UnicodeSet() {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(UnicodeSet other) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(int... pairs) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(String pattern, boolean ignoreWhitespace) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(String pattern, int options) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(String pattern, ParsePosition pos, SymbolTable symbols) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet(String pattern, ParsePosition pos, SymbolTable symbols, int options) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet set(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet set(UnicodeSet other) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet applyPattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet applyPattern(String pattern, boolean ignoreWhitespace) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet applyPattern(String pattern, int options) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeMatcher
    public String toPattern(boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }

    public StringBuffer _generatePattern(StringBuffer result, boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }

    public StringBuffer _generatePattern(StringBuffer result, boolean escapeUnprintable, boolean includeStrings) {
        throw new RuntimeException("Stub!");
    }

    public int size() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeMatcher
    public boolean matchesIndexValue(int v) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeFilter, ohos.global.icu.text.UnicodeMatcher
    public int matches(Replaceable text, int[] offset, int limit, boolean incremental) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeMatcher
    public void addMatchSetTo(UnicodeSet toUnionTo) {
        throw new RuntimeException("Stub!");
    }

    public int indexOf(int c) {
        throw new RuntimeException("Stub!");
    }

    public int charAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet add(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet addAll(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet add(int c) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet add(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet addAll(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet retainAll(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet complementAll(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet removeAll(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet removeAllStrings() {
        throw new RuntimeException("Stub!");
    }

    public static UnicodeSet from(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public static UnicodeSet fromAll(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet retain(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet retain(int c) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet retain(CharSequence cs) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet remove(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet remove(int c) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet remove(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet complement(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet complement(int c) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet complement() {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet complement(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.UnicodeFilter
    public boolean contains(int c) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final boolean contains(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public boolean containsAll(UnicodeSet b) {
        throw new RuntimeException("Stub!");
    }

    public boolean containsAll(String s) {
        throw new RuntimeException("Stub!");
    }

    public boolean containsNone(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public boolean containsNone(UnicodeSet b) {
        throw new RuntimeException("Stub!");
    }

    public boolean containsNone(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public final boolean containsSome(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public final boolean containsSome(UnicodeSet s) {
        throw new RuntimeException("Stub!");
    }

    public final boolean containsSome(CharSequence s) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet addAll(UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet retainAll(UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet removeAll(UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet complementAll(UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet clear() {
        throw new RuntimeException("Stub!");
    }

    public int getRangeCount() {
        throw new RuntimeException("Stub!");
    }

    public int getRangeStart(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getRangeEnd(int index) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet compact() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public <T extends Collection<String>> T addAllTo(T target) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet add(Iterable<?> source) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet addAll(Iterable<?> source) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet applyIntPropertyValue(int prop, int value) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet applyPropertyAlias(String propertyAlias, String valueAlias) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet applyPropertyAlias(String propertyAlias, String valueAlias, SymbolTable symbols) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet closeOver(int attribute) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public UnicodeSet freeze() {
        throw new RuntimeException("Stub!");
    }

    public int span(CharSequence s, SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public int span(CharSequence s, int start, SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public int spanBack(CharSequence s, SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public int spanBack(CharSequence s, int fromIndex, SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public UnicodeSet cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }

    public Iterable<EntryRange> ranges() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        throw new RuntimeException("Stub!");
    }

    public <T extends CharSequence> boolean containsAll(Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }

    public <T extends CharSequence> boolean containsNone(Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends CharSequence> boolean containsSome(Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }

    public <T extends CharSequence> UnicodeSet addAll(T... collection) {
        throw new RuntimeException("Stub!");
    }

    public <T extends CharSequence> UnicodeSet removeAll(Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }

    public <T extends CharSequence> UnicodeSet retainAll(Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(UnicodeSet o) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(UnicodeSet o, ComparisonStyle style) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(Iterable<String> other) {
        throw new RuntimeException("Stub!");
    }

    public Collection<String> strings() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/UnicodeSet$EntryRange.class */
    public static class EntryRange {
        public int codepoint;
        public int codepointEnd;

        EntryRange() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
