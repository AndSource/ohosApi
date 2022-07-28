package ohos.global.icu.text;

import java.util.Enumeration;
import java.util.Locale;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/Transliterator.class */
public abstract class Transliterator {
    public static final int FORWARD = 0;
    public static final int REVERSE = 1;

    Transliterator(String ID, UnicodeFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public final int transliterate(Replaceable text, int start, int limit) {
        throw new RuntimeException("Stub!");
    }

    public final void transliterate(Replaceable text) {
        throw new RuntimeException("Stub!");
    }

    public final String transliterate(String text) {
        throw new RuntimeException("Stub!");
    }

    public final void transliterate(Replaceable text, Position index, String insertion) {
        throw new RuntimeException("Stub!");
    }

    public final void transliterate(Replaceable text, Position index, int insertion) {
        throw new RuntimeException("Stub!");
    }

    public final void transliterate(Replaceable text, Position index) {
        throw new RuntimeException("Stub!");
    }

    public final void finishTransliteration(Replaceable text, Position index) {
        throw new RuntimeException("Stub!");
    }

    public void filteredTransliterate(Replaceable text, Position index, boolean incremental) {
        throw new RuntimeException("Stub!");
    }

    public final int getMaximumContextLength() {
        throw new RuntimeException("Stub!");
    }

    public final String getID() {
        throw new RuntimeException("Stub!");
    }

    public static final String getDisplayName(String ID) {
        throw new RuntimeException("Stub!");
    }

    public static String getDisplayName(String id, Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static String getDisplayName(String id, ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeFilter getFilter() {
        throw new RuntimeException("Stub!");
    }

    public void setFilter(UnicodeFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public static final Transliterator getInstance(String ID) {
        throw new RuntimeException("Stub!");
    }

    public static Transliterator getInstance(String ID, int dir) {
        throw new RuntimeException("Stub!");
    }

    public static final Transliterator createFromRules(String ID, String rules, int dir) {
        throw new RuntimeException("Stub!");
    }

    public String toRules(boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }

    public Transliterator[] getElements() {
        throw new RuntimeException("Stub!");
    }

    public final UnicodeSet getSourceSet() {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet getTargetSet() {
        throw new RuntimeException("Stub!");
    }

    public final Transliterator getInverse() {
        throw new RuntimeException("Stub!");
    }

    public static final Enumeration<String> getAvailableIDs() {
        throw new RuntimeException("Stub!");
    }

    public static final Enumeration<String> getAvailableSources() {
        throw new RuntimeException("Stub!");
    }

    public static final Enumeration<String> getAvailableTargets(String source) {
        throw new RuntimeException("Stub!");
    }

    public static final Enumeration<String> getAvailableVariants(String source, String target) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/Transliterator$Position.class */
    public static class Position {
        public int contextLimit;
        public int contextStart;
        public int limit;
        public int start;

        public Position() {
            throw new RuntimeException("Stub!");
        }

        public Position(int contextStart, int contextLimit, int start) {
            throw new RuntimeException("Stub!");
        }

        public Position(int contextStart, int contextLimit, int start, int limit) {
            throw new RuntimeException("Stub!");
        }

        public Position(Position pos) {
            throw new RuntimeException("Stub!");
        }

        public void set(Position pos) {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object obj) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public final void validate(int length) {
            throw new RuntimeException("Stub!");
        }
    }
}
