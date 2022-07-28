package ohos.security.permission;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: ohos2.1.1.21.jar:ohos/security/permission/NeedsPermission.class */
public @interface NeedsPermission {
    String value() default "";

    String[] any() default {};

    String[] all() default {};

    boolean partial() default false;
}
