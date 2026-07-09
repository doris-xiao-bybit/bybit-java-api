package com.bybit.api.client.domain.fiat.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfirmQuoteV2Request {
    private String quoteTxId;
    private String subUserId;
    private String webhookUrl;
    private String merchantRequestId;
}
