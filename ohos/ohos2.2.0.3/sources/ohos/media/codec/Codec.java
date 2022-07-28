package ohos.media.codec;

import java.nio.ByteBuffer;
import ohos.agp.graphics.Surface;
import ohos.media.common.BufferInfo;
import ohos.media.common.Format;
import ohos.media.common.Source;

/* loaded from: ohos2.2.0.3.jar:ohos/media/codec/Codec.class */
public class Codec {
    public static final int VIDEO_SCALE_TYPE_CROP = 2;
    public static final int VIDEO_SCALE_TYPE_FIT = 1;

    /* loaded from: ohos2.2.0.3.jar:ohos/media/codec/Codec$ICodecListener.class */
    public interface ICodecListener {
        void onReadBuffer(ByteBuffer byteBuffer, BufferInfo bufferInfo, int i);

        void onError(int i, int i2, int i3);
    }

    Codec(boolean isDecoder) {
        throw new RuntimeException("Stub!");
    }

    public static Codec createDecoder() {
        throw new RuntimeException("Stub!");
    }

    public static Codec createEncoder() {
        throw new RuntimeException("Stub!");
    }

    public boolean registerCodecListener(ICodecListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(Source source, TrackInfo trackInfo) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSourceFormat(Format format) {
        throw new RuntimeException("Stub!");
    }

    public boolean setCodecFormat(Format format) {
        throw new RuntimeException("Stub!");
    }

    public boolean setProperty(Format format) {
        throw new RuntimeException("Stub!");
    }

    public Surface obtainInputSurface() {
        throw new RuntimeException("Stub!");
    }

    public boolean setVideoSurface(Surface surface) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVideoScaleType(int type) {
        throw new RuntimeException("Stub!");
    }

    public ByteBuffer getAvailableBuffer(long timeout) {
        throw new RuntimeException("Stub!");
    }

    public boolean writeBuffer(ByteBuffer buffer, BufferInfo info) {
        throw new RuntimeException("Stub!");
    }

    public Format getBufferFormat(ByteBuffer buffer) {
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

    public boolean flush() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
