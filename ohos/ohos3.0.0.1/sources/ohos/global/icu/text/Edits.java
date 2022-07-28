package ohos.global.icu.text;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/Edits.class */
public final class Edits {
    public Edits() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public void addUnchanged(int unchangedLength) {
        throw new RuntimeException("Stub!");
    }

    public void addReplace(int oldLength, int newLength) {
        throw new RuntimeException("Stub!");
    }

    public int lengthDelta() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasChanges() {
        throw new RuntimeException("Stub!");
    }

    public int numberOfChanges() {
        throw new RuntimeException("Stub!");
    }

    public Iterator getCoarseChangesIterator() {
        throw new RuntimeException("Stub!");
    }

    public Iterator getCoarseIterator() {
        throw new RuntimeException("Stub!");
    }

    public Iterator getFineChangesIterator() {
        throw new RuntimeException("Stub!");
    }

    public Iterator getFineIterator() {
        throw new RuntimeException("Stub!");
    }

    public Edits mergeAndAppend(Edits ab, Edits bc) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/Edits$Iterator.class */
    public static final class Iterator {
        Iterator(char[] a, int len, boolean oc, boolean crs) {
            throw new RuntimeException("Stub!");
        }

        public boolean next() {
            throw new RuntimeException("Stub!");
        }

        public boolean findSourceIndex(int i) {
            throw new RuntimeException("Stub!");
        }

        public boolean findDestinationIndex(int i) {
            throw new RuntimeException("Stub!");
        }

        public int destinationIndexFromSourceIndex(int i) {
            throw new RuntimeException("Stub!");
        }

        public int sourceIndexFromDestinationIndex(int i) {
            throw new RuntimeException("Stub!");
        }

        public boolean hasChange() {
            throw new RuntimeException("Stub!");
        }

        public int oldLength() {
            throw new RuntimeException("Stub!");
        }

        public int newLength() {
            throw new RuntimeException("Stub!");
        }

        public int sourceIndex() {
            throw new RuntimeException("Stub!");
        }

        public int replacementIndex() {
            throw new RuntimeException("Stub!");
        }

        public int destinationIndex() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
