package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmRedeemRequest {
    private String planId;
    private String category;
    private String productId;
    private String shares;
    private String amount;
    private String orderLinkId;
    private Long positionId;
}
