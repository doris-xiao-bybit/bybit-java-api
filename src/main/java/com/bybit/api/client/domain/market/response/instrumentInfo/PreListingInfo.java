package com.bybit.api.client.domain.market.response.instrumentInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class PreListingInfo {
    private String curAuctionPhase;
    private List<PreListingPhase> phases;
    private AuctionFeeInfo auctionFeeInfo;
    private Boolean skipCallAuction;
}
