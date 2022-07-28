package ohos.agp.components;

import java.util.List;
import ohos.agp.animation.AnimatorProperty;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.element.Element;
import ohos.agp.render.Canvas;
import ohos.agp.utils.Color;
import ohos.agp.utils.DimensFloat;
import ohos.agp.utils.MimeData;
import ohos.agp.utils.Point;
import ohos.agp.utils.Rect;
import ohos.app.Context;
import ohos.global.configuration.Configuration;
import ohos.global.resource.ResourceManager;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.RotationEvent;
import ohos.multimodalinput.event.SpeechEvent;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component.class */
public class Component {
    public static final int ACCESSIBILITY_ADAPTABLE = 0;
    public static final int ACCESSIBILITY_DISABLE = 1;
    public static final int ACCESSIBILITY_ENABLE = 2;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;
    public static final float DEFAULT_SCALE = 1.0f;
    public static final int DRAG_DOWN = 2;
    public static final int DRAG_HORIZONTAL = 2;
    public static final int DRAG_HORIZONTAL_VERTICAL = 1;
    public static final int DRAG_LEFT = 3;
    public static final int DRAG_RIGHT = 4;
    public static final int DRAG_UP = 1;
    public static final int DRAG_VERTICAL = 3;
    public static final int FOCUS_ADAPTABLE = 4;
    public static final int FOCUS_DISABLE = 0;
    public static final int FOCUS_ENABLE = 8;
    public static final int FOCUS_NEXT = 4;
    public static final int FOCUS_PREVIOUS = 5;
    public static final int FOCUS_SIDE_BOTTOM = 3;
    public static final int FOCUS_SIDE_LEFT = 0;
    public static final int FOCUS_SIDE_RIGHT = 2;
    public static final int FOCUS_SIDE_TOP = 1;
    public static final int HIDE = 2;
    public static final int HORIZONTAL = 0;
    public static final int ID_DEFAULT = -1;
    public static final int INHERITED_MODE = 0;
    public static final int INVISIBLE = 1;
    public static final int OVAL_MODE = 2;
    protected static final int POSITION_X_INDEX = 0;
    protected static final int POSITION_Y_INDEX = 1;
    public static final int RECT_MODE = 1;
    public static final int SCROLL_AUTO_STAGE = 2;
    public static final int SCROLL_IDLE_STAGE = 0;
    public static final int SCROLL_NORMAL_STAGE = 1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    protected Element mBackgroundElement;
    protected Canvas mCanvasForTaskOverContent;
    protected Canvas mCanvasForTaskUnderContent;
    protected ComponentParent mComponentParent;
    protected Context mContext;
    protected DrawTask mDrawTaskOverContent;
    protected DrawTask mDrawTaskUnderContent;
    protected EstimateSizeListener mEstimateSizeListener;
    protected Element mForegroundElement;
    protected KeyEventListener mKeyEventListener;
    protected float[] mPosition;
    protected RotationEventListener mRotationEventListener;

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$BindStateChangedListener.class */
    public interface BindStateChangedListener {
        void onComponentBoundToWindow(Component component);

        void onComponentUnboundFromWindow(Component component);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$CanAcceptScrollListener.class */
    public interface CanAcceptScrollListener {
        boolean canAcceptScroll(Component component, int i, boolean z);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$ClickedListener.class */
    public interface ClickedListener {
        void onClick(Component component);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$ComponentStateChangedListener.class */
    public interface ComponentStateChangedListener {
        void onComponentStateChanged(Component component, int i);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$DoubleClickedListener.class */
    public interface DoubleClickedListener {
        void onDoubleClick(Component component);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$DrawTask.class */
    public interface DrawTask {
        public static final int BETWEEN_BACKGROUND_AND_CONTENT = 1;
        public static final int BETWEEN_CONTENT_AND_FOREGROUND = 2;

        void onDraw(Component component, Canvas canvas);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$EstimateSizeListener.class */
    public interface EstimateSizeListener {
        boolean onEstimateSize(int i, int i2);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$FocusChangedListener.class */
    public interface FocusChangedListener {
        void onFocusChange(Component component, boolean z);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$GestureType.class */
    public enum GestureType {
        TAP,
        LONG_PRESS,
        DOUBLE_TAP,
        HORZ_VERT_DRAG,
        HORIZONTAL_DRAG,
        VERTICAL_DRAG,
        SCALE
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$KeyEventListener.class */
    public interface KeyEventListener {
        boolean onKeyEvent(Component component, KeyEvent keyEvent);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$LayoutDirection.class */
    public enum LayoutDirection {
        LTR,
        RTL,
        INHERIT,
        LOCALE
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$LayoutRefreshedListener.class */
    public interface LayoutRefreshedListener {
        void onRefreshed(Component component);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$LongClickedListener.class */
    public interface LongClickedListener {
        void onLongClicked(Component component);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$RotationEventListener.class */
    public interface RotationEventListener {
        boolean onRotationEvent(Component component, RotationEvent rotationEvent);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$ScaledListener.class */
    public interface ScaledListener {
        void onScaleStart(Component component, ScaleInfo scaleInfo);

        void onScaleUpdate(Component component, ScaleInfo scaleInfo);

        void onScaleEnd(Component component, ScaleInfo scaleInfo);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$SpeechEventListener.class */
    public interface SpeechEventListener {
        boolean onSpeechEvent(Component component, SpeechEvent speechEvent);
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$TouchEventListener.class */
    public interface TouchEventListener {
        boolean onTouchEvent(Component component, TouchEvent touchEvent);
    }

    public Component(Context context) {
        throw new RuntimeException("Stub!");
    }

    public Component(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    public Component(Context context, AttrSet attrSet, String styleName) {
        throw new RuntimeException("Stub!");
    }

    public Component(Context context, AttrSet attrSet, int resId) {
        throw new RuntimeException("Stub!");
    }

    public ComponentHolder findComponentHolderById(int resId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean startDragAndDrop(MimeData data, DragFeedbackProvider shadowProvider) {
        throw new RuntimeException("Stub!");
    }

    public final ComponentParent getComponentParent() {
        throw new RuntimeException("Stub!");
    }

    protected void setEstimateSizeListener(EstimateSizeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addDrawTask(DrawTask task) {
        throw new RuntimeException("Stub!");
    }

    public void addDrawTask(DrawTask task, int layer) {
        throw new RuntimeException("Stub!");
    }

    public void invalidate() {
        throw new RuntimeException("Stub!");
    }

    public void setContentEnable(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean getContentEnable() {
        throw new RuntimeException("Stub!");
    }

    public AnimatorProperty createAnimatorProperty() {
        throw new RuntimeException("Stub!");
    }

    public Context getContext() {
        throw new RuntimeException("Stub!");
    }

    public void setPosition(int coordX, int coordY) {
        throw new RuntimeException("Stub!");
    }

    public void setContentPosition(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void setContentPositionX(float x) {
        throw new RuntimeException("Stub!");
    }

    public void setContentPositionY(float y) {
        throw new RuntimeException("Stub!");
    }

    public float getContentPositionX() {
        throw new RuntimeException("Stub!");
    }

    public float getContentPositionY() {
        throw new RuntimeException("Stub!");
    }

    public float[] getContentPosition() {
        throw new RuntimeException("Stub!");
    }

    public int[] getLocationOnScreen() {
        throw new RuntimeException("Stub!");
    }

    public void setWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setComponentSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public DimensFloat getComponentSize() {
        throw new RuntimeException("Stub!");
    }

    public int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    public void setRotationSensitivity(float value) {
        throw new RuntimeException("Stub!");
    }

    public float getRotationSensitivity() {
        throw new RuntimeException("Stub!");
    }

    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getLeft() {
        throw new RuntimeException("Stub!");
    }

    public void setLeft(int left) {
        throw new RuntimeException("Stub!");
    }

    public int getRight() {
        throw new RuntimeException("Stub!");
    }

    public void setRight(int right) {
        throw new RuntimeException("Stub!");
    }

    public int getTop() {
        throw new RuntimeException("Stub!");
    }

    public void setTop(int top) {
        throw new RuntimeException("Stub!");
    }

    public int getBottom() {
        throw new RuntimeException("Stub!");
    }

    public void setBottom(int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setComponentPosition(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setComponentPosition(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void setHorizontalPosition(int left, int right) {
        throw new RuntimeException("Stub!");
    }

    public void setVerticalPosition(int top, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public int[] getHorizontalPosition() {
        throw new RuntimeException("Stub!");
    }

    public int[] getVerticalPosition() {
        throw new RuntimeException("Stub!");
    }

    public Rect getComponentPosition() {
        throw new RuntimeException("Stub!");
    }

    public void setMarginLeft(int left) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginTop(int top) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginRight(int right) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginBottom(int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginsLeftAndRight(int left, int right) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginsTopAndBottom(int top, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public int getMarginLeft() {
        throw new RuntimeException("Stub!");
    }

    public int getMarginTop() {
        throw new RuntimeException("Stub!");
    }

    public int getMarginRight() {
        throw new RuntimeException("Stub!");
    }

    public int getMarginBottom() {
        throw new RuntimeException("Stub!");
    }

    public int[] getMargins() {
        throw new RuntimeException("Stub!");
    }

    public int[] getMarginsLeftAndRight() {
        throw new RuntimeException("Stub!");
    }

    public int[] getMarginsTopAndBottom() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setForegroundGravity(int foregroundGravity) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getForegroundGravity() {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }

    public ComponentContainer.LayoutConfig getLayoutConfig() {
        throw new RuntimeException("Stub!");
    }

    public void setMinHeight(int minHeight) {
        throw new RuntimeException("Stub!");
    }

    public int getMinHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setMinWidth(int minWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setComponentMinSize(int minWidth, int minHeight) {
        throw new RuntimeException("Stub!");
    }

    public DimensFloat getComponentMinSize() {
        throw new RuntimeException("Stub!");
    }

    public int getScrollValue(int direction) {
        throw new RuntimeException("Stub!");
    }

    public void setVisibility(int visibility) {
        throw new RuntimeException("Stub!");
    }

    public int getVisibility() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    public void announceAccessibility(String text) {
        throw new RuntimeException("Stub!");
    }

    public void setAccessibilityDescription(String description) {
        throw new RuntimeException("Stub!");
    }

    public String getAccessibilityDescription() {
        throw new RuntimeException("Stub!");
    }

    public void notifyAccessibility(int eventType) {
        throw new RuntimeException("Stub!");
    }

    public void setAccessibility(int flag) {
        throw new RuntimeException("Stub!");
    }

    public int getAccessibility() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBoundToWindow() {
        throw new RuntimeException("Stub!");
    }

    public boolean isComponentDisplayed() {
        throw new RuntimeException("Stub!");
    }

    public void setComponentStateChangedListener(ComponentStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ComponentStateChangedListener getComponentStateChangedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setClickedListener(ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ClickedListener getClickedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setDoubleClickedListener(DoubleClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setScaledListener(ScaledListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ScaledListener getScaledListener() {
        throw new RuntimeException("Stub!");
    }

    public void setGesturePriority(GestureType gesturetype, int priority) {
        throw new RuntimeException("Stub!");
    }

    public int getGesturePriority(GestureType gesturetype) {
        throw new RuntimeException("Stub!");
    }

    public void setDraggedListener(int dragMode, DraggedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public DraggedListener getDraggedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setDragAcceptAngle(float degree) {
        throw new RuntimeException("Stub!");
    }

    public float getDragAcceptAngle() {
        throw new RuntimeException("Stub!");
    }

    public boolean onDrag(Component component, DragEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void setFocusChangedListener(FocusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setKeyEventListener(KeyEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public KeyEventListener getKeyEventListener() {
        throw new RuntimeException("Stub!");
    }

    public void setRotationEventListener(RotationEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public RotationEventListener getRotationEventListener() {
        throw new RuntimeException("Stub!");
    }

    public void setLongClickedListener(LongClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setTouchEventListener(TouchEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public TouchEventListener getTouchEventListener() {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutRefreshedListener(LayoutRefreshedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public LayoutRefreshedListener getLayoutRefreshedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setScrolledListener(ScrolledListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addScrolledListener(ScrolledListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeScrolledListener(ScrolledListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setCanAcceptScrollListener(CanAcceptScrollListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean canScroll(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public boolean simulateClick() {
        throw new RuntimeException("Stub!");
    }

    public boolean performScale() {
        throw new RuntimeException("Stub!");
    }

    public boolean simulateDrag() {
        throw new RuntimeException("Stub!");
    }

    public boolean callOnClick() {
        throw new RuntimeException("Stub!");
    }

    public boolean executeLongClick() {
        throw new RuntimeException("Stub!");
    }

    public boolean executeDoubleClick() {
        throw new RuntimeException("Stub!");
    }

    public void setClickable(boolean clickable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isClickable() {
        throw new RuntimeException("Stub!");
    }

    public void setEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public void setClipEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean getClipEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setFocusable(int focusable) {
        throw new RuntimeException("Stub!");
    }

    public void setTouchFocusable(boolean focusable) {
        throw new RuntimeException("Stub!");
    }

    public int getFocusable() {
        throw new RuntimeException("Stub!");
    }

    public void setId(int id) {
        throw new RuntimeException("Stub!");
    }

    public int getId() {
        throw new RuntimeException("Stub!");
    }

    public void setName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public void setLongClickable(boolean longClickable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLongClickOn() {
        throw new RuntimeException("Stub!");
    }

    public void setPadding(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingBottom() {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingEnd() {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingLeft() {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingRight() {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingStart() {
        throw new RuntimeException("Stub!");
    }

    public int getPaddingTop() {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingTop(int top) {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingBottom(int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingLeft(int left) {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingRight(int right) {
        throw new RuntimeException("Stub!");
    }

    public void setHorizontalPadding(int left, int right) {
        throw new RuntimeException("Stub!");
    }

    public void setVerticalPadding(int top, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public int[] getPadding() {
        throw new RuntimeException("Stub!");
    }

    public int[] getHorizontalPadding() {
        throw new RuntimeException("Stub!");
    }

    public int[] getVerticalPadding() {
        throw new RuntimeException("Stub!");
    }

    public void setPressState(boolean pressState) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPressed() {
        throw new RuntimeException("Stub!");
    }

    public void setSelected(boolean selected) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSelected() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasFocus() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocusable() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTouchFocusable() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocused() {
        throw new RuntimeException("Stub!");
    }

    public boolean requestFocus() {
        throw new RuntimeException("Stub!");
    }

    public void clearFocus() {
        throw new RuntimeException("Stub!");
    }

    public void postLayout() {
        throw new RuntimeException("Stub!");
    }

    public void arrange(int left, int top, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void estimateSize(int widthEstimatedConfig, int heightEstimatedConfig) {
        throw new RuntimeException("Stub!");
    }

    protected final void setEstimatedSize(int estimatedWidth, int estimatedHeight) {
        throw new RuntimeException("Stub!");
    }

    public final int getEstimatedWidth() {
        throw new RuntimeException("Stub!");
    }

    public final int getEstimatedHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setBindStateChangedListener(BindStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeBindStateChangedListener(BindStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public CornerMark bindCornerMark() {
        throw new RuntimeException("Stub!");
    }

    public CornerMark getCornerMark() {
        throw new RuntimeException("Stub!");
    }

    public void enableCornerMark(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void setBackground(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setForeground(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getBackgroundElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getForegroundElement() {
        throw new RuntimeException("Stub!");
    }

    public void setFocusBorderEnable(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public void setFocusBorderWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public void setFocusBorderPadding(int padding) {
        throw new RuntimeException("Stub!");
    }

    public void setFocusBorderRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public void setFocusBorderRadius(float[] radii) {
        throw new RuntimeException("Stub!");
    }

    public boolean getFocusBorderEnable() {
        throw new RuntimeException("Stub!");
    }

    public int getFocusBorderWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getFocusBorderPadding() {
        throw new RuntimeException("Stub!");
    }

    public float[] getFocusBorderRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setRotation(float degree) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotX(float pivotX) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotY(float pivotY) {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void setScaleX(float scaleX) {
        throw new RuntimeException("Stub!");
    }

    public void setScaleY(float scaleY) {
        throw new RuntimeException("Stub!");
    }

    public void setScale(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslationX(float translationX) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslationY(float translationY) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslation(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public float getRotation() {
        throw new RuntimeException("Stub!");
    }

    public float getPivotX() {
        throw new RuntimeException("Stub!");
    }

    public float getPivotY() {
        throw new RuntimeException("Stub!");
    }

    public Point getPivot() {
        throw new RuntimeException("Stub!");
    }

    public float getScaleX() {
        throw new RuntimeException("Stub!");
    }

    public float getScaleY() {
        throw new RuntimeException("Stub!");
    }

    public DimensFloat getScale() {
        throw new RuntimeException("Stub!");
    }

    public float getTranslationX() {
        throw new RuntimeException("Stub!");
    }

    public float getTranslationY() {
        throw new RuntimeException("Stub!");
    }

    public DimensFloat getTranslation() {
        throw new RuntimeException("Stub!");
    }

    public ResourceManager getResourceManager() {
        throw new RuntimeException("Stub!");
    }

    public ComponentTreeObserver getComponentTreeObserver() {
        throw new RuntimeException("Stub!");
    }

    public void scrollTo(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public void scrollBy(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public boolean getSelfVisibleRect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean getWindowVisibleRect(Rect visibleRect) {
        throw new RuntimeException("Stub!");
    }

    public void setAlpha(float alpha) {
        throw new RuntimeException("Stub!");
    }

    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }

    public void setComponentDescription(CharSequence componentDescription) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getComponentDescription() {
        throw new RuntimeException("Stub!");
    }

    public Component findComponentById(int id) {
        throw new RuntimeException("Stub!");
    }

    public Component findFocus() {
        throw new RuntimeException("Stub!");
    }

    public Component findNextFocusableComponent(int direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean findRequestNextFocus(int side) {
        throw new RuntimeException("Stub!");
    }

    public void setUserNextFocus(int side, int id) {
        throw new RuntimeException("Stub!");
    }

    public int getUserNextFocus(int side) {
        throw new RuntimeException("Stub!");
    }

    public void subscribeVoiceEvents(VoiceEvent voiceEvent) {
        throw new RuntimeException("Stub!");
    }

    public void unsubscribeVoiceEvents() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeechEventListener(SpeechEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public SpeechEventListener getSpeechEventListener() {
        throw new RuntimeException("Stub!");
    }

    public void setTag(Object tag) {
        throw new RuntimeException("Stub!");
    }

    public Object getTag() {
        throw new RuntimeException("Stub!");
    }

    public void enableScrollBar(int direction, boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScrollBarOn(int direction) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setScrollbarFadingEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean isScrollbarFadingOn() {
        throw new RuntimeException("Stub!");
    }

    public void enableFadeEffect(FadeEffectEnum fadeEffectEnum) {
        throw new RuntimeException("Stub!");
    }

    public void disableFadeEffect(FadeEffectEnum fadeEffectEnum) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFadeEffected(FadeEffectEnum fadeEffectEnum) {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarFadingDelay(int delay) {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarRoundRect(boolean isRoundRect) {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public boolean getScrollbarRoundRect() {
        throw new RuntimeException("Stub!");
    }

    public float getScrollbarRadius() {
        throw new RuntimeException("Stub!");
    }

    public int getScrollbarFadingDelay() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarFadingDuration(int duration) {
        throw new RuntimeException("Stub!");
    }

    public int getScrollbarFadingDuration() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getScrollbarColor() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarBackgroundColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getScrollbarBackgroundColor() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarThickness(int thickness) {
        throw new RuntimeException("Stub!");
    }

    public int getScrollbarThickness() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarStartAngle(float start) {
        throw new RuntimeException("Stub!");
    }

    public float getScrollbarStartAngle() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarSweepAngle(float sweep) {
        throw new RuntimeException("Stub!");
    }

    public float getScrollbarSweepAngle() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollbarOverlapEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public void setVibrationEffectEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isVibrationEffectEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScrollbarOverlapEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRtl() {
        throw new RuntimeException("Stub!");
    }

    public void setCentralScrollMode(boolean centralMode) {
        throw new RuntimeException("Stub!");
    }

    public boolean getCentralScrollMode() {
        throw new RuntimeException("Stub!");
    }

    public void setMode(int mode) {
        throw new RuntimeException("Stub!");
    }

    public int getMode() {
        throw new RuntimeException("Stub!");
    }

    public int getModeResolved() {
        throw new RuntimeException("Stub!");
    }

    public void setCenterZoomFactor(float scaleX, float scaleY) {
        throw new RuntimeException("Stub!");
    }

    public float[] getCenterZoomFactor() {
        throw new RuntimeException("Stub!");
    }

    public void informConfigurationChanged(Configuration config) {
        throw new RuntimeException("Stub!");
    }

    protected void onAttributeConfigChanged(Configuration config) {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutDirection(LayoutDirection layoutDirection) {
        throw new RuntimeException("Stub!");
    }

    public LayoutDirection getLayoutDirection() {
        throw new RuntimeException("Stub!");
    }

    public LayoutDirection getLayoutDirectionResolved() {
        throw new RuntimeException("Stub!");
    }

    public void setFadeEffectBoundaryWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public int getFadeEffectBoundaryWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setFadeEffectColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getFadeEffectColor() {
        throw new RuntimeException("Stub!");
    }

    protected void onRtlChanged(LayoutDirection layoutDirection) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setBoundaryFadeEffectEnable(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean isBoundaryFadeEffectEnable() {
        throw new RuntimeException("Stub!");
    }

    public float getBoundaryFadeEffectLeftRate() {
        throw new RuntimeException("Stub!");
    }

    public float getBoundaryFadeEffectTopRate() {
        throw new RuntimeException("Stub!");
    }

    public float getBoundaryFadeEffectRightRate() {
        throw new RuntimeException("Stub!");
    }

    public float getBoundaryFadeEffectBottomRate() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$DefSpeechEventListener.class */
    public static class DefSpeechEventListener implements SpeechEventListener {
        public DefSpeechEventListener() {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.agp.components.Component.SpeechEventListener
        public boolean onSpeechEvent(Component component, SpeechEvent event) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$DragFeedbackProvider.class */
    public static class DragFeedbackProvider {
        public DragFeedbackProvider(Component component) {
            throw new RuntimeException("Stub!");
        }

        public final Component getComponent() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$DraggedListener.class */
    public interface DraggedListener {
        void onDragDown(Component component, DragInfo dragInfo);

        void onDragStart(Component component, DragInfo dragInfo);

        void onDragUpdate(Component component, DragInfo dragInfo);

        void onDragEnd(Component component, DragInfo dragInfo);

        void onDragCancel(Component component, DragInfo dragInfo);

        default boolean onDragPreAccept(Component component, int dragDirection) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$EstimateSpec.class */
    public static class EstimateSpec {
        public static final int ESTIMATED_STATE_BIT_MASK = -16777216;
        public static final int NOT_EXCEED = Integer.MIN_VALUE;
        public static final int PRECISE = 1073741824;
        public static final int UNCONSTRAINT = 0;

        public EstimateSpec() {
            throw new RuntimeException("Stub!");
        }

        public static int getSizeWithMode(int size, int mode) {
            throw new RuntimeException("Stub!");
        }

        public static int getMode(int estimateSpec) {
            throw new RuntimeException("Stub!");
        }

        public static int getSize(int estimateSpec) {
            throw new RuntimeException("Stub!");
        }

        public static int getChildSizeWithMode(int size, int esimatedConfig, int childEstimatedConfig) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$FadeEffectEnum.class */
    public enum FadeEffectEnum {
        FADEEFFECT_NULL,
        FADEEFFECT_SCROLLBAR,
        FADEEFFECT_BOUNDARY;

        protected int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static FadeEffectEnum getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }

    @Deprecated
    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$MeasureSpec.class */
    public static class MeasureSpec {
        @Deprecated
        public static final int ESTIMATED_STATE_BIT_MASK = -16777216;
        @Deprecated
        public static final int NOT_EXCEED = Integer.MIN_VALUE;
        @Deprecated
        public static final int PRECISE = 1073741824;
        @Deprecated
        public static final int UNCONSTRAINT = 0;

        @Deprecated
        public MeasureSpec() {
            throw new RuntimeException("Stub!");
        }

        @Deprecated
        public static int getMeasureSpec(int size, int mode) {
            throw new RuntimeException("Stub!");
        }

        @Deprecated
        public static int getMode(int measureSpec) {
            throw new RuntimeException("Stub!");
        }

        @Deprecated
        public static int getSize(int measureSpec) {
            throw new RuntimeException("Stub!");
        }

        @Deprecated
        public static int getSizeAndConfig(int size, int esimatedConfig, int childEstimatedConfig) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$ScrolledListener.class */
    public interface ScrolledListener {
        void onContentScrolled(Component component, int i, int i2, int i3, int i4);

        default void scrolledStageUpdate(Component component, int newStage) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/Component$VoiceEvent.class */
    public static class VoiceEvent {
        public VoiceEvent(String speech, int scene, boolean isUseBadge) {
            throw new RuntimeException("Stub!");
        }

        public VoiceEvent(String speech) {
            throw new RuntimeException("Stub!");
        }

        public void addSynonyms(String synonyms) {
            throw new RuntimeException("Stub!");
        }

        public void setScene(int scene) {
            throw new RuntimeException("Stub!");
        }

        public void setBadge(boolean enable) {
            throw new RuntimeException("Stub!");
        }

        public void addBadges(String from, String to) {
            throw new RuntimeException("Stub!");
        }

        public String getSpeech() {
            throw new RuntimeException("Stub!");
        }

        public List<String> getSynonyms() {
            throw new RuntimeException("Stub!");
        }

        public List<String[]> getBadge() {
            throw new RuntimeException("Stub!");
        }

        public int getScene() {
            throw new RuntimeException("Stub!");
        }

        public void sendDataToComponent(Component component) {
            throw new RuntimeException("Stub!");
        }
    }
}
