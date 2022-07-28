package ohos.data.async;

import ohos.data.rdb.RdbPredicates;
import ohos.data.rdb.RdbStore;
import ohos.data.rdb.ValuesBucket;
import ohos.eventhandler.EventHandler;

/* loaded from: ohos2.2.0.3.jar:ohos/data/async/RdbStoreAsyncHandler.class */
public class RdbStoreAsyncHandler extends EventHandler {
    public RdbStoreAsyncHandler(RdbStore rdbStore) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public final void addQueryJob(JobParams jobParams, String[] columns, RdbPredicates rdbPredicates, QueryCallback queryCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addInsertJob(JobParams jobParams, String tableName, ValuesBucket valuesBucket, InsertCallback insertCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addUpdateJob(JobParams jobParams, ValuesBucket valuesBucket, RdbPredicates rdbPredicates, UpdateCallback updateCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addDeleteJob(JobParams jobParams, RdbPredicates rdbPredicates, DeleteCallback deleteCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void cancelJob(int token) {
        throw new RuntimeException("Stub!");
    }
}
