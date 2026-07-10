package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAdRequest {
    private String id;
    private String priceType;
    private String premium;
    private String price;
    private String minAmount;
    private String maxAmount;
    private String remark;
    private Object tradingPreferenceSet;
    private List<String> paymentIds;
    private String actionType;
    private String quantity;
    private String paymentPeriod;
}
