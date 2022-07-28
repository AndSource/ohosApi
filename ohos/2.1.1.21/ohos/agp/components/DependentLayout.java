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
/*     */ public class DependentLayout
/*     */   extends ComponentContainer
/*     */ {
/*     */   public DependentLayout(Context context) {
/*  32 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DependentLayout(Context context, AttrSet attrSet) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*  53 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIgnoreAlignment() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIgnoreAlignment(int componentId) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIgnoreGravity() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIgnoreGravity(int componentId) {
/*  85 */     throw new RuntimeException("Stub!");
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
/*  96 */     throw new RuntimeException("Stub!");
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
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGravity() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravity(int gravity) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
/* 129 */     throw new RuntimeException("Stub!");
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
/* 146 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int ALIGN_RIGHT = 7; public static final int ALIGN_START = 18;
/*     */     public static final int ALIGN_TOP = 4;
/*     */     public static final int BELOW = 1;
/*     */     public static final int CENTER_IN_PARENT = 15;
/*     */     public static final int END_OF = 17;
/*     */     
/*     */     public LayoutConfig(Context context, AttrSet attrSet) {
/* 155 */       throw new RuntimeException("Stub!");
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
/* 167 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(LayoutConfig source) {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(ComponentContainer.LayoutConfig source) {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 191 */       throw new RuntimeException("Stub!");
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
/* 205 */       throw new RuntimeException("Stub!");
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
/* 218 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void removeRule(int verb) {
/* 226 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getRule(int verb) {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int[] getRules() {
/* 245 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/DependentLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */