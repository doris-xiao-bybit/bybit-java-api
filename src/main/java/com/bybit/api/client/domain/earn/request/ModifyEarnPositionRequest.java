package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyEarnPositionRequest {
    private String category;
    private Long productId;
    private Long positionId;
    private Integer autoReinvest;
}
