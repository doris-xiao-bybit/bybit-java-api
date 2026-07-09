package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.account.request.AccountDataRequest;
import com.bybit.api.client.domain.account.request.BatchSetCollateralCoinRequest;
import com.bybit.api.client.domain.account.request.ManualBorrowRequest;
import com.bybit.api.client.domain.account.request.ManualRepayRequest;
import com.bybit.api.client.domain.account.request.NoConvertRepayRequest;
import com.bybit.api.client.domain.account.request.OneClickRepayRequest;
import com.bybit.api.client.domain.account.request.SetPriceLimitRequest;

public interface BybitApiAccountRestClient {
    // Account endpoints
    Object getWalletBalance(AccountDataRequest walletBalanceRequest);
    Object upgradeAccountToUTA();
    Object getAccountBorrowHistory(AccountDataRequest borrowHistoryRequest);
    Object setAccountCollateralCoin(AccountDataRequest setCollateralCoinRequest);
    Object batchSetAccountCollateralCoin(BatchSetCollateralCoinRequest batchSetCollateralCoinRequest);
    Object getAccountCollateralInfo(AccountDataRequest request);
    Object getAccountCoinGeeks(AccountDataRequest request);
    Object getAccountFreeRate(AccountDataRequest getFeeRateRequest);
    Object getAccountInfo();
    Object getTransactionLog(AccountDataRequest getTransactionLogRequest);
    Object setAccountMarginMode(AccountDataRequest request);
    Object setAccountSpotHedging(AccountDataRequest request);
    Object modifyAccountMMP(AccountDataRequest setMMPRequest);
    Object resetAccountMMP(AccountDataRequest request);
    Object getAccountMMPState(AccountDataRequest request);
    Object getAccountSMPGroup();

    Object getAccountInstruments(String category, String symbol, Integer limit, String cursor);

    Object getDcpInfo();

    Object getTransferableAmount(String coinName);

    Object getUserSettings();

    Object manualBorrow(ManualBorrowRequest manualBorrowRequest);

    Object manualRepay(ManualRepayRequest manualRepayRequest);

    Object noConvertRepay(NoConvertRepayRequest noConvertRepayRequest);

    Object oneClickRepay(OneClickRepayRequest oneClickRepayRequest);

    Object setPriceLimit(SetPriceLimitRequest setPriceLimitRequest);
}
