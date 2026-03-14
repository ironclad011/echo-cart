package com.echocart.backend.service;
import com.echocart.backend.model.AIInsight;
import com.echocart.backend.model.PriceHistory;
import com.echocart.backend.repository.AIInsightRepository;
import com.echocart.backend.repository.PriceHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIInsightService {
    private final PriceHistoryRepository priceHistoryRepository;
    private final AIInsightRepository aiInsightRepository;

    public AIInsightService(PriceHistoryRepository priceHistoryRepository, AIInsightRepository aiInsightRepository) {
        this.priceHistoryRepository = priceHistoryRepository;
        this.aiInsightRepository = aiInsightRepository;
    }

    public AIInsight generateInsight(Long productId) {
        List<PriceHistory> prices =
                priceHistoryRepository.findByProductId(productId);

        String insightText;
        double confidence = 0.7;

        if (prices.size() < 2) {
            insightText = "Not enough price data to generate insight.";
        } else {
            double latest = prices.get(0).getPrice().doubleValue();
            double previous = prices.get(1).getPrice().doubleValue();

            if (latest < previous) {
                insightText = "Price has dropped recently. It might be a good time to buy.";
                confidence = 0.85;
            } else if (latest > previous) {
                insightText = "Price increased recently. You may want to wait.";
                confidence = 0.75;
            } else {
                insightText = "Price has remainde Stable.";
                confidence = 0.65;
            }
        }

        AIInsight insight = new AIInsight();
        insight.setProductId(productId);
        insight.setInsightText(insightText);
        insight.setConfidenceScore(confidence);

        aiInsightRepository.saveInsight(insight);

        return insight;
    }
}
