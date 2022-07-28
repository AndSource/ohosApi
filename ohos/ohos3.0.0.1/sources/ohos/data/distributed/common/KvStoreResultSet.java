package ohos.data.distributed.common;

/* loaded from: ohos3.0.0.1.jar:ohos/data/distributed/common/KvStoreResultSet.class */
public interface KvStoreResultSet {
    int getRowCount();

    int getRowIndex();

    boolean goToFirstRow();

    boolean goToLastRow();

    boolean goToNextRow();

    boolean goToPreviousRow();

    boolean skipRow(int i);

    boolean goToRow(int i);

    boolean isAtFirstRow();

    boolean isAtLastRow();

    boolean isStarted();

    boolean isEnded();

    Entry getEntry();
}
