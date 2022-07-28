package ohos.aafwk.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import ohos.bundle.ElementName;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.geo.Rect;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/content/Intent.class */
public class Intent implements Sequenceable, Cloneable {
    public static final String ACTION_BOOK_FLIGHT = "ability.intent.BOOK_FLIGHT";
    public static final String ACTION_BOOK_HOTEL = "ability.intent.BOOK_HOTEL";
    public static final String ACTION_BOOK_TRAIN_TICKET = "ability.intent.BOOK_TRAIN_TICKET";
    public static final String ACTION_BUNDLE_ADD = "action.bundle.add";
    public static final String ACTION_BUNDLE_REMOVE = "action.bundle.remove";
    public static final String ACTION_BUNDLE_UPDATE = "action.bundle.update";
    public static final String ACTION_BUY = "ability.intent.BUY";
    public static final String ACTION_BUY_TAKEOUT = "ability.intent.BUY_TAKEOUT";
    public static final String ACTION_HOME = "action.system.home";
    public static final String ACTION_LOCALE_CHANGED = "ability.intent.LOCALE_CHANGED";
    public static final String ACTION_ORDER_TAXI = "ability.intent.ORDER_TAXI";
    public static final String ACTION_PLAN_ROUTE = "ability.intent.PLAN_ROUTE";
    public static final String ACTION_PLAY = "action.system.play";
    public static final String ACTION_QUERY_ALMANC = "ability.intent.QUERY_ALMANC";
    public static final String ACTION_QUERY_CONSTELLATION_FORTUNE = "ability.intent.QUERY_CONSTELLATION_FORTUNE";
    public static final String ACTION_QUERY_ENCYCLOPEDIA = "ability.intent.QUERY_ENCYCLOPEDIA";
    public static final String ACTION_QUERY_JOKE = "ability.intent.QUERY_JOKE";
    public static final String ACTION_QUERY_LOGISTICS_INFO = "ability.intent.QUERY_LOGISTICS_INFO";
    public static final String ACTION_QUERY_NEWS = "ability.intent.QUERY_NEWS";
    public static final String ACTION_QUERY_POI_INFO = "ability.intent.QUERY_POI_INFO";
    public static final String ACTION_QUERY_RECIPE = "ability.intent.QUERY_RECIPE";
    public static final String ACTION_QUERY_SPORTS_INFO = "ability.intent.QUERY_SPORTS_INFO";
    public static final String ACTION_QUERY_STOCK_INFO = "ability.intent.QUERY_STOCK_INFO";
    public static final String ACTION_QUERY_TRAFFIC_RESTRICTION = "ability.intent.QUERY_TRAFFIC_RESTRICTION";
    public static final String ACTION_QUERY_TRAVELLING_GUIDELINE = "ability.intent.QUERY_TRAVELLING_GUIDELINE";
    public static final String ACTION_QUERY_WEATHER = "ability.intent.QUERY_WEATHER";
    public static final String ACTION_SEND_LOGISTICS = "ability.intent.SEND_LOGISTICS";
    public static final String ACTION_TRANSLATE_TEXT = "ability.intent.TRANSLATE_TEXT";
    public static final String ACTION_WATCH_VIDEO_CLIPS = "ability.intent.WATCH_VIDEO_CLIPS";
    public static final int CLONE_ACTION = 1;
    public static final int CLONE_BORDERS_RECT = 64;
    public static final int CLONE_BUNDLE = 8;
    public static final int CLONE_ELEMENT = 32;
    public static final int CLONE_ENTITIES = 4;
    public static final int CLONE_PICKER = 16;
    public static final int CLONE_URI = 2;
    public static final String ENTITY_HOME = "entity.system.home";
    public static final String ENTITY_VIDEO = "entity.system.video";
    public static final int FLAG_ABILITYSLICE_FORWARD_RESULT = 67108864;
    public static final int FLAG_ABILITYSLICE_MULTI_DEVICE = 256;
    public static final int FLAG_ABILITY_CLEAR_MISSION = 32768;
    public static final int FLAG_ABILITY_CONTINUATION = 8;
    public static final int FLAG_ABILITY_FORM_ENABLED = 32;
    public static final int FLAG_ABILITY_FORWARD_RESULT = 4;
    public static final int FLAG_ABILITY_NEW_MISSION = 268435456;
    public static final int FLAG_INSTALL_ON_DEMAND = 2048;
    public static final int FLAG_INSTALL_WITH_BACKGROUND_MODE = Integer.MIN_VALUE;
    public static final int FLAG_NOT_OHOS_COMPONENT = 16;
    public static final int FLAG_START_FOREGROUND_ABILITY = 512;
    public static final Sequenceable.Producer<Intent> PRODUCER = null;

    public Intent() {
        throw new RuntimeException("Stub!");
    }

    public Intent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public void setOperation(Operation operation) {
        throw new RuntimeException("Stub!");
    }

    public Operation getOperation() {
        throw new RuntimeException("Stub!");
    }

    public Intent cloneOperation() {
        throw new RuntimeException("Stub!");
    }

    public boolean operationEquals(Intent other) {
        throw new RuntimeException("Stub!");
    }

    public int operationHashCode() {
        throw new RuntimeException("Stub!");
    }

    public static Intent makeMainAbility(ElementName elementName) {
        throw new RuntimeException("Stub!");
    }

    public static Intent makeRestartAbilityMission(ElementName elementName) {
        throw new RuntimeException("Stub!");
    }

