/*    */ package ohos.global.resource;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.text.Format;
/*    */ import ohos.global.resource.solidxml.Pattern;
/*    */ import ohos.global.resource.solidxml.Theme;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Element
/*    */ {
/*    */   public Element() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getString() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getString(Object... paramVarArgs) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getString(Object paramObject, Format paramFormat) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getString(Object[] paramArrayOfObject, Format[] paramArrayOfFormat) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract boolean getBoolean() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int getColor() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract float getFloat() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getConfig() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int getInteger() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String[] getStringArray() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int[] getIntArray() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getPluralString(int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getPluralString(int paramInt, Object... paramVarArgs) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract Theme getTheme() throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract Pattern getPattern() throws IOException, NotExistException, WrongTypeException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/global/resource/Element.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */