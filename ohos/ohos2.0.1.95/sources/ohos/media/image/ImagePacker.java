package ohos.media.image;

import java.io.OutputStream;
import java.util.HashSet;

/* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImagePacker.class */
public class ImagePacker {
    ImagePacker(long nativePtr) {
        throw new RuntimeException("Stub!");
    }

    public static ImagePacker create() {
        throw new RuntimeException("Stub!");
    }

    public static HashSet<String> getSupportedFormats() {
        throw new RuntimeException("Stub!");
    }

    public boolean initializePacking(byte[] data, PackingOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public boolean initializePacking(byte[] data, int offset, PackingOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public boolean initializePacking(OutputStream outputStream, PackingOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public boolean addImage(PixelMap pixelmap) {
        throw new RuntimeException("Stub!");
    }

    public boolean addImage(ImageSource source) {
        throw new RuntimeException("Stub!");
    }

    public boolean addImage(ImageSource source, int index) {
        throw new RuntimeException("Stub!");
    }

    public long finalizePacking() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImagePacker$PackingOptions.class */
    public static class PackingOptions {
        public String format = "image/jpeg";
        public int numberHint = 1;
        public int quality = 100;

        public PackingOptions() {
            throw new RuntimeException("Stub!");
        }
    }
}