    public static Intent makeMainAbilityPicker(String pickerAction, String pickerEntity) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static Intent parseUri(String uri) {
        throw new RuntimeException("Stub!");
    }

    public String toUri() {
        throw new RuntimeException("Stub!");
    }

    public String getAction() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Intent setAction(String action) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Intent setUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }

    public String getUriString() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Intent addEntity(String entity) {
        throw new RuntimeException("Stub!");
    }

    public void removeEntity(String entity) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasEntity(String entity) {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getEntities() {
        throw new RuntimeException("Stub!");
    }

    public int countEntities() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Intent setFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public Intent addFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public int getFlags() {
        throw new RuntimeException("Stub!");
    }

    public void removeFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public ElementName getElement() {
        throw new RuntimeException("Stub!");
    }

    public Intent setElement(ElementName element) {
        throw new RuntimeException("Stub!");
    }

    public Intent setElementName(String bundleName, String abilityName) {
        throw new RuntimeException("Stub!");
    }

    public Intent setElementName(String bundleName, Class<?> cls) {
        throw new RuntimeException("Stub!");
    }

    public Intent setElementName(String deviceId, String bundleName, String abilityName) {
        throw new RuntimeException("Stub!");
    }

    public Intent setElementName(String deviceId, String bundleName, Class<?> cls) {
        throw new RuntimeException("Stub!");
    }

    public Intent setBundle(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public String getBundle() {
        throw new RuntimeException("Stub!");
    }

    public Rect getBordersRect() {
        throw new RuntimeException("Stub!");
    }

    public void setBordersRect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public String getScheme() {
        throw new RuntimeException("Stub!");
    }

    public Intent setType(String type) {
        throw new RuntimeException("Stub!");
    }

    public String getType() {
        throw new RuntimeException("Stub!");
    }

    public Intent setUriAndType(Uri uri, String type) {
        throw new RuntimeException("Stub!");
    }

    public Intent formatUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static String formatMimeType(String mimeType) {
        throw new RuntimeException("Stub!");
    }

    public Intent formatUriAndType(Uri uri, String type) {
        throw new RuntimeException("Stub!");
    }

    public Intent formatType(String type) {
        throw new RuntimeException("Stub!");
    }

    public void setPicker(Intent picker) {
        throw new RuntimeException("Stub!");
    }

    public Intent getPicker() {
        throw new RuntimeException("Stub!");
    }

    public Intent setParams(IntentParams parameters) {
        throw new RuntimeException("Stub!");
    }

    public IntentParams getParams() {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, IntentParams parameter) {
        throw new RuntimeException("Stub!");
    }

    public IntentParams getParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasParameter(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean getBooleanParam(String key, boolean defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public boolean[] getBooleanArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public byte getByteParam(String key, byte defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getByteArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public short getShortParam(String key, short defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public short[] getShortArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public char getCharParam(String key, char defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public char[] getCharArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public int getIntParam(String key, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public int[] getIntArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<Integer> getIntegerArrayListParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public long getLongParam(String key, long defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public long[] getLongArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public float getFloatParam(String key, float defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public float[] getFloatArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public double getDoubleParam(String key, double defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public double[] getDoubleArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getStringParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public String[] getStringArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<String> getStringArrayListParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getCharSequenceParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence[] getCharSequenceArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<CharSequence> getCharSequenceArrayListParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public <T extends Serializable> T getSerializableParam(String key) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public <T extends Sequenceable> T getParcelableParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public <T extends Sequenceable> T getSequenceableParam(String key) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Sequenceable[] getParcelableArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public Sequenceable[] getSequenceableArrayParam(String key) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public <T extends Sequenceable> ArrayList<T> getParcelableArrayListParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public <T extends Sequenceable> ArrayList<T> getSequenceableArrayListParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, boolean value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, boolean[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, byte value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, byte[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, char value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, char[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, short value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, short[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setIntegerArrayListParam(String key, ArrayList<Integer> value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, long value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, long[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, float value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, double[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, String[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setStringArrayListParam(String key, ArrayList<String> value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, CharSequence value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, CharSequence[] value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setCharSequenceArrayListParam(String key, ArrayList<CharSequence> value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, Serializable value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, Sequenceable value) {
        throw new RuntimeException("Stub!");
    }

    public Intent setParam(String key, Sequenceable[] value) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public <T extends Sequenceable> Intent setParcelableArrayListParam(String key, ArrayList<T> value) {
        throw new RuntimeException("Stub!");
    }

    public <T extends Sequenceable> Intent setSequenceableArrayListParam(String key, ArrayList<T> value) {
        throw new RuntimeException("Stub!");
    }

    public void removeParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public Intent replaceParams(IntentParams intentParams) {
        throw new RuntimeException("Stub!");
    }

    public Intent replaceParams(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public int cloneByIntent(Intent other, int flags) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/aafwk/content/Intent$OperationBuilder.class */
    public static class OperationBuilder {
        public OperationBuilder() {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withAction(String action) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withEntities(Set<String> entities) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withUri(Uri uri) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withBundleName(String bundleName) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withFlags(int flags) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withDeviceId(String deviceId) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withAbilityName(String abilityName) {
            throw new RuntimeException("Stub!");
        }

        public OperationBuilder withAbilityName(Class<?> cls) {
            throw new RuntimeException("Stub!");
        }

        public Operation build() {
            throw new RuntimeException("Stub!");
        }
    }
}
