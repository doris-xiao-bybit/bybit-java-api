package com.bybit.api.client.domain.broker.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetBrokerApiLimitRequest {
    private java.util.List<Object> list;
}
