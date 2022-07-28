package ohos.data.file;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.app.Context;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;
import ohos.global.resource.RawFileDescriptor;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/data/file/FileAbility.class */
public class FileAbility extends Ability {
    public FileAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public int insert(Uri uri, ValuesBucket value) {
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
    public PacMap call(String method, String arg, PacMap extras) {
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
    public RawFileDescriptor openRawFile(Uri uri, String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public FileDescriptor openFile(Uri uri, String mode) {
        throw new RuntimeException("Stub!");
    }

    public static Uri getUriViaFile(Context context, String Authority, File file) {
        throw new RuntimeException("Stub!");
    }

    public static File getFileViaUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }
}
