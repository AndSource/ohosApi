package ohos.agp.text.richstyles;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/RichStyle.class */
public abstract class RichStyle {
    public RichStyle() {
        throw new RuntimeException("Stub!");
    }

    public TypeId getRichStyleTypeId() {
        throw new RuntimeException("Stub!");
    }

    public int getCapability() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/RichStyle$Capability.class */
    public static class Capability {
        public static final int ALIGNMENT_FLAG = 524288;
        public static final int CLICK_FLAG = 8;
        public static final int COPIABLE_FLAG = 1073741824;
        public static final int CUSTOM_DRAW_FLAG = 64;
        public static final int CUSTOM_LINE_BG_FLAG = 2097152;
        public static final int DECORATION_FLAG = 4;
        public static final int INDENT_FLAG = 131072;
        public static final int LINE_HEIGHT_FLAG = 262144;
        public static final int OBSERVER_FLAG = 536870912;
        public static final int PARAGRAPH_FLAG = 65536;
        public static final int REPLACEMENT_FLAG = 16;
        public static final int REPLACE_DRAW_FLAG = 32;
        public static final int TAB_STOPS_FLAG = 1048576;
        public static final int UPDATE_LAYOUT_FLAG = 2;
        public static final int UPDATE_PAINT_FLAG = 1;

        Capability() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/RichStyle$TypeId.class */
    public enum TypeId {
        UNKNOWN,
        BACKGROUND_COLOR_RICH_STYLE,
        FONT_RICH_STYLE,
        FONT_SIZE_RICH_STYLE,
        FOREGROUND_COLOR_RICH_STYLE,
        IMAGE_RICH_STYLE,
        HORIZONTAL_SCALE_RICH_STYLE,
        STRIKETHROUGH_RICH_STYLE,
        SUBSCRIPT_RICH_STYLE,
        SUPERSCRIPT_RICH_STYLE,
        UNDERLINE_RICH_STYLE,
        URL_RICH_STYLE,
        CLICK_RICH_STYLE,
        ALIGNMENT_RICH_STYLE,
        INDENT_RICH_STYLE,
        LINE_HEIGHT_RICH_STYLE,
        LINE_BACKGROUND_RICH_STYLE,
        TAB_STOPS_RICH_STYLE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static TypeId getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
