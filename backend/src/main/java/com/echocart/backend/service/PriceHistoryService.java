package com.echocart.backend.service;

import com.echocart.backend.model.PriceHistory;
import com.echocart.backend.repository.PriceHistoryRepository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PriceHistoryService {
    private final PriceHistoryRepository priceHistoryRepository;
    public PriceHistoryService(PriceHistoryRepository priceHistoryRepository) {
        this.priceHistoryRepository = priceHistoryRepository;
    }

    public List<PriceHistory> getPriceHistoryForProduct(Long productId){
        return priceHistoryRepository.findByProductId(productId);
    }
}
