package ohos.data.async;

import ohos.app.Context;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.eventhandler.EventHandler;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/data/async/DataAbilityAsyncHandler.class */
public class DataAbilityAsyncHandler extends EventHandler {
    public DataAbilityAsyncHandler(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DataAbilityAsyncHandler(Context context, Uri uri) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public final void addQueryJob(JobParams jobParams, Uri uri, String[] columns, DataAbilityPredicates dataAbilityPredicates, QueryCallback queryCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addInsertJob(JobParams jobParams, Uri uri, ValuesBucket valuesBucket, InsertCallback insertCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addUpdateJob(JobParams jobParams, Uri uri, ValuesBucket valuesBucket, DataAbilityPredicates dataAbilityPredicates, UpdateCallback updateCallback) {
        throw new RuntimeException("Stub!");
    }

    public final void addDeleteJob(JobParams jobParams, Uri uri, DataAbilityPredicates dataAbilityPredicates, DeleteCallback deleteCallback) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() {
        throw new RuntimeException("Stub!");
    }

    public final void cancelJob(int token) {
        throw new RuntimeException("Stub!");
    }
}
