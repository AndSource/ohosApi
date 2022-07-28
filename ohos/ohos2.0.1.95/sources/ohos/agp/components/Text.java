package ohos.agp.components;

import ohos.agp.components.Component;
import ohos.agp.components.element.Element;
import ohos.agp.text.Font;
import ohos.agp.text.RichText;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text.class */
public class Text extends Component {
    public static final int AUTO_SCROLLING_FOREVER = -1;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$EditorActionListener.class */
    public interface EditorActionListener {
        boolean onTextEditorAction(int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$TextColorObserver.class */
    public interface TextColorObserver {
        void onTextColorChanged(int i, int i2);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$TextObserver.class */
    public interface TextObserver {
        void onTextUpdated(String str, int i, int i2, int i3);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$TextSizeObserver.class */
    public interface TextSizeObserver {
        void onTextSizeChanged(int i, int i2);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$TextSizeType.class */
    public enum TextSizeType {
        VP,
        FP,
        PX
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Text$TruncationMode.class */
    public enum TruncationMode {
        NONE,
        ELLIPSIS_AT_START,
        ELLIPSIS_AT_MIDDLE,
        ELLIPSIS_AT_END,
        AUTO_SCROLLING
    }

    public Text(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Text(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Text(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void addTextObserver(TextObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void removeTextObserver(TextObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void setEditorActionListener(EditorActionListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getFont() {
        throw new RuntimeException("Stub!");
    }

    public void setTruncationMode(TruncationMode mode) {
        throw new RuntimeException("Stub!");
    }

    public TruncationMode getTruncationMode() {
        throw new RuntimeException("Stub!");
    }

    public void setInputMethodOption(int option) {
        throw new RuntimeException("Stub!");
    }

    public int getInputMethodOption() {
        throw new RuntimeException("Stub!");
    }

    public void setAutoFontSizeRule(int minFontSize, int maxFontSize, int autoFontStep) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoFontSizeRule(int[] preSet) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAutoFontSize() {
        throw new RuntimeException("Stub!");
    }

    public void setAutoScrollingDuration(long duration) {
        throw new RuntimeException("Stub!");
    }

    public long getAutoScrollingDuration() {
        throw new RuntimeException("Stub!");
    }

    public void setAutoScrollingCount(int count) {
        throw new RuntimeException("Stub!");
    }

    public int getAutoScrollingCount() {
        throw new RuntimeException("Stub!");
    }

    public void startAutoScrolling() {
        throw new RuntimeException("Stub!");
    }

    public void stopAutoScrolling() {
        throw new RuntimeException("Stub!");
    }

    public void setCursorElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getCursorElement() {
        throw new RuntimeException("Stub!");
    }

    public void setAroundElements(Element left, Element top, Element right, Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public Element[] getAroundElements() {
        throw new RuntimeException("Stub!");
    }

    public Element getLeftElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getRightElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getTopElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getBottonElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getStartElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getEndElement() {
        throw new RuntimeException("Stub!");
    }

    public void setAroundElementsRelative(Element start, Element top, Element end, Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public Element[] getAroundElementsRelative() {
        throw new RuntimeException("Stub!");
    }

    public void setAroundElementsPadding(int padding) {
        throw new RuntimeException("Stub!");
    }

    public int getAroundElementsPadding() {
        throw new RuntimeException("Stub!");
    }

    public void setTextInputType(int inputType) {
        throw new RuntimeException("Stub!");
    }

    public int getTextInputType() {
        throw new RuntimeException("Stub!");
    }

    public void setRichText(RichText richText) {
        throw new RuntimeException("Stub!");
    }

    public RichText getRichText() {
        throw new RuntimeException("Stub!");
    }

    public void setText(String text) {
        throw new RuntimeException("Stub!");
    }

    public void setText(int resId) {
        throw new RuntimeException("Stub!");
    }

    public String getText() {
        throw new RuntimeException("Stub!");
    }

    public void setHint(String hint) {
        throw new RuntimeException("Stub!");
    }

    public String getHint() {
        throw new RuntimeException("Stub!");
    }

    public String getEditableString() {
        throw new RuntimeException("Stub!");
    }

    public void setTextSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public void setTextSize(int size, TextSizeType textSizeType) {
        throw new RuntimeException("Stub!");
    }

    public int getTextSize() {
        throw new RuntimeException("Stub!");
    }

    public int getTextSize(TextSizeType textSizeType) {
        throw new RuntimeException("Stub!");
    }

    public void setTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setHintColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getHintColor() {
        throw new RuntimeException("Stub!");
    }

    public void setTextAlignment(int textAlignment) {
        throw new RuntimeException("Stub!");
    }

    public int getTextAlignment() {
        throw new RuntimeException("Stub!");
    }

    public void setTextCursorVisible(boolean visible) {
        throw new RuntimeException("Stub!");
    }

    public boolean isTextCursorVisible() {
        throw new RuntimeException("Stub!");
    }

    public int length() {
        throw new RuntimeException("Stub!");
    }

    public void append(String text) {
        throw new RuntimeException("Stub!");
    }

    public void insert(String text) {
        throw new RuntimeException("Stub!");
    }

    public void insert(String text, int pos) {
        throw new RuntimeException("Stub!");
    }

    public void delete(int length) {
        throw new RuntimeException("Stub!");
    }

    public void delete(int length, boolean back) {
        throw new RuntimeException("Stub!");
    }

    public void delete(int length, boolean back, int pos) {
        throw new RuntimeException("Stub!");
    }

    public void setMultipleLine(boolean multiple) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultipleLine() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxTextLines(int maxLines) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxTextLines() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollable(boolean scrollable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScrollable() {
        throw new RuntimeException("Stub!");
    }

    public void setAutoFontSize(boolean autoFontSize) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoFontSize(boolean autoFontSize, boolean userSizeFirst) {
        throw new RuntimeException("Stub!");
    }

    public void setLineSpacing(float add, float mult) {
        throw new RuntimeException("Stub!");
    }

    public float getNumOfFontHeight() {
        throw new RuntimeException("Stub!");
    }

    public float getAdditionalLineSpacing() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAdjustInputPanel() {
        throw new RuntimeException("Stub!");
    }

    public void setAdjustInputPanel(boolean adjust) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxTextHeight(int maxHeight) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxTextHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxTextWidth(int maxWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxTextWidth() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    protected void onRtlChanged(Component.LayoutDirection layoutDirection) {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    public int getBubbleWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getBubbleHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setLeftBubbleSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void setLeftBubbleWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setLeftBubbleHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionLeftBubbleWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionLeftBubbleHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setRightBubbleSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void setRightBubbleWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setRightBubbleHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionRightBubbleWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionRightBubbleHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getSelectionColor() {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionLeftBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectionLeftBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionRightBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectionRightBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setFadeEffectBoundaryWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public int getFadeEffectBoundaryWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingForText(boolean hasPadding) {
        throw new RuntimeException("Stub!");
    }

    public boolean getPaddingForText() {
        throw new RuntimeException("Stub!");
    }
}
