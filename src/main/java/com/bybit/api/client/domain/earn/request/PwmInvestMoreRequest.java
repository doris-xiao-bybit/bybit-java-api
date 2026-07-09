package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmInvestMoreRequest {
    private String planId;
    private String accountType;
    private String category;
    private String productId;
    private String amount;
    private String orderLinkId;
}
