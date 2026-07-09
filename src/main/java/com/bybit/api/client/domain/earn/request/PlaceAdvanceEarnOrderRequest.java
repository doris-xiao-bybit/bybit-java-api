package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceAdvanceEarnOrderRequest {
    private String category;
    private Long productId;
    private String orderType;
    private String amount;
    private String accountType;
    private String coin;
    private String orderLinkId;
    private Object dualAssetsExtra;
    private Object interestCard;
    private Object smartLeverageStakeExtra;
    private Object smartLeverageRedeemExtra;
    private Object doubleWinStakeExtra;
    private Object doubleWinRedeemExtra;
    private Object discountBuyExtra;
}
