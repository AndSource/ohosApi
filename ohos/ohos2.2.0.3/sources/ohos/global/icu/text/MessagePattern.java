package ohos.global.icu.text;

import ohos.global.icu.util.Freezable;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/MessagePattern.class */
public final class MessagePattern implements Cloneable, Freezable<MessagePattern> {
    public static final int ARG_NAME_NOT_NUMBER = -1;
    public static final int ARG_NAME_NOT_VALID = -2;
    public static final double NO_NUMERIC_VALUE = -1.23456789E8d;

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/MessagePattern$ApostropheMode.class */
    public enum ApostropheMode {
        DOUBLE_OPTIONAL,
        DOUBLE_REQUIRED
    }

    public MessagePattern() {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern(ApostropheMode mode) {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern parse(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern parseChoiceStyle(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern parsePluralStyle(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public MessagePattern parseSelectStyle(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public void clearPatternAndSetApostropheMode(ApostropheMode mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public ApostropheMode getApostropheMode() {
        throw new RuntimeException("Stub!");
    }

    public String getPatternString() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasNamedArguments() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasNumberedArguments() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public static int validateArgumentName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String autoQuoteApostropheDeep() {
        throw new RuntimeException("Stub!");
    }

    public int countParts() {
        throw new RuntimeException("Stub!");
    }

    public Part getPart(int i) {
        throw new RuntimeException("Stub!");
    }

    public Part.Type getPartType(int i) {
        throw new RuntimeException("Stub!");
    }

    public int getPatternIndex(int partIndex) {
        throw new RuntimeException("Stub!");
    }

    public String getSubstring(Part part) {
        throw new RuntimeException("Stub!");
    }

    public boolean partSubstringMatches(Part part, String s) {
        throw new RuntimeException("Stub!");
    }

    public double getNumericValue(Part part) {
        throw new RuntimeException("Stub!");
    }

    public double getPluralOffset(int pluralStart) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitPartIndex(int start) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public MessagePattern cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.util.Freezable
    public MessagePattern freeze() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/MessagePattern$ArgType.class */
    public enum ArgType {
        NONE,
        SIMPLE,
        CHOICE,
        PLURAL,
        SELECT,
        SELECTORDINAL;

        public boolean hasPluralStyle() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/MessagePattern$Part.class */
    public static final class Part {
        Part(Type t, int i, int l, int v) {
            throw new RuntimeException("Stub!");
        }

        public Type getType() {
            throw new RuntimeException("Stub!");
        }

        public int getIndex() {
            throw new RuntimeException("Stub!");
        }

        public int getLength() {
            throw new RuntimeException("Stub!");
        }

        public int getLimit() {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public ArgType getArgType() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object other) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/MessagePattern$Part$Type.class */
        public enum Type {
            MSG_START,
            MSG_LIMIT,
            SKIP_SYNTAX,
            INSERT_CHAR,
            REPLACE_NUMBER,
            ARG_START,
            ARG_LIMIT,
            ARG_NUMBER,
            ARG_NAME,
            ARG_TYPE,
            ARG_STYLE,
            ARG_SELECTOR,
            ARG_INT,
            ARG_DOUBLE;

            public boolean hasNumericValue() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
