package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceFixedTermOrderRequest {
    private String productId;
    private String category;
    private String coin;
    private String amount;
    private String accountType;
    private String orderLinkId;
    private Boolean autoInvest;
}
