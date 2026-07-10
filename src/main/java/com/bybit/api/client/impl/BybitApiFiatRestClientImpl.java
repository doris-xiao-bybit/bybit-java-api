package com.bybit.api.client.impl;

import com.bybit.api.client.restApi.BybitApiService;
import com.bybit.api.client.restApi.BybitApiFiatRestClient;
import com.bybit.api.client.domain.fiat.request.ApplyQuoteRequest;
import com.bybit.api.client.domain.fiat.request.ConfirmQuoteV2Request;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;
import static com.bybit.api.client.service.BybitApiServiceGenerator.executeSync;

public class BybitApiFiatRestClientImpl implements BybitApiFiatRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiFiatRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public Object applyQuote(ApplyQuoteRequest applyQuoteRequest) {
        return executeSync(bybitApiService.applyQuote(applyQuoteRequest));
    }

    @Override
    public Object confirmQuote(ConfirmQuoteV2Request confirmQuoteV2Request) {
        return executeSync(bybitApiService.confirmQuote(confirmQuoteV2Request));
    }

    @Override
    public Object getReferencePrice(String symbol, String paymentMethod) {
        return executeSync(bybitApiService.getReferencePrice(symbol, paymentMethod));
    }

    @Override
    public Object queryBalance(String accountCategory, String currency) {
        return executeSync(bybitApiService.queryBalance(accountCategory, currency));
    }

    @Override
    public Object queryCoinList(Integer side) {
        return executeSync(bybitApiService.queryCoinList(side));
    }

    @Override
    public Object queryTrade(String tradeNo, String merchantRequestId) {
        return executeSync(bybitApiService.queryTrade(tradeNo, merchantRequestId));
    }

    @Override
    public Object queryTradeHistory(Long index, Integer limit, String startTime, String endTime) {
        return executeSync(bybitApiService.queryTradeHistory(index, limit, startTime, endTime));
    }
}
