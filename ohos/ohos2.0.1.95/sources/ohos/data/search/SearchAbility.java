package ohos.data.search;

import java.util.List;
import java.util.Map;
import ohos.app.Context;
import ohos.data.search.connect.ServiceConnectCallback;
import ohos.data.search.listener.IIndexChangeListener;
import ohos.data.search.model.IndexData;
import ohos.data.search.model.IndexForm;
import ohos.data.search.model.SearchableEntity;

/* loaded from: ohos2.0.1.95.jar:ohos/data/search/SearchAbility.class */
public class SearchAbility {
    public SearchAbility(Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean connect(ServiceConnectCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean disconnect() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasConnected() {
        throw new RuntimeException("Stub!");
    }

    public int setIndexForm(String bundleName, int version, List<IndexForm> indexFormList) {
        throw new RuntimeException("Stub!");
    }

    public List<IndexForm> getIndexForm(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public int getIndexFormVersion(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public int clearIndexForm(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public List<IndexData> insert(String groupId, String bundleName, List<IndexData> indexDataList) {
        throw new RuntimeException("Stub!");
    }

    public List<IndexData> update(String groupId, String bundleName, List<IndexData> indexDataList) {
        throw new RuntimeException("Stub!");
    }

    public List<IndexData> delete(String groupId, String bundleName, List<IndexData> indexDataList) {
        throw new RuntimeException("Stub!");
    }

    public List<String> deleteByTerm(String groupId, String bundleName, String indexFieldName, List<String> indexFieldValueList) {
        throw new RuntimeException("Stub!");
    }

    public int deleteByQuery(String groupId, String bundleName, String queryJsonStr) {
        throw new RuntimeException("Stub!");
    }

    public int clearIndex(String groupId, String bundleName, Map<String, List<String>> deviceIds) {
        throw new RuntimeException("Stub!");
    }

    public SearchSession beginSearch(String groupId, String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public void endSearch(String groupId, String bundleName, SearchSession searchSession) {
        throw new RuntimeException("Stub!");
    }

    public void registerIndexChangeListener(String groupId, String bundleName, IIndexChangeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterIndexChangeListener(String groupId, String bundleName, IIndexChangeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public SearchResult setSearchableEntity(SearchableEntity searchableEntity) {
        throw new RuntimeException("Stub!");
    }

    public SearchableEntity getSearchableEntity(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public List<SearchableEntity> getSearchableEntityList() {
        throw new RuntimeException("Stub!");
    }
}
