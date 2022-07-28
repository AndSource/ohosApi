package ohos.data.search.schema;

import java.util.List;
import ohos.data.search.model.IndexForm;

/* loaded from: ohos2.1.1.21.jar:ohos/data/search/schema/CommonItem.class */
public final class CommonItem extends Schema<CommonItem> {
    public static final String ALTERNATE_NAME = "alternateName";
    public static final String CATEGORY = "category";
    public static final String DATE_CREATE = "dateCreate";
    public static final String DESCRIPTION = "description";
    public static final String IDENTIFIER = "identifier";
    public static final String KEYWORDS = "keywords";
    public static final String NAME = "name";
    public static final String POTENTIAL_ACTION = "potentialAction";
    public static final String RESERVED1 = "reserved1";
    public static final String RESERVED2 = "reserved2";
    public static final String SUBTITLE = "subtitle";
    public static final String THUMBNAIL_URL = "thumbnailUrl";
    public static final String TITLE = "title";
    public static final String URL = "url";

    public CommonItem() {
        throw new RuntimeException("Stub!");
    }

    public static List<IndexForm> getCommonSchema() {
        throw new RuntimeException("Stub!");
    }
}
