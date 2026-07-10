package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceEarnOrderRequest {
    private String category;
    private String orderType;
    private String accountType;
    private String amount;
    private String coin;
    private String productId;
    private String orderLinkId;
    private String redeemPositionId;
    private String toAccountType;
    private Object interestCard;
}
