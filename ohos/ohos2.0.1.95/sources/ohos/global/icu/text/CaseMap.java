package ohos.global.icu.text;

import java.util.Locale;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/CaseMap.class */
public abstract class CaseMap {
    public abstract CaseMap omitUnchangedText();

    CaseMap(int opt) {
        throw new RuntimeException("Stub!");
    }

    public static Lower toLower() {
        throw new RuntimeException("Stub!");
    }

    public static Upper toUpper() {
        throw new RuntimeException("Stub!");
    }

    public static Title toTitle() {
        throw new RuntimeException("Stub!");
    }

    public static Fold fold() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/CaseMap$Fold.class */
    public static final class Fold extends CaseMap {
        Fold(int opt) {
            super(0);
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.global.icu.text.CaseMap
        public Fold omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }

        public Fold turkic() {
            throw new RuntimeException("Stub!");
        }

        public String apply(CharSequence src) {
            throw new RuntimeException("Stub!");
        }

        public <A extends Appendable> A apply(CharSequence src, A dest, Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/CaseMap$Lower.class */
    public static final class Lower extends CaseMap {
        Lower(int opt) {
            super(0);
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.global.icu.text.CaseMap
        public Lower omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }

        public String apply(Locale locale, CharSequence src) {
            throw new RuntimeException("Stub!");
        }

        public <A extends Appendable> A apply(Locale locale, CharSequence src, A dest, Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/CaseMap$Title.class */
    public static final class Title extends CaseMap {
        Title(int opt) {
            super(0);
            throw new RuntimeException("Stub!");
        }

        public Title wholeString() {
            throw new RuntimeException("Stub!");
        }

        public Title sentences() {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.global.icu.text.CaseMap
        public Title omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }

        public Title noLowercase() {
            throw new RuntimeException("Stub!");
        }

        public Title noBreakAdjustment() {
            throw new RuntimeException("Stub!");
        }

        public Title adjustToCased() {
            throw new RuntimeException("Stub!");
        }

        public String apply(Locale locale, BreakIterator iter, CharSequence src) {
            throw new RuntimeException("Stub!");
        }

        public <A extends Appendable> A apply(Locale locale, BreakIterator iter, CharSequence src, A dest, Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/CaseMap$Upper.class */
    public static final class Upper extends CaseMap {
        Upper(int opt) {
            super(0);
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.global.icu.text.CaseMap
        public Upper omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }

        public String apply(Locale locale, CharSequence src) {
            throw new RuntimeException("Stub!");
        }

        public <A extends Appendable> A apply(Locale locale, CharSequence src, A dest, Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }
}
