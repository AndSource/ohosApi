/*     */ package ohos.media.audio;
/*     */ 
/*     */ import java.util.List;
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
/*     */ public class AudioDeviceDescriptor
/*     */ {
/*     */   public AudioDeviceDescriptor(int id, String name, String address, DeviceType type, DeviceRole role, int[] samplingRates, int[] channelMasks, int[] channelIndexMasks, List<AudioStreamInfo.EncodingFormat> encodings) {
/*  35 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean equals(Object object) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOutputDevice() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInputDevice() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(int id) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String name) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAddress() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAddress(String address) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceType getType() {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(DeviceType type) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceRole getRole() {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRole(DeviceRole role) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getSamplingRates() {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSamplingRates(int[] samplingRates) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelMasks() {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelMasks(int[] channelMasks) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelIndexMasks() {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelIndexMasks(int[] channelIndexMasks) {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<AudioStreamInfo.EncodingFormat> getEncodings() {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEncodings(List<AudioStreamInfo.EncodingFormat> encodings) {
/* 238 */     throw new RuntimeException("Stub!");
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
/*     */   public int[] getChannelCounts() {
/* 251 */     throw new RuntimeException("Stub!");
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
/*     */   public enum DeviceFlag
/*     */   {
/* 264 */     OUTPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     INPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     ALL_DEVICES_FLAG;
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
/*     */     public int getValue() {
/* 293 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public enum DeviceRole
/*     */   {
/* 308 */     INPUT_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     OUTPUT_DEVICE;
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
/*     */     public int getValue() {
/* 332 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public enum DeviceType
/*     */   {
/* 347 */     INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 352 */     EARPIECE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     SPEAKER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 362 */     WIRED_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     WIRED_HEADPHONES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 372 */     ANALOG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 377 */     DIGITAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 382 */     BLUETOOTH_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     BLUETOOTH_A2DP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 392 */     HDMI,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 397 */     HDMI_ARC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 402 */     USB_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     USB_ACCESSORY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 412 */     DOCK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     FM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 422 */     MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 427 */     FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 432 */     TV_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 437 */     TELEPHONY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 442 */     AUXILIARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     IP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 452 */     BUS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 457 */     USB_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 462 */     HEARING_AID;
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
/*     */     public int getValue() {
/* 481 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/audio/AudioDeviceDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */