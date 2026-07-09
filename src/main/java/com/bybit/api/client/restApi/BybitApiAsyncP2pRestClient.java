package com.bybit.api.client.restApi;

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

public interface BybitApiAsyncP2pRestClient {
    void getAccountInfoPost(GetAccountInfoRequest getAccountInfoRequest, BybitApiCallback<Object> callback);

    void getAds(GetAdsRequest getAdsRequest, BybitApiCallback<Object> callback);

    void getAllOrders(GetAllOrdersRequest getAllOrdersRequest, BybitApiCallback<Object> callback);

    void getChatMessages(GetChatMessagesRequest getChatMessagesRequest, BybitApiCallback<Object> callback);

    void getCounterpartyUserInfo(GetCounterpartyUserInfoRequest getCounterpartyUserInfoRequest, BybitApiCallback<Object> callback);

    void getMyAdDetails(GetMyAdDetailsRequest getMyAdDetailsRequest, BybitApiCallback<Object> callback);

    void getMyAds(GetMyAdsRequest getMyAdsRequest, BybitApiCallback<Object> callback);

    void getOrderDetail(GetOrderDetailRequest getOrderDetailRequest, BybitApiCallback<Object> callback);

    void getPendingOrders(GetPendingOrdersRequest getPendingOrdersRequest, BybitApiCallback<Object> callback);

    void getUserPayment(GetUserPaymentRequest getUserPaymentRequest, BybitApiCallback<Object> callback);

    void markOrderAsPaid(MarkOrderAsPaidRequest markOrderAsPaidRequest, BybitApiCallback<Object> callback);

    void postAd(PostAdRequest postAdRequest, BybitApiCallback<Object> callback);

    void releaseAssets(ReleaseAssetsRequest releaseAssetsRequest, BybitApiCallback<Object> callback);

    void removeAd(RemoveAdRequest removeAdRequest, BybitApiCallback<Object> callback);

    void sendChatMessage(SendChatMessageRequest sendChatMessageRequest, BybitApiCallback<Object> callback);

    void updateAd(UpdateAdRequest updateAdRequest, BybitApiCallback<Object> callback);

    void uploadChatFile(UploadChatFileRequest uploadChatFileRequest, BybitApiCallback<Object> callback);
}
