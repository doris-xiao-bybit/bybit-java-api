package com.bybit.api.client.domain.trade.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreCheckOrderRequest {
    private String category;
    private String symbol;
    private String side;
    private String orderType;
    private String qty;
    private String price;
    private Integer isLeverage;
    private String timeInForce;
    private Integer positionIdx;
    private String orderLinkId;
    private String takeProfit;
    private String stopLoss;
    private String tpTriggerBy;
    private String slTriggerBy;
    private Boolean reduceOnly;
    private String tpslMode;
    private String tpLimitPrice;
    private String slLimitPrice;
    private String tpOrderType;
    private String slOrderType;
    private String orderIv;
    private String triggerPrice;
    private String triggerBy;
    private Integer triggerDirection;
    private String marketUnit;
    private String smpType;
    private Boolean mmp;
    private Boolean closeOnTrigger;
}
