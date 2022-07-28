package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.render.PixelMapHolder;
import ohos.app.Context;
import ohos.media.image.PixelMap;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Image.class */
public class Image extends Component {
    public static final int CLIP_DIRECTION_NOT_SET = 0;
    public static final int CLIP_GRAVITY_NOT_SET = 0;
    public static final int CLIP_HORIZONTAL = 1;
    public static final int CLIP_VERTICAL = 2;
    public static final int GRAVITY_BOTTOM = 2048;
    public static final int GRAVITY_CENTER = 4096;
    public static final int GRAVITY_LEFT = 256;
    public static final int GRAVITY_RIGHT = 512;
    public static final int GRAVITY_TOP = 1024;

    public Image(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Image(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Image(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setPixelMapHolder(PixelMapHolder pixelMapHolder) {
        throw new RuntimeException("Stub!");
    }

    public PixelMapHolder getPixelMapHolder() {
        throw new RuntimeException("Stub!");
    }

    public void setPixelMap(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getPixelMap() {
        throw new RuntimeException("Stub!");
    }

    public void setImageElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getImageElement() {
        throw new RuntimeException("Stub!");
    }

    public void setImageAndDecodeBounds(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setPixelMap(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setClipDirection(int clipDirection) {
        throw new RuntimeException("Stub!");
    }

    public int getClipDirection() {
        throw new RuntimeException("Stub!");
    }

    public void setClipGravity(int clipGravity) {
        throw new RuntimeException("Stub!");
    }

    public int getClipGravity() {
        throw new RuntimeException("Stub!");
    }

    public void setScaleMode(ScaleMode scaleMode) {
        throw new RuntimeException("Stub!");
    }

    public ScaleMode getScaleMode() {
        throw new RuntimeException("Stub!");
    }

    public void setCornerRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public float getCornerRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setCornerRadii(float[] radii) {
        throw new RuntimeException("Stub!");
    }

    public float[] getCornerRadii() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Image$ScaleMode.class */
    public enum ScaleMode {
        ZOOM_CENTER,
        ZOOM_START,
        ZOOM_END,
        STRETCH,
        CENTER,
        INSIDE,
        CLIP_CENTER;

        protected int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static ScaleMode getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
