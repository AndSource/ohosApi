package ohos.sysappcomponents.calendar.support;

import java.util.Optional;
import ohos.data.resultset.ResultSet;
import ohos.sysappcomponents.calendar.entity.CalendarEntity;

public interface Rule {
  Optional<? extends CalendarEntity> getEntity(ResultSet paramResultSet, String[] paramArrayOfString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/sysappcomponents/calendar/support/Rule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */