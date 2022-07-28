/*     */ package ohos.nfc;
/*     */ 
/*     */ import java.util.List;
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.app.Context;
/*     */ import ohos.event.intentagent.IntentAgent;
/*     */ import ohos.interwork.utils.PacMapEx;
/*     */ import ohos.nfc.tag.TagInfo;
/*     */ import ohos.rpc.IRemoteBroker;
/*     */ import ohos.rpc.IRemoteObject;
/*     */ import ohos.rpc.MessageOption;
/*     */ import ohos.rpc.MessageParcel;
/*     */ import ohos.rpc.RemoteException;
/*     */ import ohos.rpc.RemoteObject;
/*     */ 
/*     */ public final class NfcController {
/*     */   public static final String EXTRA_NFC_STATE = "extra_nfc_state";
/*     */   public static final String EXTRA_NFC_TRANSACTION = "extra_nfc_transaction";
/*     */   public static final String EXTRA_TAG_INFO = "extra_nfc_TAG_INFO";
/*     */   public static final String FIELD_OFF_DETECTED = "usual.event.nfc.action.RF_FIELD_OFF_DETECTED";
/*     */   public static final String FIELD_ON_DETECTED = "usual.event.nfc.action.RF_FIELD_ON_DETECTED";
/*     */   
/*     */   NfcController(Context context) {
/*  24 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String STATE_CHANGED = "usual.event.nfc.action.ADAPTER_STATE_CHANGED";
/*     */   
/*     */   public static final int STATE_OFF = 1;
/*     */   
/*     */   public static final int STATE_ON = 3;
/*     */   public static final int STATE_TURNING_OFF = 4;
/*     */   public static final int STATE_TURNING_ON = 2;
/*     */   
/*     */   public static synchronized NfcController getInstance(Context context) throws IllegalArgumentException {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean openNfc() throws NfcPermissionException {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean closeNfc() throws NfcPermissionException {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNfcOpen() {
/*  66 */     throw new RuntimeException("Stub!");
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
/*     */   public int getNfcState() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNfcAvailable() {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public void setReaderMode(Ability ability, ReaderModeCallback callback, int flags, PacMapEx pacMapEx) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unsetReaderMode(Ability ability) {
/* 110 */     throw new RuntimeException("Stub!");
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
/*     */   public void registerForegroundDispatch(Ability ability, IntentAgent intent, List<String> filters, String[][] profiles) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unregisterForegroundDispatch(Ability ability) {
/* 131 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class ReaderModeCallbackStub
/*     */     extends RemoteObject
/*     */     implements ReaderModeCallback
/*     */   {
/*     */     public ReaderModeCallbackStub(NfcController.ReaderModeCallback callback) {
/* 257 */       super(null); throw new RuntimeException("Stub!");
/*     */     } public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
/* 259 */       throw new RuntimeException("Stub!");
/*     */     } public IRemoteObject asObject() {
/* 261 */       throw new RuntimeException("Stub!");
/*     */     } public void onTagDiscovered(TagInfo tagInfo) {
/* 263 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface ReaderModeCallback extends IRemoteBroker {
/*     */     public static final int TRANSACTION_ON_CALLBACK = 1;
/*     */     
/*     */     void onTagDiscovered(TagInfo param1TagInfo);
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/NfcController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */