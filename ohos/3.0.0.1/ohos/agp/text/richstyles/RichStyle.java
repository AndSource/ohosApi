/*     */ package ohos.agp.text.richstyles;
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
/*     */ public abstract class RichStyle
/*     */ {
/*     */   public RichStyle() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeId getRichStyleTypeId() {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCapability() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Capability
/*     */   {
/*     */     public static final int ALIGNMENT_FLAG = 524288;
/*     */     public static final int CLICK_FLAG = 8;
/*     */     public static final int COPIABLE_FLAG = 1073741824;
/*     */     public static final int CUSTOM_DRAW_FLAG = 64;
/*     */     public static final int CUSTOM_LINE_BG_FLAG = 2097152;
/*     */     public static final int DECORATION_FLAG = 4;
/*     */     public static final int INDENT_FLAG = 131072;
/*     */     
/*     */     Capability() {
/*  63 */       throw new RuntimeException("Stub!");
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
/*     */     
/*     */     public static final int LINE_HEIGHT_FLAG = 262144;
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
/*     */     public static final int OBSERVER_FLAG = 536870912;
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
/*     */     public static final int PARAGRAPH_FLAG = 65536;
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
/*     */     public static final int REPLACEMENT_FLAG = 16;
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
/*     */     public static final int REPLACE_DRAW_FLAG = 32;
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
/*     */     public static final int TAB_STOPS_FLAG = 1048576;
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
/*     */     public static final int UPDATE_LAYOUT_FLAG = 2;
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
/*     */     public static final int UPDATE_PAINT_FLAG = 1;
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
/*     */   public enum TypeId
/*     */   {
/* 176 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     BACKGROUND_COLOR_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     FONT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     FONT_SIZE_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     FOREGROUND_COLOR_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     IMAGE_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     HORIZONTAL_SCALE_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     STRIKETHROUGH_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     SUBSCRIPT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     SUPERSCRIPT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     UNDERLINE_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     URL_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 236 */     CLICK_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     ALIGNMENT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     INDENT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     LINE_HEIGHT_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 256 */     LINE_BACKGROUND_RICH_STYLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 261 */     TAB_STOPS_RICH_STYLE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 270 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static TypeId getByInt(int enumInt) {
/* 280 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/text/richstyles/RichStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */