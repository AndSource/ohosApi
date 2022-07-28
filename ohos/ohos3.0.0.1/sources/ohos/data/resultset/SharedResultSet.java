package ohos.data.resultset;

/* loaded from: ohos3.0.0.1.jar:ohos/data/resultset/SharedResultSet.class */
public interface SharedResultSet extends ResultSet {
    SharedBlock getBlock();

    void fillBlock(int i, SharedBlock sharedBlock);

    boolean onGo(int i, int i2);
}
