package ohos.security.permission;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface PermissionLevel {
  PermissionAvailableScope[] availableScope() default {PermissionAvailableScope.ALL};
  
  PermissionGrantMode grantMode() default PermissionGrantMode.SYSTEM_GRANT;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/security/permission/PermissionLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */