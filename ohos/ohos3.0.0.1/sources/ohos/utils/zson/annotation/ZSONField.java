package ohos.utils.zson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: ohos3.0.0.1.jar:ohos/utils/zson/annotation/ZSONField.class */
public @interface ZSONField {
    String name() default "";
}
