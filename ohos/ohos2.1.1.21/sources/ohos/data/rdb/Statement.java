package ohos.data.rdb;

/* loaded from: ohos2.1.1.21.jar:ohos/data/rdb/Statement.class */
public interface Statement {
    void setNull(int i);

    void setLong(int i, long j);

    void setDouble(int i, double d);

    void setString(int i, String str);

    void setBlob(int i, byte[] bArr);

    void setStrings(String[] strArr);

    void setObject(int i, Object obj);

    void clearValues();

    void execute();

    long executeAndGetLong();

    String executeAndGetString();

    int executeAndGetChanges();

    long executeAndGetLastInsertRowId();

    void close();
}
