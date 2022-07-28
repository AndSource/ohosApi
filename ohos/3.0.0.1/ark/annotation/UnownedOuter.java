package ark.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE_USE, ElementType.METHOD})
public @interface UnownedOuter {}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ark/annotation/UnownedOuter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */