package com.echocart.backend.model;
import java.time.LocalDateTime;

public class AIInsight {
    private Long insightId;
    private Long productId;
    private String insightText;
    private Double confidendeScore;
    private LocalDateTime createdAt;

    public AIInsight(){

    }

    public AIInsight(Long insightId, Long productId, String insightText, Double confidenceScore, LocalDateTime createdAt){
        this.insightId = insightId;
        this.productId = productId;
        this.insightText = insightText;
        this.confidendeScore = confidenceScore;
        this.createdAt = createdAt;
    }

    public Long getInsightId() {
        return insightId;
    }

    public void setInsightId(Long insightId) {
        this.insightId = insightId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getInsightText() {
        return insightText;
    }

    public void setInsightText(String insightText) {
        this.insightText = insightText;
    }

    public Double getConfidenceScore() {
        return confidendeScore;
    }

    public void setConfidenceScore(Double confidendeScore) {
        this.confidendeScore = confidendeScore;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
