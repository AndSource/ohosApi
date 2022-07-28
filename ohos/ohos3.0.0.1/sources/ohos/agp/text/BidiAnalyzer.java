package ohos.agp.text;

import java.util.List;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/BidiAnalyzer.class */
public class BidiAnalyzer {
    BidiAnalyzer() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isRtl(BidiStrategy strategy, CharSequence text) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isRtl(BidiStrategy strategy, CharSequence text, String locale) {
        throw new RuntimeException("Stub!");
    }

    public static boolean getBidiRuns(BidiStrategy strategy, CharSequence text, List<BidiRun> runs) {
        throw new RuntimeException("Stub!");
    }

    public static boolean getBidiRuns(BidiStrategy strategy, CharSequence text, List<BidiRun> runs, String locale) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/BidiAnalyzer$BidiRun.class */
    public static final class BidiRun {
        public BidiRun(int start, int length, boolean isRtl) {
            throw new RuntimeException("Stub!");
        }

        public int getStart() {
            throw new RuntimeException("Stub!");
        }

        public int getLength() {
            throw new RuntimeException("Stub!");
        }

        public boolean isRtl() {
            throw new RuntimeException("Stub!");
        }

        public boolean equals(Object other) {
            throw new RuntimeException("Stub!");
        }

        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/BidiAnalyzer$BidiStrategy.class */
    public enum BidiStrategy {
        FIRSTSTRONG_OR_LTR,
        FIRSTSTRONG_OR_RTL,
        LTR,
        RTL,
        LOCALE,
        RTLEXIST_OR_LTR;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static BidiStrategy getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
