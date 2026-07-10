package com.bybit.api.client.impl;

import com.bybit.api.client.restApi.BybitApiCallback;
import com.bybit.api.client.restApi.BybitApiService;
import com.bybit.api.client.restApi.BybitApiAsyncP2pRestClient;
import com.bybit.api.client.domain.p2p.request.GetAccountInfoRequest;
import com.bybit.api.client.domain.p2p.request.GetAdsRequest;
import com.bybit.api.client.domain.p2p.request.GetAllOrdersRequest;
import com.bybit.api.client.domain.p2p.request.GetChatMessagesRequest;
import com.bybit.api.client.domain.p2p.request.GetCounterpartyUserInfoRequest;
import com.bybit.api.client.domain.p2p.request.GetMyAdDetailsRequest;
import com.bybit.api.client.domain.p2p.request.GetMyAdsRequest;
import com.bybit.api.client.domain.p2p.request.GetOrderDetailRequest;
import com.bybit.api.client.domain.p2p.request.GetPendingOrdersRequest;
import com.bybit.api.client.domain.p2p.request.GetUserPaymentRequest;
import com.bybit.api.client.domain.p2p.request.MarkOrderAsPaidRequest;
import com.bybit.api.client.domain.p2p.request.PostAdRequest;
import com.bybit.api.client.domain.p2p.request.ReleaseAssetsRequest;
import com.bybit.api.client.domain.p2p.request.RemoveAdRequest;
import com.bybit.api.client.domain.p2p.request.SendChatMessageRequest;
import com.bybit.api.client.domain.p2p.request.UpdateAdRequest;
import okhttp3.MultipartBody;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;

public class BybitApiAsyncP2pRestClientImpl implements BybitApiAsyncP2pRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiAsyncP2pRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public void getAccountInfo(GetAccountInfoRequest getAccountInfoRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getAccountInfo(getAccountInfoRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getAds(GetAdsRequest getAdsRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getAds(getAdsRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getAllOrders(GetAllOrdersRequest getAllOrdersRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getAllOrders(getAllOrdersRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getChatMessages(GetChatMessagesRequest getChatMessagesRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getChatMessages(getChatMessagesRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getCounterpartyUserInfo(GetCounterpartyUserInfoRequest getCounterpartyUserInfoRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getCounterpartyUserInfo(getCounterpartyUserInfoRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getMyAdDetails(GetMyAdDetailsRequest getMyAdDetailsRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getMyAdDetails(getMyAdDetailsRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getMyAds(GetMyAdsRequest getMyAdsRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getMyAds(getMyAdsRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getOrderDetail(GetOrderDetailRequest getOrderDetailRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getOrderDetail(getOrderDetailRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getPendingOrders(GetPendingOrdersRequest getPendingOrdersRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getPendingOrders(getPendingOrdersRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getUserPayment(GetUserPaymentRequest getUserPaymentRequest, BybitApiCallback<Object> callback) {
        bybitApiService.getUserPayment(getUserPaymentRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void markOrderAsPaid(MarkOrderAsPaidRequest markOrderAsPaidRequest, BybitApiCallback<Object> callback) {
        bybitApiService.markOrderAsPaid(markOrderAsPaidRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void postAd(PostAdRequest postAdRequest, BybitApiCallback<Object> callback) {
        bybitApiService.postAd(postAdRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void releaseAssets(ReleaseAssetsRequest releaseAssetsRequest, BybitApiCallback<Object> callback) {
        bybitApiService.releaseAssets(releaseAssetsRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void removeAd(RemoveAdRequest removeAdRequest, BybitApiCallback<Object> callback) {
        bybitApiService.removeAd(removeAdRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void sendChatMessage(SendChatMessageRequest sendChatMessageRequest, BybitApiCallback<Object> callback) {
        bybitApiService.sendChatMessage(sendChatMessageRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void updateAd(UpdateAdRequest updateAdRequest, BybitApiCallback<Object> callback) {
        bybitApiService.updateAd(updateAdRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void uploadChatFile(MultipartBody.Part uploadFile, BybitApiCallback<Object> callback) {
        bybitApiService.uploadChatFile(uploadFile).enqueue(new BybitApiCallbackAdapter<>(callback));
    }
}
