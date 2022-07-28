package ohos.security.fileprotect;

import ohos.app.Context;

public interface ISfpPolicyManager {
  int setLabel(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt);
  
  String getLabel(Context paramContext, String paramString1, String paramString2);
  
  int getFlag(Context paramContext, String paramString1, String paramString2);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/security/fileprotect/ISfpPolicyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */