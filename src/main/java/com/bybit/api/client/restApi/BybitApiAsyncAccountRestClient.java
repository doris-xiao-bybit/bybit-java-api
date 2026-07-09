package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.account.request.AccountDataRequest;
import com.bybit.api.client.domain.account.request.BatchSetCollateralCoinRequest;
import com.bybit.api.client.domain.account.request.ManualBorrowRequest;
import com.bybit.api.client.domain.account.request.ManualRepayRequest;
import com.bybit.api.client.domain.account.request.NoConvertRepayRequest;
import com.bybit.api.client.domain.account.request.OneClickRepayRequest;
import com.bybit.api.client.domain.account.request.SetPriceLimitRequest;

public interface BybitApiAsyncAccountRestClient {
    // Account endpoints
    void getWalletBalance(AccountDataRequest walletBalanceRequest, BybitApiCallback<Object> callback);
    void upgradeAccountToUTA(BybitApiCallback<Object> callback);
    void getAccountBorrowHistory(AccountDataRequest borrowHistoryRequest, BybitApiCallback<Object> callback);
    void setAccountCollateralCoin(AccountDataRequest setCollateralCoinRequest, BybitApiCallback<Object> callback);
    void batchSetAccountCollateralCoin(BatchSetCollateralCoinRequest batchSetCollateralCoinRequest, BybitApiCallback<Object> callback);
    void getAccountCollateralInfo(AccountDataRequest request, BybitApiCallback<Object> callback);
    void getAccountCoinGeeks(AccountDataRequest request, BybitApiCallback<Object> callback);
    void getAccountFreeRate(AccountDataRequest getFeeRateRequest, BybitApiCallback<Object> callback);
    void getAccountInfo(BybitApiCallback<Object> callback);
    void getTransactionLog(AccountDataRequest getTransactionLogRequest, BybitApiCallback<Object> callback);
    void setAccountMarginMode(AccountDataRequest request, BybitApiCallback<Object> callback);
    void modifyAccountMMP(AccountDataRequest setMMPRequest, BybitApiCallback<Object> callback);
    void resetAccountMMP(AccountDataRequest request, BybitApiCallback<Object> callback);
    void getAccountMMPState(AccountDataRequest request, BybitApiCallback<Object> callback);
    void getAccountSMPGroup(BybitApiCallback<Object> callback);
    void setAccountSpotHedging(AccountDataRequest request, BybitApiCallback<Object> callback);

    void getAccountInstruments(String category, String symbol, Integer limit, String cursor, BybitApiCallback<Object> callback);

    void getDcpInfo(BybitApiCallback<Object> callback);

    void getTransferableAmount(String coinName, BybitApiCallback<Object> callback);

    void getUserSettings(BybitApiCallback<Object> callback);

    void manualBorrow(ManualBorrowRequest manualBorrowRequest, BybitApiCallback<Object> callback);

    void manualRepay(ManualRepayRequest manualRepayRequest, BybitApiCallback<Object> callback);

    void noConvertRepay(NoConvertRepayRequest noConvertRepayRequest, BybitApiCallback<Object> callback);

    void oneClickRepay(OneClickRepayRequest oneClickRepayRequest, BybitApiCallback<Object> callback);

    void setPriceLimit(SetPriceLimitRequest setPriceLimitRequest, BybitApiCallback<Object> callback);
}
