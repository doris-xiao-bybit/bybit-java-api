package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmInstCreateFundRequest {
    private String fundName;
    private String coin;
    private String profitShareRate;
    private String managementFeeRate;
    private String fundIntroduction;
    private String reqLinkId;
}
