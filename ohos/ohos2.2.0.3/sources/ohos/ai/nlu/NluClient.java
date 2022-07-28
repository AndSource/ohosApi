package ohos.ai.nlu;

import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/ai/nlu/NluClient.class */
public class NluClient {
    NluClient() {
        throw new RuntimeException("Stub!");
    }

    public static NluClient getInstance() {
        throw new RuntimeException("Stub!");
    }

    public void init(Context context, OnResultListener<Integer> listener, boolean isLoadModel) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getWordSegment(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getWordSegment(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getEntity(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getEntity(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getWordPos(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getWordPos(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getChatIntention(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getChatIntention(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getAssistantIntention(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getAssistantIntention(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getKeywords(String requestData, int requestType) {
        throw new RuntimeException("Stub!");
    }

    public ResponseResult getKeywords(String requestData, int requestType, OnResultListener<ResponseResult> listener) {
        throw new RuntimeException("Stub!");
    }

    public void destroy(Context context) {
        throw new RuntimeException("Stub!");
    }
}
