package com.echocart.backend.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceHistory {
    private Long priceId;
    private Long productId;
    private BigDecimal price;
    private LocalDateTime recordedAt;
    private String source;

    public PriceHistory(Long priceId, Long productId, BigDecimal price, LocalDateTime recordedAt, String source) {
        this.priceId = priceId;
        this.productId = productId;
        this.price = price;
        this.recordedAt = recordedAt;
        this.source = source;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getPriceId() {
        return priceId;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public String getSource() {
        return source;
    }
}
