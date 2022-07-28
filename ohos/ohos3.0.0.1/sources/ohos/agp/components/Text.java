package ohos.agp.components;

import java.util.List;
import java.util.Locale;
import ohos.agp.components.Component;
import ohos.agp.components.element.Element;
import ohos.agp.text.BidiAnalyzer;
import ohos.agp.text.Font;
import ohos.agp.text.InputFilter;
import ohos.agp.text.RichText;
import ohos.agp.text.TextLayout;
import ohos.agp.text.richstyles.UrlRichStyle;
import ohos.agp.utils.Color;
import ohos.agp.utils.Rect;
import ohos.app.Context;
import ohos.global.configuration.LocaleProfile;
import ohos.miscservices.inputmethod.EditingCapability;
import ohos.miscservices.inputmethod.EditingText;
import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text.class */
public class Text extends Component {
    public static final int AUTO_CURSOR_POSITION = -1;
    public static final int AUTO_SCROLLING_FOREVER = -1;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$ConversionType.class */
    public enum ConversionType {
        NONE,
        ALL_UPPERCASE,
        PASSWORD,
        SINGLE_LINE,
        CRLF2LF
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$EditorActionListener.class */
    public interface EditorActionListener {
        boolean onTextEditorAction(int i);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$TextColorObserver.class */
    public interface TextColorObserver {
        void onTextColorChanged(int i, int i2);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$TextObserver.class */
    public interface TextObserver {
        void onTextUpdated(String str, int i, int i2, int i3);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$TextSizeObserver.class */
    public interface TextSizeObserver {
        void onTextSizeChanged(int i, int i2);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$TextSizeType.class */
    public enum TextSizeType {
        VP,
        FP,
        PX
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$TruncationMode.class */
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

    public int[] getAutoFontSizeRule() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAutoFontSize() {
        throw new RuntimeException("Stub!");
    }

    public int getMinAutoFontSize() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxAutoFontSize() {
        throw new RuntimeException("Stub!");
    }

    public int getAutoFontSizeStep() {
        throw new RuntimeException("Stub!");
    }

    public float getTextHorizontalScale() {
        throw new RuntimeException("Stub!");
    }

    public void setTextHorizontalScale(float ratio) {
        throw new RuntimeException("Stub!");
    }

