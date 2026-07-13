package com.bybit.api.market;

import com.bybit.api.client.domain.market.response.instrumentInfo.InstrumentEntry;
import com.bybit.api.client.domain.market.response.instrumentInfo.InstrumentInfoResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class InstrumentInfoTest {

    private static final String BASE = "https://api-testnet.bybit.com/v5/market/instruments-info";
    private final OkHttpClient http = new OkHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    private InstrumentInfoResult fetch(String category, String symbol) throws Exception {
        Request req = new Request.Builder()
                .url(BASE + "?category=" + category + "&symbol=" + symbol)
                .get()
                .build();
        try (Response resp = http.newCall(req).execute();
             ResponseBody body = resp.body()) {
            assertNotNull(body);
            JsonNode root = mapper.readTree(body.string());
            assertEquals("retCode should be 0, response=" + root, 0, root.path("retCode").asInt(-1));
            return mapper.treeToValue(root.get("result"), InstrumentInfoResult.class);
        }
    }

    @Test
    public void linearEntryDeserializes() throws Exception {
        InstrumentInfoResult result = fetch("linear", "BTCUSDT");
        assertEquals("linear", result.getCategory());
        assertFalse("expected at least one instrument", result.getInstrumentEntries().isEmpty());

        InstrumentEntry e = result.getInstrumentEntries().get(0);
        assertEquals("BTCUSDT", e.getSymbol());
        assertNotNull("leverageFilter should parse", e.getLeverageFilter());
        assertNotNull("priceFilter should parse", e.getPriceFilter());
        assertNotNull("lotSizeFilter should parse", e.getLotSizeFilter());

        System.out.println("[linear BTCUSDT]");
        System.out.println("  symbolId=" + e.getSymbolId());
        System.out.println("  symbolType=" + e.getSymbolType());
        System.out.println("  contractType=" + e.getContractType());
        System.out.println("  upperFundingRate=" + e.getUpperFundingRate());
        System.out.println("  lowerFundingRate=" + e.getLowerFundingRate());
        System.out.println("  displayName=" + e.getDisplayName());
        System.out.println("  forbidUplWithdrawal=" + e.getForbidUplWithdrawal());
        System.out.println("  riskParameters=" + e.getRiskParameters());
        System.out.println("  isPreListing=" + e.getIsPreListing());
        System.out.println("  preListingInfo=" + e.getPreListingInfo());
        System.out.println("  lotSizeFilter.minNotionalValue=" + e.getLotSizeFilter().getMinNotionalValue());
        System.out.println("  lotSizeFilter.maxMktOrderQty=" + e.getLotSizeFilter().getMaxMktOrderQty());
        System.out.println("  nextPageCursor=" + result.getNextPageCursor());

        if (e.getRiskParameters() != null) {
            assertNotNull(e.getRiskParameters().getPriceLimitRatioX());
            assertNotNull(e.getRiskParameters().getPriceLimitRatioY());
        }
    }

    @Test
    public void spotEntryDeserializes() throws Exception {
        InstrumentInfoResult result = fetch("spot", "BTCUSDT");
        assertEquals("spot", result.getCategory());
        assertFalse(result.getInstrumentEntries().isEmpty());

        InstrumentEntry e = result.getInstrumentEntries().get(0);
        assertEquals("BTCUSDT", e.getSymbol());

        System.out.println("[spot BTCUSDT]");
        System.out.println("  symbolId=" + e.getSymbolId());
        System.out.println("  symbolType=" + e.getSymbolType());
        System.out.println("  marginTrading=" + e.getMarginTrading());
        System.out.println("  stTag=" + e.getStTag());
        System.out.println("  xstockMultiplier=" + e.getXstockMultiplier());
        System.out.println("  riskParameters=" + e.getRiskParameters());
        System.out.println("  lotSizeFilter.maxLimitOrderQty=" + e.getLotSizeFilter().getMaxLimitOrderQty());
        System.out.println("  lotSizeFilter.maxMarketOrderQty=" + e.getLotSizeFilter().getMaxMarketOrderQty());
        System.out.println("  lotSizeFilter.postOnlyMaxLimitOrderSize=" + e.getLotSizeFilter().getPostOnlyMaxLimitOrderSize());
    }
}
