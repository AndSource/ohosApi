package ohos.ace.ability;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import ohos.aafwk.ability.DataAbilityOperation;
import ohos.aafwk.ability.DataAbilityResult;
import ohos.aafwk.ability.OperationExecuteException;
import ohos.aafwk.content.Intent;
import ohos.bundle.AbilityInfo;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/ace/ability/AceDataAbility.class */
public class AceDataAbility extends AceAbility {
    public AceDataAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility, ohos.aafwk.ability.Ability
    public void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onInitialized(AbilityInfo abilityInfo) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility, ohos.aafwk.ability.Ability
    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public Uri normalizeUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public Uri denormalizeUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public String getType(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public String[] getFileTypes(Uri uri, String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public FileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public PacMap call(String method, String arg, PacMap extras) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public int delete(Uri uri, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public int update(Uri uri, ValuesBucket value, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public int insert(Uri uri, ValuesBucket value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public int batchInsert(Uri uri, ValuesBucket[] values) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public DataAbilityResult[] executeBatch(ArrayList<DataAbilityOperation> operations) throws OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility
    public void setInstanceName(String name) {
        throw new RuntimeException("Stub!");
    }
}
