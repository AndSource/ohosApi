package ohos.media.extractor;

import java.nio.ByteBuffer;
import ohos.media.common.Format;
import ohos.media.common.Source;

/* loaded from: ohos3.0.0.1.jar:ohos/media/extractor/Extractor.class */
public class Extractor {
    public static final int REWIND_TO_CLOSEST_SYNC = 1;
    public static final int REWIND_TO_NEXT_SYNC = 2;
    public static final int REWIND_TO_PREVIOUS_SYNC = 0;

    public Extractor() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(Source source) {
        throw new RuntimeException("Stub!");
    }

    public final Format getStreamFormat(int id) {
        throw new RuntimeException("Stub!");
    }

    public final int getTotalStreams() {
        throw new RuntimeException("Stub!");
    }

    public boolean specifyStream(int id) {
        throw new RuntimeException("Stub!");
    }

    public boolean unspecifyStream(int id) {
        throw new RuntimeException("Stub!");
    }

    public boolean rewindTo(long microseconds, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean next() {
        throw new RuntimeException("Stub!");
    }

    public int readBuffer(ByteBuffer buf, int offset) {
        throw new RuntimeException("Stub!");
    }

    public int getStreamId() {
        throw new RuntimeException("Stub!");
    }

    public long getFrameTimestamp() {
        throw new RuntimeException("Stub!");
    }

    public long getFrameSize() {
        throw new RuntimeException("Stub!");
    }

    public int getFrameType() {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
