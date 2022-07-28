package ohos.data.orm;

import ohos.data.rdb.Statement;
import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.0.1.95.jar:ohos/data/orm/EntityHelper.class */
public interface EntityHelper<T> {
    void bindValue(Statement statement, T t);

    void bindValue(Statement statement, T t, long j);

    T createInstance(ResultSet resultSet);

    void setPrimaryKeyValue(T t, long j);

    String getTableName();

    String getInsertStatement();

    String getUpdateStatement();

    String getDeleteStatement();
}
