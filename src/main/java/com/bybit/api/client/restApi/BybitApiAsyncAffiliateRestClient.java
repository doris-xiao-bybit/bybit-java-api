package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;

public interface BybitApiAsyncAffiliateRestClient {

    void getAffiliateUserList(AffiliateDataRequest request, BybitApiCallback<Object> callback);

    void getAffiliateSubList(String cursor, Integer size, String startDate, String endDate, Long subAffId, BybitApiCallback<Object> callback);
}
