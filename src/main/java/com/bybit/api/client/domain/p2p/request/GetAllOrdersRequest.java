package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAllOrdersRequest {
    private Integer page;
    private Integer size;
    private Long status;
    private String beginTime;
    private String endTime;
    private String tokenId;
    private Long side;
}
