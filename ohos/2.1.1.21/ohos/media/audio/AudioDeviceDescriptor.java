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
/*     */ public class AudioDeviceDescriptor
/*     */ {
/*     */   public AudioDeviceDescriptor(int id, String name, String address, DeviceType type, DeviceRole role, int[] samplingRates, int[] channelMasks, int[] channelIndexMasks, List<AudioStreamInfo.EncodingFormat> encodings) {
/*  37 */     throw new RuntimeException("Stub!");
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
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOutputDevice() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInputDevice() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(int id) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String name) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAddress() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAddress(String address) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceType getType() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(DeviceType type) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceRole getRole() {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRole(DeviceRole role) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getSamplingRates() {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSamplingRates(int[] samplingRates) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelMasks() {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelMasks(int[] channelMasks) {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getChannelIndexMasks() {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChannelIndexMasks(int[] channelIndexMasks) {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<AudioStreamInfo.EncodingFormat> getEncodings() {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEncodings(List<AudioStreamInfo.EncodingFormat> encodings) {
/* 240 */     throw new RuntimeException("Stub!");
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
/* 253 */     throw new RuntimeException("Stub!");
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
/* 267 */     OUTPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 272 */     INPUT_DEVICES_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     ALL_DEVICES_FLAG;
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
/* 296 */       throw new RuntimeException("Stub!");
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
/* 312 */     INPUT_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 317 */     OUTPUT_DEVICE;
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
/* 336 */       throw new RuntimeException("Stub!");
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
/* 352 */     INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     EARPIECE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 362 */     SPEAKER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     WIRED_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 372 */     WIRED_HEADPHONES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 377 */     ANALOG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 382 */     DIGITAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     BLUETOOTH_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 392 */     BLUETOOTH_A2DP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 397 */     HDMI,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 402 */     HDMI_ARC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     USB_DEVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 412 */     USB_ACCESSORY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     DOCK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 422 */     FM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 427 */     MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 432 */     FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 437 */     TV_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 442 */     TELEPHONY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     AUXILIARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 452 */     IP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 457 */     BUS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 462 */     USB_HEADSET,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 467 */     HEARING_AID;
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
/* 486 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/audio/AudioDeviceDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */