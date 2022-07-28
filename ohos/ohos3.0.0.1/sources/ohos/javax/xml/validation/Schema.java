package ohos.javax.xml.validation;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/validation/Schema.class */
public abstract class Schema {
    public abstract Validator newValidator();

    public abstract ValidatorHandler newValidatorHandler();

    protected Schema() {
        throw new RuntimeException("Stub!");
    }
}
