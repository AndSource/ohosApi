package ark.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: ohos2.1.1.21.jar:ark/annotation/UnownedOuter.class */
public @interface UnownedOuter {
}
