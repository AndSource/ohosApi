/*     */ package ohos.agp.components;
/*     */ 
/*     */ import ohos.app.Context;
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
/*     */ public class DependentLayout
/*     */   extends ComponentContainer
/*     */ {
/*     */   public DependentLayout(Context context) {
/*  40 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DependentLayout(Context context, AttrSet attrSet) {
/*  50 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DependentLayout(Context context, AttrSet attrSet, String styleName) {
/*  61 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIgnoreAlignment() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIgnoreAlignment(int componentId) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIgnoreGravity() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIgnoreGravity(int componentId) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAlignment() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAlignment(int alignment) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGravity() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravity(int gravity) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static class LayoutConfig extends ComponentContainer.LayoutConfig {
/*     */     public static final int ABOVE = 0;
/*     */     public static final int ALIGN_BASELINE = 8;
/*     */     public static final int ALIGN_BOTTOM = 5;
/*     */     public static final int ALIGN_END = 19;
/*     */     public static final int ALIGN_LEFT = 6;
/*     */     public static final int ALIGN_PARENT_BOTTOM = 10;
/*     */     public static final int ALIGN_PARENT_END = 21;
/*     */     public static final int ALIGN_PARENT_LEFT = 11;
/*     */     public static final int ALIGN_PARENT_RIGHT = 12;
/*     */     public static final int ALIGN_PARENT_START = 20;
/*     */     public static final int ALIGN_PARENT_TOP = 9;
/*     */     
/*     */     public LayoutConfig() {
/* 154 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int ALIGN_RIGHT = 7; public static final int ALIGN_START = 18;
/*     */     public static final int ALIGN_TOP = 4;
/*     */     public static final int BELOW = 1;
/*     */     public static final int CENTER_IN_PARENT = 15;
/*     */     public static final int END_OF = 17;
/*     */     
/*     */     public LayoutConfig(Context context, AttrSet attrSet) {
/* 163 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     
/*     */     public static final int HORIZONTAL_CENTER = 13;
/*     */     public static final int LEFT_OF = 2;
/*     */     public static final int RIGHT_OF = 3;
/*     */     public static final int START_OF = 16;
/*     */     public static final int TRUE = -1;
/*     */     public static final int VERTICAL_CENTER = 14;
/*     */     
/*     */     public LayoutConfig(int width, int height) {
/* 175 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(LayoutConfig source) {
/* 184 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(ComponentContainer.LayoutConfig source) {
/* 193 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 199 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public void addRule(int verb, int subject) {
/* 213 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public void addRule(int verb) {
/* 226 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void removeRule(int verb) {
/* 234 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getRule(int verb) {
/* 244 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int[] getRules() {
/* 253 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/DependentLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */