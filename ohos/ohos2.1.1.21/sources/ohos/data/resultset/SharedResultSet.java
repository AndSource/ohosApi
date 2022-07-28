package ohos.data.resultset;

/* loaded from: ohos2.1.1.21.jar:ohos/data/resultset/SharedResultSet.class */
public interface SharedResultSet extends ResultSet {
    SharedBlock getBlock();

    void fillBlock(int i, SharedBlock sharedBlock);

    boolean onGo(int i, int i2);
}
