package com.bybit.api.client.domain.p2p.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendChatMessageRequest {
    private String message;
    private String contentType;
    private String orderId;
    private String msgUuid;
    private String fileName;
}
