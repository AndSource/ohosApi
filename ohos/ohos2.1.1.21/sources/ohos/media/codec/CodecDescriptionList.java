package ohos.media.codec;

import java.util.List;
import ohos.media.common.Format;

/* loaded from: ohos2.1.1.21.jar:ohos/media/codec/CodecDescriptionList.class */
public class CodecDescriptionList {
    public CodecDescriptionList() {
        throw new RuntimeException("Stub!");
    }

    public final List<CodecDescription> getSupportedCodecs() {
        throw new RuntimeException("Stub!");
    }

    public final List<CodecDescription> getSupportedDecoders() {
        throw new RuntimeException("Stub!");
    }

    public final List<CodecDescription> getSupportedEncoders() {
        throw new RuntimeException("Stub!");
    }

    public final List<CodecDescription> findDecoder(Format format) {
        throw new RuntimeException("Stub!");
    }

    public final List<CodecDescription> findEncoder(Format format) {
        throw new RuntimeException("Stub!");
    }

    public static List<String> getSupportedMimes() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDecodeSupportedByMime(String mime) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isEncodeSupportedByMime(String mime) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDecoderSupportedByFormat(Format format) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isEncoderSupportedByFormat(Format format) {
        throw new RuntimeException("Stub!");
    }
}
