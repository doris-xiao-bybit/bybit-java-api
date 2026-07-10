package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostAdRequest {
    private String tokenId;
    private String currencyId;
    private String side;
    private String priceType;
    private String premium;
    private String price;
    private String minAmount;
    private String maxAmount;
    private String remark;
    private Object tradingPreferenceSet;
    private List<String> paymentIds;
    private String quantity;
    private String paymentPeriod;
    private String itemType;
}
