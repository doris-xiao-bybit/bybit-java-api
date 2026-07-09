package com.bybit.api.client.domain.user.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignAgreementRequest {
    private Long category;
    private Boolean agree;
}
