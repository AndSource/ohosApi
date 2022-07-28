/*    */ package ohos.data.file;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ import ohos.aafwk.ability.Ability;
/*    */ import ohos.aafwk.content.Intent;
/*    */ import ohos.app.Context;
/*    */ import ohos.data.dataability.DataAbilityPredicates;
/*    */ import ohos.data.rdb.ValuesBucket;
/*    */ import ohos.data.resultset.ResultSet;
/*    */ import ohos.global.resource.RawFileDescriptor;
/*    */ import ohos.utils.PacMap;
/*    */ import ohos.utils.net.Uri;
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
/*    */ public class FileAbility
/*    */   extends Ability
/*    */ {
/*    */   public FileAbility() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public void onStart(Intent intent) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public int insert(Uri uri, ValuesBucket value) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public int delete(Uri uri, DataAbilityPredicates predicates) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public int update(Uri uri, ValuesBucket value, DataAbilityPredicates predicates) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   } public PacMap call(String method, String arg, PacMap extras) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public String getType(Uri uri) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public String[] getFileTypes(Uri uri, String mimeTypeFilter) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public RawFileDescriptor openRawFile(Uri uri, String mode) throws FileNotFoundException {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public FileDescriptor openFile(Uri uri, String mode) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Uri getUriViaFile(Context context, String Authority, File file) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static File getFileViaUri(Uri uri) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/file/FileAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */