package ohos.agp.components.events;

import ohos.media.image.PixelMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/events/MousePointerStyle.class */
public class MousePointerStyle implements Sequenceable {
    public static final Sequenceable.Producer<MousePointerStyle> PRODUCER = null;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/events/MousePointerStyle$PointerStyleType.class */
    public enum PointerStyleType {
        NONE,
        DEFAULT_ARROW,
        CONTEXT_MENU,
        WAIT,
        CROSSHAIR,
        TEXT,
        VERTICAL_TEXT,
        COPY,
        HELP,
        NO_DROP,
        ALL_SCROLL,
        CELL,
        GRAB,
        GRABBING,
        HORIZONTAL_RESIZE,
        VERTICAL_RESIZE,
        NESW_RESIZE,
        NWSE_RESIZE,
        ZOOM_IN,
        ZOOM_OUT
    }

    public MousePointerStyle(PointerStyleType type) {
        throw new RuntimeException("Stub!");
    }

    public MousePointerStyle(PixelMap pixelMap, HotSpot hotSpot) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/events/MousePointerStyle$HotSpot.class */
    public static class HotSpot implements Sequenceable {
        public HotSpot() {
            throw new RuntimeException("Stub!");
        }

        public HotSpot(float offsetX, float offsetY) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean marshalling(Parcel out) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean unmarshalling(Parcel in) {
            throw new RuntimeException("Stub!");
        }
    }
}
