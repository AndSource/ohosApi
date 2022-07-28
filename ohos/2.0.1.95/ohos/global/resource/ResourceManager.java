/*    */ package ohos.global.resource;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import ohos.global.config.ConfigManager;
/*    */ import ohos.global.configuration.Configuration;
/*    */ import ohos.global.configuration.DeviceCapability;
/*    */ import ohos.global.resource.solidxml.Pattern;
/*    */ import ohos.global.resource.solidxml.SolidXml;
/*    */ import ohos.global.resource.solidxml.Theme;
/*    */ import ohos.global.resource.solidxml.TypedAttribute;
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
/*    */ public abstract class ResourceManager
/*    */ {
/*    */   public ResourceManager() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Resource getResource(int paramInt) throws IOException, NotExistException;
/*    */   
/*    */   public abstract String getIdentifier(int paramInt) throws IOException, NotExistException;
/*    */   
/*    */   public abstract Element getElement(int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   @Deprecated
/*    */   public abstract Theme getTheme(int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract SolidXml getSolidXml(int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract RawFileEntry getRawFileEntry(String paramString);
/*    */   
/*    */   public abstract ConfigManager getConfigManager();
/*    */   
/*    */   public abstract String getMediaPath(int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract Configuration getConfiguration();
/*    */   
/*    */   public abstract DeviceCapability getDeviceCapability();
/*    */   
/*    */   public abstract void updateConfiguration(Configuration paramConfiguration, DeviceCapability paramDeviceCapability);
/*    */   
/*    */   public abstract Pattern createPattern(List<TypedAttribute.AttrData> paramList);
/*    */   
/*    */   public abstract Theme createTheme(List<TypedAttribute.AttrData> paramList);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/resource/ResourceManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */