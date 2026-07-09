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
    Object queryBrokerAllUidDetails(String uids, Integer limit, String cursor);
    Object queryBrokerCap();
    Object setBrokerApiLimit(SetBrokerApiLimitRequest setBrokerApiLimitRequest);
}
