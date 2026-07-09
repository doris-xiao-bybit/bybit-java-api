package com.bybit.api.client.impl;

import com.bybit.api.client.restApi.BybitApiService;
import com.bybit.api.client.restApi.BybitApiP2pRestClient;
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
import com.bybit.api.client.domain.p2p.request.UploadChatFileRequest;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;
import static com.bybit.api.client.service.BybitApiServiceGenerator.executeSync;

public class BybitApiP2pRestClientImpl implements BybitApiP2pRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiP2pRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public Object getAccountInfoPost(GetAccountInfoRequest getAccountInfoRequest) {
        return executeSync(bybitApiService.getAccountInfoPost(getAccountInfoRequest));
    }

    @Override
    public Object getAds(GetAdsRequest getAdsRequest) {
        return executeSync(bybitApiService.getAds(getAdsRequest));
    }

    @Override
    public Object getAllOrders(GetAllOrdersRequest getAllOrdersRequest) {
        return executeSync(bybitApiService.getAllOrders(getAllOrdersRequest));
    }

    @Override
    public Object getChatMessages(GetChatMessagesRequest getChatMessagesRequest) {
        return executeSync(bybitApiService.getChatMessages(getChatMessagesRequest));
    }

    @Override
    public Object getCounterpartyUserInfo(GetCounterpartyUserInfoRequest getCounterpartyUserInfoRequest) {
        return executeSync(bybitApiService.getCounterpartyUserInfo(getCounterpartyUserInfoRequest));
    }

    @Override
    public Object getMyAdDetails(GetMyAdDetailsRequest getMyAdDetailsRequest) {
        return executeSync(bybitApiService.getMyAdDetails(getMyAdDetailsRequest));
    }

    @Override
    public Object getMyAds(GetMyAdsRequest getMyAdsRequest) {
        return executeSync(bybitApiService.getMyAds(getMyAdsRequest));
    }

    @Override
    public Object getOrderDetail(GetOrderDetailRequest getOrderDetailRequest) {
        return executeSync(bybitApiService.getOrderDetail(getOrderDetailRequest));
    }

    @Override
    public Object getPendingOrders(GetPendingOrdersRequest getPendingOrdersRequest) {
        return executeSync(bybitApiService.getPendingOrders(getPendingOrdersRequest));
    }

    @Override
    public Object getUserPayment(GetUserPaymentRequest getUserPaymentRequest) {
        return executeSync(bybitApiService.getUserPayment(getUserPaymentRequest));
    }

    @Override
    public Object markOrderAsPaid(MarkOrderAsPaidRequest markOrderAsPaidRequest) {
        return executeSync(bybitApiService.markOrderAsPaid(markOrderAsPaidRequest));
    }

    @Override
    public Object postAd(PostAdRequest postAdRequest) {
        return executeSync(bybitApiService.postAd(postAdRequest));
    }

    @Override
    public Object releaseAssets(ReleaseAssetsRequest releaseAssetsRequest) {
        return executeSync(bybitApiService.releaseAssets(releaseAssetsRequest));
    }

    @Override
    public Object removeAd(RemoveAdRequest removeAdRequest) {
        return executeSync(bybitApiService.removeAd(removeAdRequest));
    }

    @Override
    public Object sendChatMessage(SendChatMessageRequest sendChatMessageRequest) {
        return executeSync(bybitApiService.sendChatMessage(sendChatMessageRequest));
    }

    @Override
    public Object updateAd(UpdateAdRequest updateAdRequest) {
        return executeSync(bybitApiService.updateAd(updateAdRequest));
    }

    @Override
    public Object uploadChatFile(UploadChatFileRequest uploadChatFileRequest) {
        return executeSync(bybitApiService.uploadChatFile(uploadChatFileRequest));
    }
}
