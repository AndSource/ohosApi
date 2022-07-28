package ohos.aafwk.ability;

import java.util.Map;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/DataAbilityOperation.class */
public class DataAbilityOperation implements Sequenceable {
    public static final Sequenceable.Producer<DataAbilityOperation> PRODUCER = null;
    public static final int TYPE_ASSERT = 4;
    public static final int TYPE_DELETE = 3;
    public static final int TYPE_INSERT = 1;
    public static final int TYPE_UPDATE = 2;

    public DataAbilityOperation(DataAbilityOperation dataAbilityOperation, Uri withUri) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityOperation(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static Builder newInsertBuilder(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static Builder newUpdateBuilder(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static Builder newDeleteBuilder(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static Builder newAssertBuilder(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public int getType() {
        throw new RuntimeException("Stub!");
    }

    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }

    public void setUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public ValuesBucket getValuesBucket() {
        throw new RuntimeException("Stub!");
    }

    public Integer getExpectedCount() {
        throw new RuntimeException("Stub!");
    }

    public ValuesBucket getValuesBucketReferences() {
        throw new RuntimeException("Stub!");
    }

    public Map<Integer, Integer> getDataAbilityPredicatesBackReferences() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInsertOperation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeleteOperation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUpdateOperation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAssertOperation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInterruptionAllowed() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static DataAbilityOperation createFromParcel(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/DataAbilityOperation$Builder.class */
    public static class Builder {
        Builder(int type, Uri uri) {
            throw new RuntimeException("Stub!");
        }

        public DataAbilityOperation build() {
            throw new RuntimeException("Stub!");
        }

        public Builder withValuesBucket(ValuesBucket values) {
            throw new RuntimeException("Stub!");
        }

        public Builder withPredicates(DataAbilityPredicates predicates) {
            throw new RuntimeException("Stub!");
        }

        public Builder withExpectedCount(int count) {
            throw new RuntimeException("Stub!");
        }

        public Builder withPredicatesBackReference(int requestArgIndex, int previousResult) {
            throw new RuntimeException("Stub!");
        }

        public Builder withValueBackReferences(ValuesBucket backReferences) {
            throw new RuntimeException("Stub!");
        }

        public Builder withInterruptionAllowed(boolean interrupted) {
            throw new RuntimeException("Stub!");
        }
    }
}
