package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmInstManageInvestmentPlanRequest {
    private String planId;
    private String updateStatus;
    private java.util.List<Object> updateFunds;
    private String reqLinkId;
}
