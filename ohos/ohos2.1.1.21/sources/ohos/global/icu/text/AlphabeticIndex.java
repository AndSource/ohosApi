package ohos.global.icu.text;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/AlphabeticIndex.class */
public final class AlphabeticIndex<V> implements Iterable<Bucket<V>> {
    public AlphabeticIndex(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex(RuleBasedCollator collator) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> addLabels(UnicodeSet additions) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> addLabels(ULocale... additions) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> addLabels(Locale... additions) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> setOverflowLabel(String overflowLabel) {
        throw new RuntimeException("Stub!");
    }

    public String getUnderflowLabel() {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> setUnderflowLabel(String underflowLabel) {
        throw new RuntimeException("Stub!");
    }

    public String getOverflowLabel() {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> setInflowLabel(String inflowLabel) {
        throw new RuntimeException("Stub!");
    }

    public String getInflowLabel() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxLabelCount() {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> setMaxLabelCount(int maxLabelCount) {
        throw new RuntimeException("Stub!");
    }

    public ImmutableIndex<V> buildImmutableIndex() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getBucketLabels() {
        throw new RuntimeException("Stub!");
    }

    public RuleBasedCollator getCollator() {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> addRecord(CharSequence name, V data) {
        throw new RuntimeException("Stub!");
    }

    public int getBucketIndex(CharSequence name) {
        throw new RuntimeException("Stub!");
    }

    public AlphabeticIndex<V> clearRecords() {
        throw new RuntimeException("Stub!");
    }

    public int getBucketCount() {
        throw new RuntimeException("Stub!");
    }

    public int getRecordCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Iterable
    public Iterator<Bucket<V>> iterator() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/AlphabeticIndex$Bucket.class */
    public static class Bucket<V> implements Iterable<Record<V>> {

        /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/AlphabeticIndex$Bucket$LabelType.class */
        public enum LabelType {
            NORMAL,
            UNDERFLOW,
            INFLOW,
            OVERFLOW
        }

        Bucket(String label, String lowerBoundary, LabelType labelType) {
            throw new RuntimeException("Stub!");
        }

        public String getLabel() {
            throw new RuntimeException("Stub!");
        }

        public LabelType getLabelType() {
            throw new RuntimeException("Stub!");
        }

        public int size() {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.Iterable
        public Iterator<Record<V>> iterator() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/AlphabeticIndex$ImmutableIndex.class */
    public static final class ImmutableIndex<V> implements Iterable<Bucket<V>> {
        ImmutableIndex() {
            throw new RuntimeException("Stub!");
        }

        public int getBucketCount() {
            throw new RuntimeException("Stub!");
        }

        public int getBucketIndex(CharSequence name) {
            throw new RuntimeException("Stub!");
        }

        public Bucket<V> getBucket(int index) {
            throw new RuntimeException("Stub!");
        }

        @Override // java.lang.Iterable
        public Iterator<Bucket<V>> iterator() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/AlphabeticIndex$Record.class */
    public static class Record<V> {
        Record(CharSequence name, V data) {
            throw new RuntimeException("Stub!");
        }

        public CharSequence getName() {
            throw new RuntimeException("Stub!");
        }

        public V getData() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
