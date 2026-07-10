package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.spot.SpotMarginDataRequest;

import java.util.Map;

public interface BybitApiSpotMarginRestClient {
    // Spot Endpoints
    // Spot Leverage Token
    Object getSpotLeverageTokenInfo(SpotMarginDataRequest spotMarginDataRequest);
    Object getSpotLeverageTokenMarket(SpotMarginDataRequest spotMarginDataRequest);
    Object purchaseSpotLeverageToken(SpotMarginDataRequest spotMarginDataRequest);
    Object redeemSpotLeverageToken(SpotMarginDataRequest spotMarginDataRequest);
    Object getSpotLeverageRecords(SpotMarginDataRequest spotMarginDataRequest);

    // Spot Margin UTA
    Object getUtaVipSpotMarginTradeData(SpotMarginDataRequest spotMarginDataRequest);
    Object setUTASpotMarginTrade(String mode);
    Object setUTASpotMarginTradeLeverage(String leverage);
    Object setUTASpotMarginTradeAutoRepayMode(Map<String, Object> request);
    Object getUTASpotMarginTradeAutoRepayMode(Map<String, Object> request);
    Object getUTASpotMarginTradeLeverageState();

    // Spot Margin Normal
    Object getNormalVipSpotMarginTradeData(SpotMarginDataRequest spotMarginDataRequest);
    Object getNormalSpotMarginTradeCoinInfo(SpotMarginDataRequest spotMarginDataRequest);
    Object getNormalSpotMarginTradeBorrowCoinInfo(SpotMarginDataRequest spotMarginDataRequest);
    Object getNormalSpotMarginTradeInterestQuota(SpotMarginDataRequest spotMarginDataRequest);
    Object getNormalSpotMarginTradeAccountInfo();
    Object setNormalSpotToggleMarginTrade(SpotMarginDataRequest spotMarginDataRequest);
    Object loanNormalSpotMarginTrade(SpotMarginDataRequest spotMarginDataRequest);
    Object repayNormalSpotMarginTrade(SpotMarginDataRequest spotMarginDataRequest);
    default Object getNormalSpotMarginTradeBorrowOrders(SpotMarginDataRequest spotMarginDataRequest) {
        throw new UnsupportedOperationException("getNormalSpotMarginTradeBorrowOrders is not implemented by this client");
    }
    default Object getNormalSpotMarginTradeRepayOrders(SpotMarginDataRequest spotMarginDataRequest) {
        throw new UnsupportedOperationException("getNormalSpotMarginTradeRepayOrders is not implemented by this client");
    }
    default Object getSpotMarginInterestRateHistory(SpotMarginDataRequest spotMarginDataRequest) {
        throw new UnsupportedOperationException("getSpotMarginInterestRateHistory is not implemented by this client");
    }
    default Object getPositionTiers(String currency) {
        throw new UnsupportedOperationException("getPositionTiers is not implemented by this client");
    }
    default Object getTieredCollateralRatio(String currency) {
        throw new UnsupportedOperationException("getTieredCollateralRatio is not implemented by this client");
    }
}
