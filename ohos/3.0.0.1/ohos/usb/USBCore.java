/*     */ package ohos.usb;
/*     */ 
/*     */ import java.util.HashMap;
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
/*     */ public class USBCore
/*     */ {
/*     */   public static final String ACTION_USB_DEVICE_ATTACHED = "ohos.usb.action.USB_DEVICE_ATTACHED";
/*     */   public static final String ACTION_USB_DEVICE_DETACHED = "ohos.usb.action.USB_DEVICE_DETACHED";
/*     */   public static final String EXTRA_DEVICE = "device";
/*     */   public static final String EXTRA_PERMISSION_GRANTED = "permission";
/*     */   
/*     */   public USBCore(Context context) {
/*  40 */     throw new RuntimeException("Stub!");
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
/*     */   public HashMap<String, USBDevice> getDevices() {
/*  52 */     throw new RuntimeException("Stub!");
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
/*     */   public USBDevicePipe connectDevice(USBDevice device) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasRight(USBDevice device) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void requestRight(USBDevice device, String intentName) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String usbFunctionsToString(long functions) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long usbFunctionsFromString(String functions) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/usb/USBCore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */