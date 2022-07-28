package ohos.agp.components.webengine;

public interface PickFilesParams {
  public static final int TYPE_OPEN_MULTIPLE_FILES = 3;
  
  public static final int TYPE_OPEN_NOT_EXIST = 1;
  
  public static final int TYPE_OPEN_SINGLE_FILE = 2;
  
  String[] getMimeTypes();
  
  String getDefaultName();
  
  int getType();
  
  CharSequence getTitle();
  
  boolean isLiveMedia();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/webengine/PickFilesParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */