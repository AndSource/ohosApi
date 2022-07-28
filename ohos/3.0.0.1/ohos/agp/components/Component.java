/*      */ package ohos.agp.components;
/*      */ 
/*      */ import java.util.List;
/*      */ import ohos.agp.animation.AnimatorProperty;
/*      */ import ohos.agp.components.element.Element;
/*      */ import ohos.agp.components.element.ShadowElement;
/*      */ import ohos.agp.components.events.MousePointerStyle;
/*      */ import ohos.agp.render.Canvas;
/*      */ import ohos.agp.utils.Color;
/*      */ import ohos.agp.utils.Contour;
/*      */ import ohos.agp.utils.DimensFloat;
/*      */ import ohos.agp.utils.Matrix;
/*      */ import ohos.agp.utils.MimeData;
/*      */ import ohos.agp.utils.Point;
/*      */ import ohos.agp.utils.Rect;
/*      */ import ohos.app.Context;
/*      */ import ohos.global.configuration.Configuration;
/*      */ import ohos.global.resource.ResourceManager;
/*      */ import ohos.multimodalinput.event.KeyEvent;
/*      */ import ohos.multimodalinput.event.MouseEvent;
/*      */ import ohos.multimodalinput.event.MultimodalEvent;
/*      */ import ohos.multimodalinput.event.RotationEvent;
/*      */ import ohos.multimodalinput.event.SpeechEvent;
/*      */ import ohos.multimodalinput.event.TouchEvent;
/*      */ import ohos.utils.PlainArray;
/*      */ import ohos.utils.Sequenceable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Component
/*      */ {
/*      */   public static final int ACCESSIBILITY_ADAPTABLE = 0;
/*      */   public static final int ACCESSIBILITY_DISABLE = 1;
/*      */   public static final int ACCESSIBILITY_ENABLE = 2;
/*      */   public static final int AXIS_X = 0;
/*      */   public static final int AXIS_Y = 1;
/*      */   
/*      */   public Component(Context context) {
/*   52 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Component(Context context, AttrSet attrSet) {
/*   62 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Component(Context context, AttrSet attrSet, String styleName) {
/*   73 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Component(Context context, AttrSet attrSet, int resId) {
/*   85 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ComponentHolder findComponentHolderById(int resId) {
/*   95 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void draw(Canvas canvas) {
/*  106 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean startDragAndDrop(MimeData data, DragFeedbackProvider shadowProvider) {
/*  122 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final ComponentParent getComponentParent() {
/*  134 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void setEstimateSizeListener(EstimateSizeListener listener) {
/*  144 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addDrawTask(DrawTask task) {
/*  157 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addDrawTask(DrawTask task, int layer) {
/*  170 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void invalidate() {
/*  180 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContentEnable(boolean enable) {
/*  189 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getContentEnable() {
/*  198 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusedEffect(boolean enabled) {
/*  212 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFocusedEffect() {
/*  223 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AnimatorProperty createAnimatorProperty() {
/*  237 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Context getContext() {
/*  245 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPosition(int coordX, int coordY) {
/*  255 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPositionX(int coordX) {
/*  264 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPositionY(int coordY) {
/*  273 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContentPosition(float x, float y) {
/*  289 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContentPositionX(float x) {
/*  306 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContentPositionY(float y) {
/*  323 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getContentPositionX() {
/*  334 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getContentPositionY() {
/*  345 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float[] getContentPosition() {
/*  357 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getLocationOnScreen() {
/*  365 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setWidth(int width) {
/*  377 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentSize(int width, int height) {
/*  389 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DimensFloat getComponentSize() {
/*  398 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getWidth() {
/*  410 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setHeight(int height) {
/*  422 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRotationSensitivity(float value) {
/*  434 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getRotationSensitivity() {
/*  443 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getHeight() {
/*  455 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getLeft() {
/*  466 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLeft(int left) {
/*  477 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getRight() {
/*  488 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRight(int right) {
/*  499 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getTop() {
/*  510 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTop(int top) {
/*  521 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getBottom() {
/*  532 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBottom(int bottom) {
/*  543 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentPosition(int left, int top, int right, int bottom) {
/*  560 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentPosition(Rect rect) {
/*  574 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setHorizontalPosition(int left, int right) {
/*  589 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVerticalPosition(int top, int bottom) {
/*  604 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getHorizontalPosition() {
/*  613 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getVerticalPosition() {
/*  622 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rect getComponentPosition() {
/*  631 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginLeft(int left) {
/*  640 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginTop(int top) {
/*  649 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginRight(int right) {
/*  658 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginBottom(int bottom) {
/*  667 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginsLeftAndRight(int left, int right) {
/*  677 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMarginsTopAndBottom(int top, int bottom) {
/*  687 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMarginLeft() {
/*  696 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMarginTop() {
/*  705 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMarginRight() {
/*  714 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMarginBottom() {
/*  723 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getMargins() {
/*  732 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getMarginsLeftAndRight() {
/*  741 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getMarginsTopAndBottom() {
/*  750 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setForegroundGravity(int foregroundGravity) {
/*  761 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int getForegroundGravity() {
/*  773 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutConfig(ComponentContainer.LayoutConfig config) {
/*  796 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ComponentContainer.LayoutConfig getLayoutConfig() {
/*  814 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMinHeight(int minHeight) {
/*  827 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMinHeight() {
/*  839 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMinWidth(int minWidth) {
/*  852 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMinWidth() {
/*  864 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentMinSize(int minWidth, int minHeight) {
/*  874 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DimensFloat getComponentMinSize() {
/*  883 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollValue(int direction) {
/*  895 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVisibility(int visibility) {
/*  909 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getVisibility() {
/*  926 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void release() {
/*  932 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void announceAccessibility(String text) {
/*  941 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAccessibilityDescription(String description) {
/*  950 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAccessibilityDescription() {
/*  959 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void notifyAccessibility(int eventType) {
/*  980 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAccessibility(int flag) {
/*  990 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAccessibility() {
/*  999 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBoundToWindow() {
/* 1012 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isComponentDisplayed() {
/* 1030 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentStateChangedListener(ComponentStateChangedListener listener) {
/* 1039 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ComponentStateChangedListener getComponentStateChangedListener() {
/* 1048 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClickedListener(ClickedListener listener) {
/* 1059 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClickedListener getClickedListener() {
/* 1068 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEditEventListener(EditEventListener listener) {
/* 1078 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public EditEventListener getEditEventListener() {
/* 1088 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDoubleClickedListener(DoubleClickedListener listener) {
/* 1100 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScaledListener(ScaledListener listener) {
/* 1110 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ScaledListener getScaledListener() {
/* 1119 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGesturePriority(GestureType gestureType, int priority) {
/* 1129 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getGesturePriority(GestureType gestureType) {
/* 1139 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOnDragListener(OnDragListener listener) {
/* 1151 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDraggedListener(int dragMode, DraggedListener listener) {
/* 1166 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DraggedListener getDraggedListener() {
/* 1175 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDragAcceptAngle(float degree) {
/* 1198 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getDragAcceptAngle() {
/* 1208 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean onDrag(Component component, DragEvent event) {
/* 1218 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusChangedListener(FocusChangedListener listener) {
/* 1228 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setKeyEventListener(KeyEventListener listener) {
/* 1238 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUnconsumedKeyEventListener(UnconsumedKeyEventListener listener) {
/* 1249 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMouseEventListener(MouseEventListener listener) {
/* 1260 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MouseEventListener getMouseEventListener() {
/* 1269 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setForwardHoverListener(ForwardHoverListener listener) {
/* 1278 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ForwardHoverListener getForwardHoverListener() {
/* 1287 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setHoverEventListener(HoverEventListener listener) {
/* 1298 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HoverEventListener getHoverEventListener() {
/* 1307 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMousePointerStyleListener(MousePointerStyleListener listener) {
/* 1316 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MousePointerStyleListener getMousePointerStyleListener() {
/* 1325 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public KeyEventListener getKeyEventListener() {
/* 1334 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRotationEventListener(RotationEventListener listener) {
/* 1344 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RotationEventListener getRotationEventListener() {
/* 1353 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLongClickedListener(LongClickedListener listener) {
/* 1363 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTouchEventListener(TouchEventListener listener) {
/* 1373 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setForwardTouchListener(ForwardTouchListener listener) {
/* 1382 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ForwardTouchListener getForwardTouchListener() {
/* 1391 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TouchEventListener getTouchEventListener() {
/* 1400 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void requestForceForwardTouchEvent(boolean forceForward) {
/* 1410 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutRefreshedListener(LayoutRefreshedListener listener) {
/* 1419 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutRefreshedListener getLayoutRefreshedListener() {
/* 1428 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContourRefreshedListener(ContourRefreshedListener listener) {
/* 1437 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ContourRefreshedListener getContourRefreshedListener() {
/* 1446 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContour(Contour contour) {
/* 1455 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Contour getContour() {
/* 1464 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClipToContourEnabled(boolean enable) {
/* 1476 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isClipToContourEnabled() {
/* 1486 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void refreshContour() {
/* 1496 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrolledListener(ScrolledListener listener) {
/* 1506 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addScrolledListener(ScrolledListener listener) {
/* 1519 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeScrolledListener(ScrolledListener listener) {
/* 1529 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canScroll(int orientation) {
/* 1541 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollState() {
/* 1549 */     throw new RuntimeException("Stub!");
/*      */   } public void setCanAcceptScrollListener(CanAcceptScrollListener listener) {
/* 1551 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean simulateClick() {
/* 1564 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean performScale() {
/* 1576 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean simulateDrag() {
/* 1589 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean callOnClick() {
/* 1601 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean executeLongClick() {
/* 1614 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean executeDoubleClick() {
/* 1628 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClickable(boolean clickable) {
/* 1642 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isClickable() {
/* 1653 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEnabled(boolean enabled) {
/* 1664 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClipEnabled(boolean enabled) {
/* 1672 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getClipEnabled() {
/* 1681 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isEnabled() {
/* 1689 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusable(int focusable) {
/* 1708 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void showFocusBorder() {
/* 1719 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void hideFocusBorder() {
/* 1730 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTouchFocusable(boolean focusable) {
/* 1741 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFocusable() {
/* 1752 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setId(int id) {
/* 1762 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getId() {
/* 1772 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setName(String name) {
/* 1782 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getName() {
/* 1792 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLongClickable(boolean longClickable) {
/* 1804 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLongClickOn() {
/* 1817 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void playSound(int soundId) {
/* 1827 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSoundEnable(boolean enable) {
/* 1837 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSoundEnable() {
/* 1846 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPadding(int left, int top, int right, int bottom) {
/* 1859 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPaddingRelative(int start, int top, int end, int bottom) {
/* 1872 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingBottom() {
/* 1880 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingEnd() {
/* 1888 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingLeft() {
/* 1896 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingRight() {
/* 1904 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingStart() {
/* 1912 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getPaddingTop() {
/* 1920 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPaddingTop(int top) {
/* 1929 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPaddingBottom(int bottom) {
/* 1938 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPaddingLeft(int left) {
/* 1947 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPaddingRight(int right) {
/* 1956 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setHorizontalPadding(int left, int right) {
/* 1966 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVerticalPadding(int top, int bottom) {
/* 1976 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getPadding() {
/* 1985 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getHorizontalPadding() {
/* 1994 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getVerticalPadding() {
/* 2003 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPressState(boolean pressState) {
/* 2018 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPressed() {
/* 2029 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSelected(boolean selected) {
/* 2044 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSelected() {
/* 2052 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFocus() {
/* 2060 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFocusable() {
/* 2068 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isTouchFocusable() {
/* 2077 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFocused() {
/* 2085 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean requestFocus() {
/* 2101 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearFocus() {
/* 2107 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void postLayout() {
/* 2114 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void arrange(int left, int top, int width, int height) {
/* 2126 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void estimateSize(int widthEstimatedConfig, int heightEstimatedConfig) {
/* 2138 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected final void setEstimatedSize(int estimatedWidth, int estimatedHeight) {
/* 2148 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getEstimatedWidth() {
/* 2157 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getEstimatedHeight() {
/* 2166 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBindStateChangedListener(BindStateChangedListener listener) {
/* 2186 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeBindStateChangedListener(BindStateChangedListener listener) {
/* 2206 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CornerMark bindCornerMark() {
/* 2216 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CornerMark getCornerMark() {
/* 2225 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void enableCornerMark(boolean enable) {
/* 2235 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBackground(Element element) {
/* 2243 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setForeground(Element element) {
/* 2251 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setShadowStyle(ShadowSize size, ShadowMode mode, ShadowDevice device) {
/* 2262 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Element getBackgroundElement() {
/* 2270 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Element getForegroundElement() {
/* 2278 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusBorderEnable(boolean enabled) {
/* 2288 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusBorderWidth(int width) {
/* 2299 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusBorderPadding(int padding) {
/* 2310 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusBorderRadius(float radius) {
/* 2322 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFocusBorderRadius(float[] radii) {
/* 2335 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getFocusBorderEnable() {
/* 2345 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFocusBorderWidth() {
/* 2356 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFocusBorderPadding() {
/* 2367 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float[] getFocusBorderRadius() {
/* 2378 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRotation(float degree) {
/* 2390 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPivotX(float pivotX) {
/* 2402 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPivotY(float pivotY) {
/* 2414 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPivot(float x, float y) {
/* 2424 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPivot(Point point) {
/* 2433 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScaleX(float scaleX) {
/* 2444 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScaleY(float scaleY) {
/* 2455 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScale(float x, float y) {
/* 2467 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTranslationX(float translationX) {
/* 2483 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTranslationY(float translationY) {
/* 2499 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTranslationZ(float translationZ) {
/* 2509 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTranslation(float x, float y) {
/* 2520 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getRotation() {
/* 2529 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getPivotX() {
/* 2543 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getPivotY() {
/* 2554 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Point getPivot() {
/* 2563 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScaleX() {
/* 2574 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScaleY() {
/* 2585 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DimensFloat getScale() {
/* 2596 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getTranslationX() {
/* 2607 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getTranslationY() {
/* 2618 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getTranslationZ() {
/* 2628 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DimensFloat getTranslation() {
/* 2639 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAltitude(float altitude) {
/* 2649 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getAltitude() {
/* 2659 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setShadowColor(Color color) {
/* 2668 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color getShadowColor() {
/* 2677 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ResourceManager getResourceManager() {
/* 2686 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ComponentTreeObserver getComponentTreeObserver() {
/* 2695 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void scrollTo(int x, int y) {
/* 2704 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void scrollBy(int x, int y) {
/* 2714 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getSelfVisibleRect(Rect rect) {
/* 2724 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getVisibleRectOnScreen(Rect rect, int[] position) {
/* 2746 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Matrix getMatrix() {
/* 2756 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isIdentityMatrix() {
/* 2766 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getWindowVisibleRect(Rect visibleRect) {
/* 2779 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAlpha(float alpha) {
/* 2789 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getAlpha() {
/* 2800 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComponentDescription(CharSequence componentDescription) {
/* 2809 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CharSequence getComponentDescription() {
/* 2818 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Component> T findComponentById(int id) {
/* 2830 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Component findFocus() {
/* 2845 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Component findNextFocusableComponent(int direction) {
/* 2863 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean findRequestNextFocus(int side) {
/* 2880 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUserNextFocus(int side, int id) {
/* 2894 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getUserNextFocus(int side) {
/* 2905 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void subscribeVoiceEvents(VoiceEvent voiceEvent) {
/* 2914 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void unsubscribeVoiceEvents() {
/* 2920 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSpeechEventListener(SpeechEventListener listener) {
/* 2929 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SpeechEventListener getSpeechEventListener() {
/* 2938 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTag(Object tag) {
/* 2947 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object getTag() {
/* 2956 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void enableScrollBar(int direction, boolean enabled) {
/* 2970 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isScrollBarOn(int direction) {
/* 2982 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setScrollbarFadingEnabled(boolean enabled) {
/* 2997 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean isScrollbarFadingOn() {
/* 3012 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void enableFadeEffect(FadeEffectEnum fadeEffectEnum) {
/* 3021 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void disableFadeEffect(FadeEffectEnum fadeEffectEnum) {
/* 3030 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFadeEffected(FadeEffectEnum fadeEffectEnum) {
/* 3040 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarFadingDelay(int delay) {
/* 3051 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarRoundRect(boolean isRoundRect) {
/* 3061 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarRadius(float radius) {
/* 3070 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getScrollbarRoundRect() {
/* 3080 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScrollbarRadius() {
/* 3089 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollbarFadingDelay() {
/* 3101 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarFadingDuration(int duration) {
/* 3112 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollbarFadingDuration() {
/* 3123 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarColor(Color color) {
/* 3133 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color getScrollbarColor() {
/* 3143 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarBackgroundColor(Color color) {
/* 3153 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color getScrollbarBackgroundColor() {
/* 3163 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarThickness(int thickness) {
/* 3173 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollbarThickness() {
/* 3183 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarStartAngle(float start) {
/* 3193 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScrollbarStartAngle() {
/* 3203 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarSweepAngle(float sweep) {
/* 3213 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getScrollbarSweepAngle() {
/* 3223 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollbarOverlapEnabled(boolean enabled) {
/* 3234 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVibrationEffectEnabled(boolean enabled) {
/* 3243 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isVibrationEffectEnabled() {
/* 3252 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isScrollbarOverlapEnabled() {
/* 3262 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isRtl() {
/* 3274 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCentralScrollMode(boolean centralMode) {
/* 3284 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getCentralScrollMode() {
/* 3293 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMode(int mode) {
/* 3309 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMode() {
/* 3320 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScrollBarMode(int scrollBarMode) {
/* 3336 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getScrollBarMode() {
/* 3347 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getModeResolved() {
/* 3358 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCenterZoomFactor(float scaleX, float scaleY) {
/* 3371 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float[] getCenterZoomFactor() {
/* 3380 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void informConfigurationChanged(Configuration config) {
/* 3391 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void onAttributeConfigChanged(Configuration config) {
/* 3401 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLayoutDirection(LayoutDirection layoutDirection) {
/* 3413 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutDirection getLayoutDirection() {
/* 3425 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LayoutDirection getLayoutDirectionResolved() {
/* 3438 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFadeEffectBoundaryWidth(int width) {
/* 3448 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFadeEffectBoundaryWidth() {
/* 3458 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFadeEffectColor(Color color) {
/* 3468 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Color getFadeEffectColor() {
/* 3478 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void onRtlChanged(LayoutDirection layoutDirection) {
/* 3487 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setBoundaryFadeEffectEnable(boolean enable) {
/* 3500 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean isBoundaryFadeEffectEnable() {
/* 3511 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getBoundaryFadeEffectLeftRate() {
/* 3522 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getBoundaryFadeEffectTopRate() {
/* 3533 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getBoundaryFadeEffectRightRate() {
/* 3544 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getBoundaryFadeEffectBottomRate() {
/* 3555 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void enableSaveState(boolean isEnabled) {
/* 3565 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSaveStateEnabled() {
/* 3575 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Sequenceable onSaveState() {
/* 3586 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void onRestoreState(Sequenceable state) {
/* 3597 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void dispatchSaveState(PlainArray<Sequenceable> stateContainer) {
/* 3606 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void dispatchRestoreState(PlainArray<Sequenceable> stateContainer) {
/* 3615 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void saveComponentTreeState(PlainArray<Sequenceable> stateContainer) {
/* 3624 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void restoreComponentTreeState(PlainArray<Sequenceable> stateContainer) {
/* 3633 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTransitionSymbol(String symbol) {
/* 3642 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTransitionSymbol() {
/* 3651 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getBaseLine() {
/* 3661 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasOverlaps() {
/* 3670 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 3721 */   public static final ContourRefreshedListener CONTOUR_BACKGROUND = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 3730 */   public static final ContourRefreshedListener CONTOUR_BORDER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 3739 */   public static final ContourRefreshedListener CONTOUR_PADDING_BORDER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final float DEFAULT_SCALE = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_DOWN = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_HORIZONTAL = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_HORIZONTAL_VERTICAL = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_LEFT = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_RIGHT = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_UP = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DRAG_VERTICAL = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_ACCESSIBILITY_FOCUSED = 32768;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_ACCESSIBILITY_FOCUSED_CLEAR = 65536;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_CLICKED = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_FOCUSED = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_LONG_CLICKED = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_SCROLLED = 4096;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_SELECTED = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_COMPONENT_TEXT_UPDATE = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_NOTICE = 16384;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_NOTIFICATION_STATE_UPDATE = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_TOAST_SHOW = 33554432;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int EVENT_TYPE_WINDOW_STATE_UPDATE = 32;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_ADAPTABLE = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_DISABLE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_ENABLE = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_NEXT = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_PREVIOUS = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_SIDE_BOTTOM = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_SIDE_LEFT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_SIDE_RIGHT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int FOCUS_SIDE_TOP = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int HIDE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int HORIZONTAL = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int ID_DEFAULT = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INHERITED_MODE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INVISIBLE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int OVAL_MODE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int OVAL_SCROLL_BAR_MODE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static final int POSITION_X_INDEX = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static final int POSITION_Y_INDEX = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int RECT_MODE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int RECT_SCROLL_BAR_MODE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SCROLL_AUTO_STAGE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SCROLL_IDLE_STAGE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SCROLL_NORMAL_STAGE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int UNSPECIFIED_SCROLL_BAR_MODE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int VERTICAL = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int VISIBLE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Element mBackgroundElement;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Canvas mCanvasForTaskOverContent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Canvas mCanvasForTaskUnderContent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ComponentParent mComponentParent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Context mContext;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected DrawTask mDrawTaskOverContent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected DrawTask mDrawTaskUnderContent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected EstimateSizeListener mEstimateSizeListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Element mForegroundElement;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ForwardHoverListener mForwardHoverListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected HoverEventListener mHoverEventListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected KeyEventListener mKeyEventListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected MouseEventListener mMouseEventListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float[] mPosition;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected RotationEventListener mRotationEventListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ShadowElement mShadowElement;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected UnconsumedKeyEventListener mUnconsumedKeyEventListener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface BindStateChangedListener
/*      */   {
/*      */     void onComponentBoundToWindow(Component param1Component);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onComponentUnboundFromWindow(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface CanAcceptScrollListener
/*      */   {
/*      */     boolean canAcceptScroll(Component param1Component, int param1Int, boolean param1Boolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ClickedListener
/*      */   {
/*      */     void onClick(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ComponentStateChangedListener
/*      */   {
/*      */     void onComponentStateChanged(Component param1Component, int param1Int);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ContourRefreshedListener
/*      */   {
/*      */     void onContourRefreshed(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class DefSpeechEventListener
/*      */     implements SpeechEventListener
/*      */   {
/*      */     public DefSpeechEventListener() {
/* 4290 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean onSpeechEvent(Component component, SpeechEvent event) {
/* 4302 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface DoubleClickedListener
/*      */   {
/*      */     void onDoubleClick(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class DragFeedbackProvider
/*      */   {
/*      */     public DragFeedbackProvider(Component component) {
/* 4341 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final Component getComponent() {
/* 4349 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface DraggedListener
/*      */   {
/*      */     void onDragDown(Component param1Component, DragInfo param1DragInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onDragStart(Component param1Component, DragInfo param1DragInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onDragUpdate(Component param1Component, DragInfo param1DragInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onDragEnd(Component param1Component, DragInfo param1DragInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onDragCancel(Component param1Component, DragInfo param1DragInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onDragPreAccept(Component component, int dragDirection) {
/* 4421 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface DrawTask
/*      */   {
/*      */     public static final int BETWEEN_BACKGROUND_AND_CONTENT = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BETWEEN_CONTENT_AND_FOREGROUND = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onDraw(Component param1Component, Canvas param1Canvas);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface EditEventListener
/*      */   {
/*      */     default boolean onCopy() {
/* 4480 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onPaste() {
/* 4489 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onCut() {
/* 4498 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onUndo() {
/* 4507 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onSelectAll() {
/* 4516 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onDelete() {
/* 4524 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default boolean onForwardDelete() {
/* 4533 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface EstimateSizeListener
/*      */   {
/*      */     boolean onEstimateSize(int param1Int1, int param1Int2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class EstimateSpec
/*      */   {
/*      */     public static final int ESTIMATED_STATE_BIT_MASK = -16777216;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NOT_EXCEED = -2147483648;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PRECISE = 1073741824;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNCONSTRAINT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public EstimateSpec() {
/* 4572 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static int getSizeWithMode(int size, int mode) {
/* 4585 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static int getMode(int estimateSpec) {
/* 4595 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static int getSize(int estimateSpec) {
/* 4605 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static int getChildSizeWithMode(int size, int estimatedConfig, int childEstimatedConfig) {
/* 4617 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum FadeEffectEnum
/*      */   {
/* 4655 */     FADEEFFECT_NULL,
/*      */ 
/*      */     
/* 4658 */     FADEEFFECT_SCROLLBAR,
/*      */ 
/*      */     
/* 4661 */     FADEEFFECT_BOUNDARY;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected int getValue() {
/* 4669 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static FadeEffectEnum getByInt(int enumInt) {
/* 4678 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface FocusChangedListener
/*      */   {
/*      */     void onFocusChange(Component param1Component, boolean param1Boolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ForwardHoverListener
/*      */   {
/*      */     boolean onForwardHover(Component param1Component, MultimodalEvent param1MultimodalEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ForwardTouchListener
/*      */   {
/*      */     boolean onForwardTouch(Component param1Component, TouchEvent param1TouchEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum GestureType
/*      */   {
/* 4751 */     TAP,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4756 */     LONG_PRESS,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4761 */     HORZ_VERT_DRAG,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4766 */     HORIZONTAL_DRAG,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4771 */     VERTICAL_DRAG,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4776 */     SCALE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4781 */     DOUBLE_TAP;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface HoverEventListener
/*      */   {
/*      */     boolean onHoverEvent(Component param1Component, MultimodalEvent param1MultimodalEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface KeyEventListener
/*      */   {
/*      */     boolean onKeyEvent(Component param1Component, KeyEvent param1KeyEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum LayoutDirection
/*      */   {
/* 4847 */     LTR,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4852 */     RTL,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4857 */     INHERIT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4862 */     LOCALE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface LayoutRefreshedListener
/*      */   {
/*      */     void onRefreshed(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface LongClickedListener
/*      */   {
/*      */     void onLongClicked(Component param1Component);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static class MeasureSpec
/*      */   {
/*      */     @Deprecated
/*      */     public static final int ESTIMATED_STATE_BIT_MASK = -16777216;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int NOT_EXCEED = -2147483648;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int PRECISE = 1073741824;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int UNCONSTRAINT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public MeasureSpec() {
/* 4916 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static int getMeasureSpec(int size, int mode) {
/* 4930 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static int getMode(int measureSpec) {
/* 4941 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static int getSize(int measureSpec) {
/* 4951 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static int getSizeAndConfig(int size, int estimatedConfig, int childEstimatedConfig) {
/* 4965 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface MouseEventListener
/*      */   {
/*      */     boolean onMouseEvent(Component param1Component, MouseEvent param1MouseEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface MousePointerStyleListener
/*      */   {
/*      */     MousePointerStyle onUpdatePointerStyle(Component param1Component, MouseEvent param1MouseEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface OnDragListener
/*      */   {
/*      */     boolean onDrag(Component param1Component, DragEvent param1DragEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface RotationEventListener
/*      */   {
/*      */     boolean onRotationEvent(Component param1Component, RotationEvent param1RotationEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ScaledListener
/*      */   {
/*      */     void onScaleStart(Component param1Component, ScaleInfo param1ScaleInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onScaleUpdate(Component param1Component, ScaleInfo param1ScaleInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void onScaleEnd(Component param1Component, ScaleInfo param1ScaleInfo);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface ScrolledListener
/*      */   {
/*      */     void onContentScrolled(Component param1Component, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     default void scrolledStageUpdate(Component component, int newStage) {
/* 5156 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum ShadowDevice
/*      */   {
/* 5171 */     SHADOW_DEVICE_DEFAULT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5176 */     SHADOW_DEVICE_PHONE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5181 */     SHADOW_DEVICE_CAR,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5186 */     SHADOW_DEVICE_TV;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getDevice() {
/* 5194 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum ShadowMode
/*      */   {
/* 5209 */     SHADOW_MODE_DEFAULT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5214 */     SHADOW_MODE_LIGHT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5219 */     SHADOW_MODE_DARK,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5224 */     SHADOW_MODE_TRANSLUCENT;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMode() {
/* 5232 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum ShadowSize
/*      */   {
/* 5247 */     SHADOW_SIZE_OFF,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5252 */     SHADOW_SIZE_XS,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5257 */     SHADOW_SIZE_S,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5262 */     SHADOW_SIZE_M,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5267 */     SHADOW_SIZE_L,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5272 */     FLOATING_SHADOW_SIZE_S,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5277 */     FLOATING_SHADOW_SIZE_M,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5282 */     FLOATING_SHADOW_SIZE_L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getSize() {
/* 5290 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface SpeechEventListener
/*      */   {
/*      */     boolean onSpeechEvent(Component param1Component, SpeechEvent param1SpeechEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface TouchEventListener
/*      */   {
/*      */     boolean onTouchEvent(Component param1Component, TouchEvent param1TouchEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface UnconsumedKeyEventListener
/*      */   {
/*      */     boolean onUnconsumedKeyEvent(Component param1Component, KeyEvent param1KeyEvent);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class VoiceEvent
/*      */   {
/*      */     public VoiceEvent(String speech, int scene, boolean isUseBadge) {
/* 5376 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public VoiceEvent(String speech) {
/* 5384 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addSynonyms(String synonyms) {
/* 5392 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setScene(int scene) {
/* 5400 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setBadge(boolean enable) {
/* 5409 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addBadges(String from, String to) {
/* 5418 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getSpeech() {
/* 5426 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<String> getSynonyms() {
/* 5434 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<String[]> getBadge() {
/* 5442 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getScene() {
/* 5450 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void sendDataToComponent(Component component) {
/* 5458 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/Component.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */