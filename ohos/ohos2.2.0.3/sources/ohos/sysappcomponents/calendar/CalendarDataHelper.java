package ohos.sysappcomponents.calendar;

import java.security.InvalidParameterException;
import ohos.aafwk.ability.DataAbilityHelper;
import ohos.aafwk.ability.DataAbilityRemoteException;
import ohos.app.Context;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.sysappcomponents.calendar.entity.CalendarEntity;
import ohos.sysappcomponents.calendar.support.TableSupport;

/* loaded from: ohos2.2.0.3.jar:ohos/sysappcomponents/calendar/CalendarDataHelper.class */
public class CalendarDataHelper {
    CalendarDataHelper(DataAbilityHelper dataAbilityHelper, TableSupport tableSupport) {
        throw new RuntimeException("Stub!");
    }

    public static CalendarDataHelper creator(Context context, Class<? extends CalendarEntity> entityClass) throws InvalidParameterException {
        throw new RuntimeException("Stub!");
    }

    public CalendarCollection query(DataAbilityPredicates predicates, String[] columns) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public CalendarCollection query(int id, String[] columns) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean insert(ValuesBucket valuesBucket) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean update(ValuesBucket valuesBucket, DataAbilityPredicates predicates) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int delete(DataAbilityPredicates predicates) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean delete(CalendarEntity entity) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean delete(int id) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    public InstancesDataHelper getInstanceDataHelper() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/sysappcomponents/calendar/CalendarDataHelper$InstancesDataHelper.class */
    public class InstancesDataHelper {
        InstancesDataHelper() {
            throw new RuntimeException("Stub!");
        }

        public CalendarCollection query(DataAbilityPredicates predicates, String[] columns, long begin, long end) throws DataAbilityRemoteException {
            throw new RuntimeException("Stub!");
        }

        public boolean release() {
            throw new RuntimeException("Stub!");
        }
    }
}
