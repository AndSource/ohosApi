package ohos.data.async;

import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.0.1.95.jar:ohos/data/async/QueryCallback.class */
public interface QueryCallback {
    void onQueryDone(Integer num, Object obj, ResultSet resultSet);
}
