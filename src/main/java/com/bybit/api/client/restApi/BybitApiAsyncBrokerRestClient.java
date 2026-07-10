package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.broker.request.BrokerDataRequest;
import com.bybit.api.client.domain.broker.request.SetBrokerApiLimitRequest;

public interface BybitApiAsyncBrokerRestClient {
    // Broker endpoints
    void getBrokerEarningData(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getBrokerAccountInfo(BybitApiCallback<Object> callback);
    void getSubAccountsDeposits(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getSubAccountsDeposits(BybitApiCallback<Object> callback);
    void getVoucherSpec(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void issueVoucher(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);
    void getIssuedVoucher(BrokerDataRequest brokerDataRequest, BybitApiCallback<Object> callback);

    default void queryBrokerAllUidDetails(String uids, Integer limit, String cursor, BybitApiCallback<Object> callback) {
        throw new UnsupportedOperationException("queryBrokerAllUidDetails is not implemented by this client");
    }

    default void queryBrokerCap(BybitApiCallback<Object> callback) {
        throw new UnsupportedOperationException("queryBrokerCap is not implemented by this client");
    }

    default void setBrokerApiLimit(SetBrokerApiLimitRequest setBrokerApiLimitRequest, BybitApiCallback<Object> callback) {
        throw new UnsupportedOperationException("setBrokerApiLimit is not implemented by this client");
    }
}
