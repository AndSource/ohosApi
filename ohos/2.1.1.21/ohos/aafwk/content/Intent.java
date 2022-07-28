/*      */ package ohos.aafwk.content;
/*      */ 
/*      */ import java.io.Serializable;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Set;
/*      */ import ohos.bundle.ElementName;
/*      */ import ohos.utils.Parcel;
/*      */ import ohos.utils.Sequenceable;
/*      */ import ohos.utils.geo.Rect;
/*      */ import ohos.utils.net.Uri;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Intent
/*      */   implements Sequenceable, Cloneable
/*      */ {
/*      */   public static final String ACTION_BOOK_FLIGHT = "ability.intent.BOOK_FLIGHT";
/*      */   public static final String ACTION_BOOK_HOTEL = "ability.intent.BOOK_HOTEL";
/*      */   public static final String ACTION_BOOK_TRAIN_TICKET = "ability.intent.BOOK_TRAIN_TICKET";
/*      */   public static final String ACTION_BUNDLE_ADD = "action.bundle.add";
/*      */   public static final String ACTION_BUNDLE_REMOVE = "action.bundle.remove";
/*      */   public static final String ACTION_BUNDLE_UPDATE = "action.bundle.update";
/*      */   public static final String ACTION_BUY = "ability.intent.BUY";
/*      */   public static final String ACTION_BUY_TAKEOUT = "ability.intent.BUY_TAKEOUT";
/*      */   public static final String ACTION_HOME = "action.system.home";
/*      */   public static final String ACTION_LOCALE_CHANGED = "ability.intent.LOCALE_CHANGED";
/*      */   public static final String ACTION_ORDER_TAXI = "ability.intent.ORDER_TAXI";
/*      */   public static final String ACTION_PLAN_ROUTE = "ability.intent.PLAN_ROUTE";
/*      */   public static final String ACTION_PLAY = "action.system.play";
/*      */   public static final String ACTION_QUERY_ALMANC = "ability.intent.QUERY_ALMANC";
/*      */   public static final String ACTION_QUERY_CONSTELLATION_FORTUNE = "ability.intent.QUERY_CONSTELLATION_FORTUNE";
/*      */   public static final String ACTION_QUERY_ENCYCLOPEDIA = "ability.intent.QUERY_ENCYCLOPEDIA";
/*      */   public static final String ACTION_QUERY_JOKE = "ability.intent.QUERY_JOKE";
/*      */   public static final String ACTION_QUERY_LOGISTICS_INFO = "ability.intent.QUERY_LOGISTICS_INFO";
/*      */   public static final String ACTION_QUERY_NEWS = "ability.intent.QUERY_NEWS";
/*      */   public static final String ACTION_QUERY_POI_INFO = "ability.intent.QUERY_POI_INFO";
/*      */   public static final String ACTION_QUERY_RECIPE = "ability.intent.QUERY_RECIPE";
/*      */   public static final String ACTION_QUERY_SPORTS_INFO = "ability.intent.QUERY_SPORTS_INFO";
/*      */   public static final String ACTION_QUERY_STOCK_INFO = "ability.intent.QUERY_STOCK_INFO";
/*      */   public static final String ACTION_QUERY_TRAFFIC_RESTRICTION = "ability.intent.QUERY_TRAFFIC_RESTRICTION";
/*      */   
/*      */   public Intent() {
/*   55 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */   public static final String ACTION_QUERY_TRAVELLING_GUIDELINE = "ability.intent.QUERY_TRAVELLING_GUIDELINE"; public static final String ACTION_QUERY_WEATHER = "ability.intent.QUERY_WEATHER"; public static final String ACTION_SEND_LOGISTICS = "ability.intent.SEND_LOGISTICS"; public static final String ACTION_TRANSLATE_TEXT = "ability.intent.TRANSLATE_TEXT"; public static final String ACTION_WATCH_VIDEO_CLIPS = "ability.intent.WATCH_VIDEO_CLIPS"; public static final int CLONE_ACTION = 1; public static final int CLONE_BORDERS_RECT = 64; public static final int CLONE_BUNDLE = 8; public static final int CLONE_ELEMENT = 32; public static final int CLONE_ENTITIES = 4; public static final int CLONE_PICKER = 16; public static final int CLONE_URI = 2; public static final String ENTITY_HOME = "entity.system.home"; public static final String ENTITY_VIDEO = "entity.system.video"; public static final int FLAG_ABILITYSLICE_FORWARD_RESULT = 67108864; public static final int FLAG_ABILITYSLICE_MULTI_DEVICE = 256; public static final int FLAG_ABILITY_CLEAR_MISSION = 32768; public static final int FLAG_ABILITY_CONTINUATION = 8; public static final int FLAG_ABILITY_FORM_ENABLED = 32; public static final int FLAG_ABILITY_FORWARD_RESULT = 4; public static final int FLAG_ABILITY_NEW_MISSION = 268435456;
/*      */   public static final int FLAG_INSTALL_ON_DEMAND = 2048;
/*      */   public static final int FLAG_INSTALL_WITH_BACKGROUND_MODE = -2147483648;
/*      */   public static final int FLAG_NOT_OHOS_COMPONENT = 16;
/*      */   public static final int FLAG_START_FOREGROUND_ABILITY = 512;
/*      */   
/*      */   public Intent(Intent intent) {
/*   64 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object clone() {
/*   73 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOperation(Operation operation) {
/*   81 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Operation getOperation() {
/*   90 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent cloneOperation() {
/*   99 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean operationEquals(Intent other) {
/*  111 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int operationHashCode() {
/*  121 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Intent makeMainAbility(ElementName elementName) {
/*  137 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Intent makeRestartAbilityMission(ElementName elementName) {
/*  151 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Intent makeMainAbilityPicker(String pickerAction, String pickerEntity) {
/*  166 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean marshalling(Parcel out) {
/*  178 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean unmarshalling(Parcel in) {
/*  190 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Intent parseUri(String uri) {
/*  201 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String toUri() {
/*  209 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAction() {
/*  217 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public Intent setAction(String action) {
/*  229 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public Intent setUri(Uri uri) {
/*  241 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Uri getUri() {
/*  249 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUriString() {
/*  258 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public Intent addEntity(String entity) {
/*  270 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeEntity(String entity) {
/*  280 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasEntity(String entity) {
/*  289 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set<String> getEntities() {
/*  297 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int countEntities() {
/*  305 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public Intent setFlags(int flags) {
/*  320 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent addFlags(int flags) {
/*  329 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getFlags() {
/*  337 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeFlags(int flags) {
/*  345 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ElementName getElement() {
/*  353 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setElement(ElementName element) {
/*  362 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setElementName(String bundleName, String abilityName) {
/*  376 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setElementName(String bundleName, Class<?> cls) {
/*  388 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setElementName(String deviceId, String bundleName, String abilityName) {
/*  403 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setElementName(String deviceId, String bundleName, Class<?> cls) {
/*  416 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setBundle(String bundleName) {
/*  430 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getBundle() {
/*  438 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Rect getBordersRect() {
/*  447 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBordersRect(Rect rect) {
/*  458 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getScheme() {
/*  467 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setType(String type) {
/*  480 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getType() {
/*  492 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setUriAndType(Uri uri, String type) {
/*  503 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent formatUri(Uri uri) {
/*  516 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String formatMimeType(String mimeType) {
/*  530 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent formatUriAndType(Uri uri, String type) {
/*  543 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent formatType(String type) {
/*  556 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPicker(Intent picker) {
/*  574 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent getPicker() {
/*  583 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParams(IntentParams parameters) {
/*  592 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntentParams getParams() {
/*  600 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, IntentParams parameter) {
/*  610 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IntentParams getParam(String key) {
/*  621 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasParameter(String key) {
/*  631 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getBooleanParam(String key, boolean defaultValue) {
/*  643 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean[] getBooleanArrayParam(String key) {
/*  654 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte getByteParam(String key, byte defaultValue) {
/*  666 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] getByteArrayParam(String key) {
/*  677 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short getShortParam(String key, short defaultValue) {
/*  689 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short[] getShortArrayParam(String key) {
/*  700 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public char getCharParam(String key, char defaultValue) {
/*  712 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public char[] getCharArrayParam(String key) {
/*  723 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getIntParam(String key, int defaultValue) {
/*  735 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int[] getIntArrayParam(String key) {
/*  746 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList<Integer> getIntegerArrayListParam(String key) {
/*  757 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getLongParam(String key, long defaultValue) {
/*  769 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long[] getLongArrayParam(String key) {
/*  780 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getFloatParam(String key, float defaultValue) {
/*  792 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float[] getFloatArrayParam(String key) {
/*  803 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double getDoubleParam(String key, double defaultValue) {
/*  815 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double[] getDoubleArrayParam(String key) {
/*  826 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStringParam(String key) {
/*  837 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String[] getStringArrayParam(String key) {
/*  848 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList<String> getStringArrayListParam(String key) {
/*  859 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CharSequence getCharSequenceParam(String key) {
/*  870 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CharSequence[] getCharSequenceArrayParam(String key) {
/*  881 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ArrayList<CharSequence> getCharSequenceArrayListParam(String key) {
/*  892 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Serializable> T getSerializableParam(String key) {
/*  904 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public <T extends Sequenceable> T getParcelableParam(String key) {
/*  917 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Sequenceable> T getSequenceableParam(String key) {
/*  929 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public Sequenceable[] getParcelableArrayParam(String key) {
/*  943 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Sequenceable[] getSequenceableArrayParam(String key) {
/*  955 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public <T extends Sequenceable> ArrayList<T> getParcelableArrayListParam(String key) {
/*  969 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Sequenceable> ArrayList<T> getSequenceableArrayListParam(String key) {
/*  981 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, boolean value) {
/*  991 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, boolean[] value) {
/* 1001 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, byte value) {
/* 1011 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, byte[] value) {
/* 1021 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, char value) {
/* 1031 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, char[] value) {
/* 1041 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, short value) {
/* 1051 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, short[] value) {
/* 1061 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, int value) {
/* 1071 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, int[] value) {
/* 1081 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setIntegerArrayListParam(String key, ArrayList<Integer> value) {
/* 1092 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, long value) {
/* 1102 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, long[] value) {
/* 1112 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, float value) {
/* 1122 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, float[] value) {
/* 1132 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, double value) {
/* 1142 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, double[] value) {
/* 1152 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, String value) {
/* 1162 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, String[] value) {
/* 1172 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setStringArrayListParam(String key, ArrayList<String> value) {
/* 1183 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, CharSequence value) {
/* 1193 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, CharSequence[] value) {
/* 1203 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setCharSequenceArrayListParam(String key, ArrayList<CharSequence> value) {
/* 1214 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, Serializable value) {
/* 1225 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, Sequenceable value) {
/* 1239 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent setParam(String key, Sequenceable[] value) {
/* 1253 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public <T extends Sequenceable> Intent setParcelableArrayListParam(String key, ArrayList<T> value) {
/* 1270 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Sequenceable> Intent setSequenceableArrayListParam(String key, ArrayList<T> value) {
/* 1285 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeParam(String key) {
/* 1294 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent replaceParams(IntentParams intentParams) {
/* 1304 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Intent replaceParams(Intent intent) {
/* 1314 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int cloneByIntent(Intent other, int flags) {
/* 1327 */     throw new RuntimeException("Stub!");
/*      */   } public boolean equals(Object other) {
/* 1329 */     throw new RuntimeException("Stub!");
/*      */   } public int hashCode() {
/* 1331 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1654 */   public static final Sequenceable.Producer<Intent> PRODUCER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class OperationBuilder
/*      */   {
/*      */     public OperationBuilder() {
/* 1665 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withAction(String action) {
/* 1675 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withEntities(Set<String> entities) {
/* 1685 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withUri(Uri uri) {
/* 1695 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withBundleName(String bundleName) {
/* 1705 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withFlags(int flags) {
/* 1715 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withDeviceId(String deviceId) {
/* 1725 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withAbilityName(String abilityName) {
/* 1735 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OperationBuilder withAbilityName(Class<?> cls) {
/* 1745 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Operation build() {
/* 1755 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/content/Intent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */