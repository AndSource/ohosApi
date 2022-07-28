package ohos.media.muxer;

import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import ohos.media.common.BufferInfo;
import ohos.media.common.Format;

/* loaded from: ohos2.2.0.3.jar:ohos/media/muxer/Muxer.class */
public class Muxer {
    public Muxer(String outputUri, int outputFormat) {
        throw new RuntimeException("Stub!");
    }

    public Muxer(FileDescriptor fd, int outputFormat) {
        throw new RuntimeException("Stub!");
    }

    public int appendTrack(Format format) {
        throw new RuntimeException("Stub!");
    }

    public boolean start() {
        throw new RuntimeException("Stub!");
    }

    public boolean stop() {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeBuffer(int trackIndex, ByteBuffer byteBuf, BufferInfo bufferInfo) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMediaLocation(float latitude, float longitude) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMediaOrientation(int degrees) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/muxer/Muxer$MediaFileFormat.class */
    public static final class MediaFileFormat {
        public static final int FORMAT_3GPP = 2;
        public static final int FORMAT_HEIF = 3;
        public static final int FORMAT_MPEG4 = 0;
        public static final int FORMAT_WEBM = 1;

        MediaFileFormat() {
            throw new RuntimeException("Stub!");
        }
    }
}
