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
/*  45 */     throw new RuntimeException("Stub!");
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
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOutputDevice() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInputDevice() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(int id) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String name) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAddress() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAddress(String address) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceType getType() {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(DeviceType type) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceRole getRole() {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRole(DeviceRole role) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getSamplingRates() {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSamplingRates(int[] samplingRates) {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelMasks() {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelMasks(int[] channelMasks) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelIndexMasks() {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelIndexMasks(int[] channelIndexMasks) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<AudioStreamInfo.EncodingFormat> getEncodings() {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEncodings(List<AudioStreamInfo.EncodingFormat> encodings) {
/* 248 */     throw new RuntimeException("Stub!");
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
/* 261 */     throw new RuntimeException("Stub!");
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
/*     */   public enum DeviceFlag
/*     */   {
/* 275 */     OUTPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 280 */     INPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 285 */     ALL_DEVICES_FLAG;
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
/* 304 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum DeviceRole
/*     */   {
/* 320 */     INPUT_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 325 */     OUTPUT_DEVICE;
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
/* 344 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum DeviceType
/*     */   {
/* 360 */     INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     EARPIECE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     SPEAKER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     WIRED_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     WIRED_HEADPHONES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     ANALOG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     DIGITAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     BLUETOOTH_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     BLUETOOTH_A2DP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     HDMI,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     HDMI_ARC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     USB_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     USB_ACCESSORY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     DOCK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 430 */     FM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 435 */     MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 440 */     FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 445 */     TV_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 450 */     TELEPHONY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 455 */     AUXILIARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 460 */     IP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 465 */     BUS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 470 */     USB_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 475 */     HEARING_AID;
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
/* 494 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/audio/AudioDeviceDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */