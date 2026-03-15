package com.echocart.backend.model;
import java.time.LocalDateTime;

public class ExternalSignal {
    private Long signalId;
    private Long productId;
    private String sourceType;
    private String content;
    private Double sentimentScore;
    private LocalDateTime createdAt;

    public ExternalSignal(){}

    public ExternalSignal(Long signalId, Long productId, String sourceType,
                          String content, Double sentimentScore,
                          LocalDateTime createdAt) {
        this.signalId = signalId;
        this.productId = productId;
        this.sourceType = sourceType;
        this.content = content;
        this.sentimentScore = sentimentScore;
        this.createdAt = createdAt;
    }


    public String getContent() {
        return content;
    }

    public Long getProductId() {
        return productId;
    }

    public Double getSentimentScore() {
        return sentimentScore;
    }

    public Long getSignalId() {
        return signalId;
    }

    public String getSourceType() {
        return sourceType;
    }

}
