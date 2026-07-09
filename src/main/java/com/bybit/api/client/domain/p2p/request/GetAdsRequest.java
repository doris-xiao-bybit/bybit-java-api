package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAdsRequest {
    private String tokenId;
    private String currencyId;
    private String side;
    private String page;
    private String size;
}
