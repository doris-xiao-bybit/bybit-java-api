package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;

public interface BybitApiAffiliateRestClient {

    Object getAffiliateUserList(AffiliateDataRequest request);

    Object getAffiliateSubList(String cursor, Integer size, String startDate, String endDate, Long subAffId);
}
