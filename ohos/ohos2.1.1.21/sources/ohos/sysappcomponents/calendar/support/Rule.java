package ohos.sysappcomponents.calendar.support;

import java.util.Optional;
import ohos.data.resultset.ResultSet;
import ohos.sysappcomponents.calendar.entity.CalendarEntity;

/* loaded from: ohos2.1.1.21.jar:ohos/sysappcomponents/calendar/support/Rule.class */
public interface Rule {
    Optional<? extends CalendarEntity> getEntity(ResultSet resultSet, String[] strArr);
}
