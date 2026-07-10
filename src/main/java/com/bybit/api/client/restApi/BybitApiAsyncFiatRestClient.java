package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.fiat.request.ApplyQuoteRequest;
import com.bybit.api.client.domain.fiat.request.ConfirmQuoteV2Request;

public interface BybitApiAsyncFiatRestClient {
    void applyQuote(ApplyQuoteRequest applyQuoteRequest, BybitApiCallback<Object> callback);

    void confirmQuote(ConfirmQuoteV2Request confirmQuoteV2Request, BybitApiCallback<Object> callback);

    void getReferencePrice(String symbol, String paymentMethod, BybitApiCallback<Object> callback);

    void queryBalance(String accountCategory, String currency, BybitApiCallback<Object> callback);

    void queryCoinList(Integer side, BybitApiCallback<Object> callback);

    void queryTrade(String tradeNo, String merchantRequestId, BybitApiCallback<Object> callback);

    void queryTradeHistory(Long index, Integer limit, String startTime, String endTime, BybitApiCallback<Object> callback);
}
