package ohos.miscservices.pasteboard;

import java.util.List;
import ohos.aafwk.content.Intent;
import ohos.app.Context;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/miscservices/pasteboard/PasteData.class */
public class PasteData implements Sequenceable {
    public static final int MAX_RECORD_NUM = 128;
    public static final String MIMETYPE_TEXT_HTML = "text/html";
    public static final String MIMETYPE_TEXT_INTENT = "text/ohos.intent";
    public static final String MIMETYPE_TEXT_PLAIN = "text/plain";
    public static final String MIMETYPE_TEXT_URI = "text/uri";

    public PasteData() {
        throw new RuntimeException("Stub!");
    }

    public static PasteData creatPlainTextData(CharSequence text) {
        throw new RuntimeException("Stub!");
    }

    public static PasteData creatHtmlData(String htmlText) {
        throw new RuntimeException("Stub!");
    }

    public static PasteData creatUriData(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static PasteData creatIntentData(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public String getPrimaryMimeType() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getPrimaryText() {
        throw new RuntimeException("Stub!");
    }

    public String getPrimaryHtml() {
        throw new RuntimeException("Stub!");
    }

    public Uri getPrimaryUri() {
        throw new RuntimeException("Stub!");
    }

    public Intent getPrimaryIntent() {
        throw new RuntimeException("Stub!");
    }

    public void addTextRecord(CharSequence text) {
        throw new RuntimeException("Stub!");
    }

    public void addHtmlRecord(String htmlText) {
        throw new RuntimeException("Stub!");
    }

    public void addUriRecord(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public void addIntentRecord(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void addRecord(Record record) {
        throw new RuntimeException("Stub!");
    }

    public int getRecordCount() {
        throw new RuntimeException("Stub!");
    }

    public Record getRecordAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeRecordAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public boolean replaceRecordAt(int index, Record record) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getMimeTypes() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasMimeType(String mimeType) {
        throw new RuntimeException("Stub!");
    }

    public DataProperty getProperty() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getTag() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/miscservices/pasteboard/PasteData$DataProperty.class */
    public static class DataProperty implements Sequenceable {
        DataProperty() {
            throw new RuntimeException("Stub!");
        }

        public List<String> getMimeTypes() {
            throw new RuntimeException("Stub!");
        }

        public boolean hasMimeType(String mimeType) {
            throw new RuntimeException("Stub!");
        }

        public long getTimestamp() {
            throw new RuntimeException("Stub!");
        }

        public CharSequence getTag() {
            throw new RuntimeException("Stub!");
        }

        public void setTag(CharSequence tag) {
            throw new RuntimeException("Stub!");
        }

        public PacMap getAdditions() {
            throw new RuntimeException("Stub!");
        }

        public void setAdditions(PacMap extraProps) {
            throw new RuntimeException("Stub!");
        }

        public boolean isLocalOnly() {
            throw new RuntimeException("Stub!");
        }

        public void setLocalOnly(boolean isLocalOnly) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean marshalling(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean unmarshalling(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/miscservices/pasteboard/PasteData$Record.class */
    public static class Record implements Sequenceable {
        Record(CharSequence text, String htmlText, Uri uri, Intent intent, String mimeType) {
            throw new RuntimeException("Stub!");
        }

        public static Record createPlainTextRecord(CharSequence text) {
            throw new RuntimeException("Stub!");
        }

        public static Record createHtmlTextRecord(String htmlText) {
            throw new RuntimeException("Stub!");
        }

        public static Record createUriRecord(Uri uri) {
            throw new RuntimeException("Stub!");
        }

        public static Record createIntentRecord(Intent intent) {
            throw new RuntimeException("Stub!");
        }

        public CharSequence getPlainText() {
            throw new RuntimeException("Stub!");
        }

        public String getHtmlText() {
            throw new RuntimeException("Stub!");
        }

        public Uri getUri() {
            throw new RuntimeException("Stub!");
        }

        public Intent getIntent() {
            throw new RuntimeException("Stub!");
        }

        public String getMimeType() {
            throw new RuntimeException("Stub!");
        }

        public CharSequence convertToText(Context context) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean marshalling(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean unmarshalling(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }
    }
}
