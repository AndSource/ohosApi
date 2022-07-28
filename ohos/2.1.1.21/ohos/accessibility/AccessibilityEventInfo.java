/*     */ package ohos.accessibility;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AccessibilityEventInfo
/*     */ {
/*     */   public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED_EVENT = 32768;
/*     */   public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED_EVENT = 65536;
/*     */   public static final int TYPE_VIEW_CLICKED_EVENT = 1;
/*     */   public static final int TYPE_VIEW_FOCUSED_EVENT = 8;
/*     */   public static final int TYPE_VIEW_HOVER_ENTER_EVENT = 128;
/*     */   public static final int TYPE_VIEW_HOVER_EXIT_EVENT = 256;
/*     */   public static final int TYPE_VIEW_LONG_CLICKED_EVENT = 2;
/*     */   public static final int TYPE_VIEW_SCROLLED_EVENT = 4096;
/*     */   public static final int TYPE_VIEW_SELECTED_EVENT = 4;
/*     */   public static final int TYPE_VIEW_TEXT_CHANGED_EVENT = 16;
/*     */   public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED_EVENT = 8192;
/*     */   public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = 128;
/*     */   public static final int WINDOWS_CHANGE_ACTIVE = 32;
/*     */   public static final int WINDOWS_CHANGE_ADDED = 1;
/*     */   public static final int WINDOWS_CHANGE_BOUNDS = 8;
/*     */   public static final int WINDOWS_CHANGE_CHILDREN = 512;
/*     */   public static final int WINDOWS_CHANGE_FOCUSED = 64;
/*     */   public static final int WINDOWS_CHANGE_LAYER = 16;
/*     */   public static final int WINDOWS_CHANGE_PARENT = 256;
/*     */   public static final int WINDOWS_CHANGE_PIP = 1024;
/*     */   public static final int WINDOWS_CHANGE_REMOVED = 2;
/*     */   public static final int WINDOWS_CHANGE_TITLE = 4;
/*     */   
/*     */   public AccessibilityEventInfo() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AccessibilityEventInfo(int eventType) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AccessibilityEventInfo(AccessibilityEventInfo eventInfo) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTriggerAction() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWindowChangeTypes() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAccessibilityEventType() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTextMoveStep() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getBundleName() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getViewId() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addRecord(AccessibilityEventInfo eventInfo) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<AccessibilityEventInfo> getRecords() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTriggerAction(int action) {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextMoveStep(int moveStep) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBundleName(CharSequence bundleName) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAccessibilityEventType(int accessibilityEventType) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindowChangeTypes(int changeTypes) {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setViewId(int viewId) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getClassName() {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClassName(CharSequence className) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getDescription() {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescription(CharSequence description) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCount() {
/* 248 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCount(int count) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPresentIndex() {
/* 266 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPresentIndex(int presentIndex) {
/* 275 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStartIndex() {
/* 284 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStartIndex(int startIndex) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEndIndex() {
/* 302 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEndIndex(int endIndex) {
/* 311 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getLastContent() {
/* 320 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLastContent(CharSequence lastContent) {
/* 329 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<CharSequence> getContentList() {
/* 338 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addContent(CharSequence in) {
/* 347 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/accessibility/AccessibilityEventInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */