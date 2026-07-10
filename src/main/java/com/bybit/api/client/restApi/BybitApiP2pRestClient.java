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
import okhttp3.MultipartBody;

public interface BybitApiP2pRestClient {

    Object getAccountInfo(GetAccountInfoRequest getAccountInfoRequest);

    Object getAds(GetAdsRequest getAdsRequest);

    Object getAllOrders(GetAllOrdersRequest getAllOrdersRequest);

    Object getChatMessages(GetChatMessagesRequest getChatMessagesRequest);

    Object getCounterpartyUserInfo(GetCounterpartyUserInfoRequest getCounterpartyUserInfoRequest);

    Object getMyAdDetails(GetMyAdDetailsRequest getMyAdDetailsRequest);

    Object getMyAds(GetMyAdsRequest getMyAdsRequest);

    Object getOrderDetail(GetOrderDetailRequest getOrderDetailRequest);

    Object getPendingOrders(GetPendingOrdersRequest getPendingOrdersRequest);

    Object getUserPayment(GetUserPaymentRequest getUserPaymentRequest);

    Object markOrderAsPaid(MarkOrderAsPaidRequest markOrderAsPaidRequest);

    Object postAd(PostAdRequest postAdRequest);

    Object releaseAssets(ReleaseAssetsRequest releaseAssetsRequest);

    Object removeAd(RemoveAdRequest removeAdRequest);

    Object sendChatMessage(SendChatMessageRequest sendChatMessageRequest);

    Object updateAd(UpdateAdRequest updateAdRequest);

    Object uploadChatFile(MultipartBody.Part uploadFile);
}
