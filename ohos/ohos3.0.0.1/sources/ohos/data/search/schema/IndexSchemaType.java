package ohos.data.search.schema;

/* loaded from: ohos3.0.0.1.jar:ohos/data/search/schema/IndexSchemaType.class */
public enum IndexSchemaType {
    CUSTOM,
    COMMON,
    APP,
    DOCUMENT,
    PHOTO,
    VIDEO,
    MUSIC,
    CONTACT,
    MESSAGE,
    EMAIL,
    NOTEPAD,
    NOTICE,
    EVENT,
    PLACE,
    ACTION;

    public int getSchemaCode() {
        throw new RuntimeException("Stub!");
    }

    public String getSchemaType() {
        throw new RuntimeException("Stub!");
    }

    public static IndexSchemaType getSchemaType(int schemaCode) {
        throw new RuntimeException("Stub!");
    }
}
