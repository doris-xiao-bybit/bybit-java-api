package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;

public interface BybitApiAffiliateRestClient {

    Object getAffiliateUserList(AffiliateDataRequest request);

    default Object getAffiliateSubList(String cursor, Integer size, String startDate, String endDate, Long subAffId) {
        throw new UnsupportedOperationException("getAffiliateSubList is not implemented by this client");
    }
}
