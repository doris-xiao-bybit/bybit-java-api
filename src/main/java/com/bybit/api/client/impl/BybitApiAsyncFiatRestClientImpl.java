package com.bybit.api.client.impl;

import com.bybit.api.client.restApi.BybitApiCallback;
import com.bybit.api.client.restApi.BybitApiService;
import com.bybit.api.client.restApi.BybitApiAsyncFiatRestClient;
import com.bybit.api.client.domain.fiat.request.ApplyQuoteRequest;
import com.bybit.api.client.domain.fiat.request.ConfirmQuoteV2Request;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;

public class BybitApiAsyncFiatRestClientImpl implements BybitApiAsyncFiatRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiAsyncFiatRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public void applyQuote(ApplyQuoteRequest applyQuoteRequest, BybitApiCallback<Object> callback) {
        bybitApiService.applyQuote(applyQuoteRequest).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void confirmQuotePost(ConfirmQuoteV2Request confirmQuoteV2Request, BybitApiCallback<Object> callback) {
        bybitApiService.confirmQuotePost(confirmQuoteV2Request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getReferencePrice(String symbol, String paymentMethod, BybitApiCallback<Object> callback) {
        bybitApiService.getReferencePrice(symbol, paymentMethod).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void queryBalance(String accountCategory, String currency, BybitApiCallback<Object> callback) {
        bybitApiService.queryBalance(accountCategory, currency).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void queryCoinList(Integer side, BybitApiCallback<Object> callback) {
        bybitApiService.queryCoinList(side).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void queryTrade(String tradeNo, String merchantRequestId, BybitApiCallback<Object> callback) {
        bybitApiService.queryTrade(tradeNo, merchantRequestId).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void queryTradeHistory(Long index, Integer limit, String startTime, String endTime, BybitApiCallback<Object> callback) {
        bybitApiService.queryTradeHistory(index, limit, startTime, endTime).enqueue(new BybitApiCallbackAdapter<>(callback));
    }
}
