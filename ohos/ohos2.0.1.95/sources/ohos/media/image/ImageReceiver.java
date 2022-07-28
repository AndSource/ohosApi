package ohos.media.image;

import ohos.agp.graphics.Surface;
import ohos.media.image.common.Size;

/* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageReceiver.class */
public class ImageReceiver {

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageReceiver$IImageArrivalListener.class */
    public interface IImageArrivalListener {
        void onImageArrival(ImageReceiver imageReceiver);
    }

    ImageReceiver(int width, int height, int format, int capacity, long usage) {
        throw new RuntimeException("Stub!");
    }

    public static ImageReceiver create(int width, int height, int format, int capacity) {
        throw new RuntimeException("Stub!");
    }

    public Surface getRecevingSurface() {
        throw new RuntimeException("Stub!");
    }

    public Size getImageSize() {
        throw new RuntimeException("Stub!");
    }

    public int getCapacity() {
        throw new RuntimeException("Stub!");
    }

    public int getImageFormat() {
        throw new RuntimeException("Stub!");
    }

    public Image readLatestImage() {
        throw new RuntimeException("Stub!");
    }

    public Image readNextImage() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public void setImageArrivalListener(IImageArrivalListener listener) {
        throw new RuntimeException("Stub!");
    }
}
