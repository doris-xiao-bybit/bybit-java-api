package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceTokenOrderRequest {
    private String coin;
    private String orderLinkId;
    private String orderType;
    private String amount;
    private String accountType;
}
