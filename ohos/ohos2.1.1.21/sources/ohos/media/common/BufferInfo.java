package ohos.media.common;

/* loaded from: ohos2.1.1.21.jar:ohos/media/common/BufferInfo.class */
public class BufferInfo {
    public static final int BUFFER_TYPE_CODEC_CONFIG = 2;
    public static final int BUFFER_TYPE_END_OF_STREAM = 4;
    public static final int BUFFER_TYPE_KEY_FRAME = 1;
    public static final int BUFFER_TYPE_MUXER_DATA = 16;
    public static final int BUFFER_TYPE_PARTIAL_FRAME = 8;
    public int bufferType;
    public int offset;
    public int size;
    public long timeStamp;

    public BufferInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setInfo(int offset, int size, long timeStamp, int bufferType) {
        throw new RuntimeException("Stub!");
    }
}
