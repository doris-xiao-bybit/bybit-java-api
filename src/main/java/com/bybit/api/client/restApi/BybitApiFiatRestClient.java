package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.fiat.request.ApplyQuoteRequest;
import com.bybit.api.client.domain.fiat.request.ConfirmQuoteV2Request;

public interface BybitApiFiatRestClient {

    Object applyQuote(ApplyQuoteRequest applyQuoteRequest);

    Object confirmQuotePost(ConfirmQuoteV2Request confirmQuoteV2Request);

    Object getReferencePrice(String symbol, String paymentMethod);

    Object queryBalance(String accountCategory, String currency);

    Object queryCoinList(Integer side);

    Object queryTrade(String tradeNo, String merchantRequestId);

    Object queryTradeHistory(Long index, Integer limit, String startTime, String endTime);
}
