package ohos.data.resultset;

/* loaded from: ohos2.0.1.95.jar:ohos/data/resultset/SharedResultSet.class */
public interface SharedResultSet extends ResultSet {
    SharedBlock getBlock();

    void fillBlock(int i, SharedBlock sharedBlock);

    boolean onGo(int i, int i2);
}
