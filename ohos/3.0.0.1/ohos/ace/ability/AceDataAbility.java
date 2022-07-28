/*    */ package ohos.ace.ability;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.ArrayList;
/*    */ import ohos.aafwk.ability.DataAbilityOperation;
/*    */ import ohos.aafwk.ability.DataAbilityResult;
/*    */ import ohos.aafwk.ability.OperationExecuteException;
/*    */ import ohos.aafwk.content.Intent;
/*    */ import ohos.bundle.AbilityInfo;
/*    */ import ohos.data.dataability.DataAbilityPredicates;
/*    */ import ohos.data.rdb.ValuesBucket;
/*    */ import ohos.data.resultset.ResultSet;
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
/*    */ public class AceDataAbility
/*    */   extends AceAbility
/*    */ {
/*    */   public AceDataAbility() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public void onStart(Intent intent) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onInitialized(AbilityInfo abilityInfo) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public void onStop() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public Uri normalizeUri(Uri uri) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   } public Uri denormalizeUri(Uri uri) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public String getType(Uri uri) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   } public String[] getFileTypes(Uri uri, String mimeTypeFilter) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   } public FileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   } public PacMap call(String method, String arg, PacMap extras) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public int delete(Uri uri, DataAbilityPredicates predicates) {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public int update(Uri uri, ValuesBucket value, DataAbilityPredicates predicates) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public int insert(Uri uri, ValuesBucket value) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public int batchInsert(Uri uri, ValuesBucket[] values) {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   } public DataAbilityResult[] executeBatch(ArrayList<DataAbilityOperation> operations) throws OperationExecuteException {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setInstanceName(String name) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/ace/ability/AceDataAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */