package ohos.javax.xml.validation;

/* loaded from: ohos2.2.0.3.jar:ohos/javax/xml/validation/Schema.class */
public abstract class Schema {
    public abstract Validator newValidator();

    public abstract ValidatorHandler newValidatorHandler();

    protected Schema() {
        throw new RuntimeException("Stub!");
    }
}
