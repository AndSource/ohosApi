package ohos.agp.components;

import ohos.agp.utils.MimeData;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DragEvent.class */
public class DragEvent {
    public static final int DRAG_BEGIN = 1;
    public static final int DRAG_DROP = 6;
    public static final int DRAG_FINISH = 5;
    public static final int DRAG_IN = 3;
    public static final int DRAG_MOVE = 2;
    public static final int DRAG_OUT = 4;

    DragEvent(int action, float x, float y, MimeData mimeData) {
        throw new RuntimeException("Stub!");
    }

    public static DragEvent obtain(int action, float x, float y, MimeData mimeData) {
        throw new RuntimeException("Stub!");
    }

    public final int getAction() {
        throw new RuntimeException("Stub!");
    }

    public final float getX() {
        throw new RuntimeException("Stub!");
    }

    public final float getY() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public final MimeData getClipData() {
        throw new RuntimeException("Stub!");
    }

    public final MimeData getMimeData() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBroadcast() {
        throw new RuntimeException("Stub!");
    }
}
