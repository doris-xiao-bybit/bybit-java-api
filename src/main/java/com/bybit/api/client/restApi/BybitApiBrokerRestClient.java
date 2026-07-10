package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.broker.request.BrokerDataRequest;
import com.bybit.api.client.domain.broker.request.SetBrokerApiLimitRequest;

public interface BybitApiBrokerRestClient {
    // Broker endpoints
    Object getBrokerEarningData(BrokerDataRequest brokerDataRequest);
    Object getBrokerAccountInfo();
    Object getSubAccountsDeposits(BrokerDataRequest brokerDataRequest);
    Object getSubAccountsDeposits();
    Object getVoucherSpec(BrokerDataRequest brokerDataRequest);
    Object issueVoucher(BrokerDataRequest brokerDataRequest);
    Object getIssuedVoucher(BrokerDataRequest brokerDataRequest);
    default Object queryBrokerAllUidDetails(String uids, Integer limit, String cursor) {
        throw new UnsupportedOperationException("queryBrokerAllUidDetails is not implemented by this client");
    }
    default Object queryBrokerCap() {
        throw new UnsupportedOperationException("queryBrokerCap is not implemented by this client");
    }
    default Object setBrokerApiLimit(SetBrokerApiLimitRequest setBrokerApiLimitRequest) {
        throw new UnsupportedOperationException("setBrokerApiLimit is not implemented by this client");
    }
}
