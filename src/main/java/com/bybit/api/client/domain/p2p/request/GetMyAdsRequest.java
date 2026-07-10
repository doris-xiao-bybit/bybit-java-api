package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMyAdsRequest {
    private String itemId;
    private String status;
    private String side;
    private String tokenId;
    private String page;
    private String size;
    private String currencyId;
}
