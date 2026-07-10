package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmCreateCustomPlanRequest {
    private String accountType;
    private java.util.List<Object> products;
    private String orderLinkId;
}
