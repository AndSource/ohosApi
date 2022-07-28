package ohos.data.resultset;

import java.util.List;
import ohos.data.rdb.DataObserver;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/data/resultset/ResultSet.class */
public interface ResultSet {
    String[] getAllColumnNames();

    int getColumnCount();

    ColumnType getColumnTypeForIndex(int i);

    int getColumnIndexForName(String str);

    String getColumnNameForIndex(int i);

    int getRowCount();

    int getRowIndex();

    boolean goTo(int i);

    boolean goToRow(int i);

    boolean goToFirstRow();

    boolean goToLastRow();

    boolean goToNextRow();

    boolean goToPreviousRow();

    boolean isEnded();

    boolean isStarted();

    boolean isAtFirstRow();

    boolean isAtLastRow();

    byte[] getBlob(int i);

    String getString(int i);

    short getShort(int i);

    int getInt(int i);

    long getLong(int i);

    float getFloat(int i);

    double getDouble(int i);

    boolean isColumnNull(int i);

    boolean isClosed();

    void close();

    void setExtensions(PacMap pacMap);

    PacMap getExtensions();

    void setAffectedByUris(Object obj, List<Uri> list);

    List<Uri> getAffectedByUris();

    void registerObserver(DataObserver dataObserver);

    void unregisterObserver(DataObserver dataObserver);

    /* loaded from: ohos3.0.0.1.jar:ohos/data/resultset/ResultSet$ColumnType.class */
    public enum ColumnType {
        TYPE_NULL,
        TYPE_INTEGER,
        TYPE_FLOAT,
        TYPE_STRING,
        TYPE_BLOB;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static ColumnType getByValue(int value) {
            throw new RuntimeException("Stub!");
        }
    }
}
