package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLiquidityRequest {
    private String productId;
    private String orderLinkId;
    private String quoteAccountType;
    private String baseAccountType;
    private String quoteAmount;
    private String baseAmount;
    private String leverage;
}
