package ohos.global.icu.util;

public interface Freezable<T> extends Cloneable {
  boolean isFrozen();
  
  T freeze();
  
  T cloneAsThawed();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/util/Freezable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */