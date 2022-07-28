package ohos.aafwk.ability;

import java.io.FileDescriptor;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

public interface PipeFileWriter<T> {
  void write(FileDescriptor paramFileDescriptor, Uri paramUri, String paramString, PacMap paramPacMap, T paramT);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/PipeFileWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */