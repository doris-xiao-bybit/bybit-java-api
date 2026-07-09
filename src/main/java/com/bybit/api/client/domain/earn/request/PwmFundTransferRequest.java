package com.bybit.api.client.domain.earn.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PwmFundTransferRequest {
    private String transferId;
    private Long fromUserId;
    private Long toUserId;
    private String amount;
    private String coin;
}
