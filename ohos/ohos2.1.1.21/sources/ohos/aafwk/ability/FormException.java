package ohos.aafwk.ability;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/FormException.class */
public class FormException extends Exception {

    /* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/FormException$FormError.class */
    public enum FormError {
        INPUT_PARAM_INVALID,
        FMS_RPC_ERROR,
        BMS_RPC_ERROR,
        SEND_FMS_MSG_ERROR,
        SEND_BMS_MSG_ERROR,
        PERMISSION_DENY,
        FORM_INFO_NOT_FOUND,
        GET_BUNDLE_FAILED,
        INIT_LAYOUT_FAILED,
        BIND_PROVIDER_FAILED,
        FORM_DUPLICATE_ADDED,
        FORM_CFG_NOT_MATCH_ID,
        FORM_ID_NOT_EXIST,
        EXCEED_MAX_SYSTEM_FORMS,
        EXCEED_MAX_INSTANCES_PER_FORM,
        FORM_NOT_SELF_OWNED,
        PROVIDER_DELETE_FAIL,
        EXCEED_MAX_FORMS_PER_CLIENT,
        EXCEED_MAX_SYSTEM_TEMP_FORMS,
        MODULE_NOT_EXIST,
        ABILITY_NOT_EXIST,
        DIMENSION_NOT_EXIST,
        FA_NOT_INSTALLED,
        FORM_IN_RECOVER,
        INTERNAL_ERROR
    }

    FormException(FormError formErr) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        throw new RuntimeException("Stub!");
    }

    public FormError getErrorCode() {
        throw new RuntimeException("Stub!");
    }
}
