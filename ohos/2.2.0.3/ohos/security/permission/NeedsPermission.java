package ohos.security.permission;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface NeedsPermission {
  String value() default "";
  
  String[] any() default {};
  
  String[] all() default {};
  
  boolean partial() default false;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/security/permission/NeedsPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */