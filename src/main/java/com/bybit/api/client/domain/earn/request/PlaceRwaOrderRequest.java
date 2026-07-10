package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceRwaOrderRequest {
    private Long productId;
    private String orderType;
    private String coin;
    private String stakeAmount;
    private String redeemShares;
    private String accountType;
    private String orderLinkId;
}
