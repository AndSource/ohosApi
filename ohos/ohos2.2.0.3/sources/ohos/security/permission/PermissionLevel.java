package ohos.security.permission;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: ohos2.2.0.3.jar:ohos/security/permission/PermissionLevel.class */
public @interface PermissionLevel {
    PermissionAvailableScope[] availableScope() default {PermissionAvailableScope.ALL};

    PermissionGrantMode grantMode() default PermissionGrantMode.SYSTEM_GRANT;
}
