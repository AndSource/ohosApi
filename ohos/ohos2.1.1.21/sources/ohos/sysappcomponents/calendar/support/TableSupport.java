package ohos.sysappcomponents.calendar.support;

import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.sysappcomponents.calendar.entity.CalendarEntity;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/sysappcomponents/calendar/support/TableSupport.class */
public abstract class TableSupport {
    public abstract Rule getRule();

    public abstract ValuesBucket getValueBucket(CalendarEntity calendarEntity);

    public abstract DataAbilityPredicates getPredicate(int i);

    protected abstract void initColumnMap();

    TableSupport(Class<? extends CalendarEntity> entityClass, Uri dataAbilityUri) {
        throw new RuntimeException("Stub!");
    }

    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }

    public Uri getSyncUri(String accName, String accType) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityPredicates getPredicate(CalendarEntity entity) {
        throw new RuntimeException("Stub!");
    }
}