    public void setTextWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setMinTextWidth(int minWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getMinTextWidth() {
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

    public void setCursorElement(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoCursorAdjustmentEnabled(boolean isAutoMove) {
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

    @Deprecated
    public Element getBottonElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getBottomElement() {
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

    public void setHint(int resId) {
        throw new RuntimeException("Stub!");
    }

    public String getHint() {
        throw new RuntimeException("Stub!");
    }

    public String getEditableString() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEditable() {
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

    public void setMaxTextHeight(int maxTextHeight) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxTextHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setMinTextHeight(int minHeight) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxTextWidth(int maxTextWidth) {
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

    public int getSelectionStart() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionEnd() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSelection(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setBubbleElement(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionLeftBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionLeftBubbleElement(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionRightBubbleElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectionRightBubbleElement(int resId) {
        throw new RuntimeException("Stub!");
    }

    public Element getBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectionLeftBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectionRightBubbleElement() {
        throw new RuntimeException("Stub!");
    }

    public boolean setCursorPosition(int position) {
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

    public String getFontVariations() {
        throw new RuntimeException("Stub!");
    }

    public boolean setFontVariations(String variation) {
        throw new RuntimeException("Stub!");
    }

    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }

    public int getLineHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingStart() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingTop() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingEnd() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingBottom() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingLeft() {
        throw new RuntimeException("Stub!");
    }

    public int getCombinedPaddingRight() {
        throw new RuntimeException("Stub!");
    }

    public int getTextToTopSpace() {
        throw new RuntimeException("Stub!");
    }

    public int getTextToBottomSpace() {
        throw new RuntimeException("Stub!");
    }

    public void setHyperLinkColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public void setHyperLinkClickable(boolean isClickable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHyperLinkClickable() {
        throw new RuntimeException("Stub!");
    }

    public List<UrlRichStyle> getUrls() {
        throw new RuntimeException("Stub!");
    }

    public Locale getPrimaryLocale() {
        throw new RuntimeException("Stub!");
    }

    public void setPrimaryLocale(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public LocaleProfile getLocales() {
        throw new RuntimeException("Stub!");
    }

    public void setLocales(LocaleProfile locales) {
        throw new RuntimeException("Stub!");
    }

    public LocaleProfile getInputMethodLocales() {
        throw new RuntimeException("Stub!");
    }

    public void setInputMethodLocales(LocaleProfile locales) {
        throw new RuntimeException("Stub!");
    }

    public String getFontFeatures() {
        throw new RuntimeException("Stub!");
    }

    public void setFontFeatures(String settings) {
        throw new RuntimeException("Stub!");
    }

    public Color getTextShadowColor() {
        throw new RuntimeException("Stub!");
    }

    public void setTextShadow(float offsetX, float offsetY, float radius, Color color) {
        throw new RuntimeException("Stub!");
    }

    public float getTextShadowOffsetX() {
        throw new RuntimeException("Stub!");
    }

    public float getTextShadowOffsetY() {
        throw new RuntimeException("Stub!");
    }

    public float getTextShadowRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setHyphenationStrategy(TextLayout.HyphenationStrategy strategy) {
        throw new RuntimeException("Stub!");
    }

    public TextLayout.HyphenationStrategy getHyphenationStrategy() {
        throw new RuntimeException("Stub!");
    }

    public boolean moveToPosition(int offset) {
        throw new RuntimeException("Stub!");
    }

    public float getLetterSpacing() {
        throw new RuntimeException("Stub!");
    }

    public int getBaseLine(int line) {
        throw new RuntimeException("Stub!");
    }

    public void getBoundingRect(int line, Rect bounding) {
        throw new RuntimeException("Stub!");
    }

    public int getMinTextHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setMinTextLines(int minLines) {
        throw new RuntimeException("Stub!");
    }

    public int getMinTextLines() {
        throw new RuntimeException("Stub!");
    }

    public int getOffsetByCoordinates(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public FontFamilyType getFontFamilyType() {
        throw new RuntimeException("Stub!");
    }

    public void setFontFamilyType(FontFamilyType type) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxWidthInEms() {
        throw new RuntimeException("Stub!");
    }

    public int getMinWidthInEms() {
        throw new RuntimeException("Stub!");
    }

    public void setTextWidthInEms(int ems) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxWidthInEms(int maxEms) {
        throw new RuntimeException("Stub!");
    }

    public void setMinWidthInEms(int minEms) {
        throw new RuntimeException("Stub!");
    }

    public TextLayout.JustifyStrategy getJustifyStrategy() {
        throw new RuntimeException("Stub!");
    }

    public void setJustifyStrategy(TextLayout.JustifyStrategy strategy) {
        throw new RuntimeException("Stub!");
    }

    public void setLetterSpacing(float spacing) {
        throw new RuntimeException("Stub!");
    }

    public void setLineHeight(int lineHeight) {
        throw new RuntimeException("Stub!");
    }

    public void setTextHeight(int pixels) {
        throw new RuntimeException("Stub!");
    }

    public void setLines(int lines) {
        throw new RuntimeException("Stub!");
    }

    public TextLayout.LineBreakStrategy getLineBreakStrategy() {
        throw new RuntimeException("Stub!");
    }

    public void setLineBreakStrategy(TextLayout.LineBreakStrategy strategy) {
        throw new RuntimeException("Stub!");
    }

    public void lockEditingState() {
        throw new RuntimeException("Stub!");
    }

    public void unlockEditingState() {
        throw new RuntimeException("Stub!");
    }

    public void onLockEditingState() {
        throw new RuntimeException("Stub!");
    }

    public void onUnlockEditingState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocusedByTouch() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTextSelectable() {
        throw new RuntimeException("Stub!");
    }

    public boolean adjustCursorPosition() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAutoSelectEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setAutoSelectEnabled(boolean isSelectAll) {
        throw new RuntimeException("Stub!");
    }

    public void setTextSelectable(boolean isSelectable) {
        throw new RuntimeException("Stub!");
    }

    public InputFilter[] getInputFilters() {
        throw new RuntimeException("Stub!");
    }

    public void setInputFilters(InputFilter[] filters) {
        throw new RuntimeException("Stub!");
    }

    public int getEditorAction() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getEditorActionText() {
        throw new RuntimeException("Stub!");
    }

    public void setEditorActionText(CharSequence text, int action) {
        throw new RuntimeException("Stub!");
    }

    public void setExtraInputData(PacMap data) {
        throw new RuntimeException("Stub!");
    }

    public String getCustomInputMethodOptions() {
        throw new RuntimeException("Stub!");
    }

    public void setCustomInputMethodOptions(String options) {
        throw new RuntimeException("Stub!");
    }

    public void setTextConversion(ConversionType conversionType) {
        throw new RuntimeException("Stub!");
    }

    public ConversionType getTextConversion() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAllUpperCase() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInputMethodActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean onTextEditorAction(int actionCode) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSoftInputVisibleOnFocus() {
        throw new RuntimeException("Stub!");
    }

    public void setSoftInputVisibleOnFocus(boolean isShow) {
        throw new RuntimeException("Stub!");
    }

    public boolean getEditingText(EditingCapability request, EditingText text) {
        throw new RuntimeException("Stub!");
    }

    public void setEditable(boolean isEditable) {
        throw new RuntimeException("Stub!");
    }

    public PacMap getExtraInputData(boolean isCreate) {
        throw new RuntimeException("Stub!");
    }

    public boolean onCustomInputMethodCommand(String action, PacMap data) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxCharacters(int maxValue) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFallbackFontMetricsEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setFallbackFontMetricsEnabled(boolean isEnable) {
        throw new RuntimeException("Stub!");
    }

    public void setTextDirectionStrategy(BidiAnalyzer.BidiStrategy strategy) {
        throw new RuntimeException("Stub!");
    }

    public BidiAnalyzer.BidiStrategy getTextDirectionStrategy() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Text$FontFamilyType.class */
    public enum FontFamilyType {
        DEFAULT,
        COMPACT,
        ELEGANT;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static FontFamilyType getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
