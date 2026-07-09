package com.bybit.api.client.domain.fiat.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyQuoteRequest {
    private String fromCoin;
    private String fromCoinType;
    private String toCoin;
    private String toCoinType;
    private String requestAmount;
    private String requestCoinType;
}
