package ohos.global.icu.text;

import java.text.CharacterIterator;
import ohos.global.icu.util.VersionInfo;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/RuleBasedCollator.class */
public final class RuleBasedCollator extends Collator {
    public RuleBasedCollator(String rules) throws Exception {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public CollationElementIterator getCollationElementIterator(String source) {
        throw new RuntimeException("Stub!");
    }

    public CollationElementIterator getCollationElementIterator(CharacterIterator source) {
        throw new RuntimeException("Stub!");
    }

    public CollationElementIterator getCollationElementIterator(UCharacterIterator source) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator, ohos.global.icu.util.Freezable
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.text.Collator, ohos.global.icu.util.Freezable
    public Collator freeze() {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.global.icu.text.Collator, ohos.global.icu.util.Freezable
    public Collator cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }

    public void setUpperCaseFirst(boolean upperfirst) {
        throw new RuntimeException("Stub!");
    }

    public void setLowerCaseFirst(boolean lowerfirst) {
        throw new RuntimeException("Stub!");
    }

    public void setCaseFirstDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setAlternateHandlingDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setCaseLevelDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setDecompositionDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setFrenchCollationDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setStrengthDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setNumericCollationDefault() {
        throw new RuntimeException("Stub!");
    }

    public void setFrenchCollation(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public void setAlternateHandlingShifted(boolean shifted) {
        throw new RuntimeException("Stub!");
    }

    public void setCaseLevel(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public void setDecomposition(int decomposition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public void setStrength(int newStrength) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public RuleBasedCollator setMaxVariable(int group) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int getMaxVariable() {
        throw new RuntimeException("Stub!");
    }

    public void setNumericCollation(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public void setReorderCodes(int... order) {
        throw new RuntimeException("Stub!");
    }

    public String getRules() {
        throw new RuntimeException("Stub!");
    }

    public String getRules(boolean fullrules) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public UnicodeSet getTailoredSet() {
        throw new RuntimeException("Stub!");
    }

    public void getContractionsAndExpansions(UnicodeSet contractions, UnicodeSet expansions, boolean addPrefixes) throws Exception {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public CollationKey getCollationKey(String source) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int getStrength() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int getDecomposition() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUpperCaseFirst() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLowerCaseFirst() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAlternateHandlingShifted() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCaseLevel() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFrenchCollation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int getVariableTop() {
        throw new RuntimeException("Stub!");
    }

    public boolean getNumericCollation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int[] getReorderCodes() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator, java.util.Comparator
    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public int compare(String source, String target) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public VersionInfo getVersion() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.Collator
    public VersionInfo getUCAVersion() {
        throw new RuntimeException("Stub!");
    }
}
