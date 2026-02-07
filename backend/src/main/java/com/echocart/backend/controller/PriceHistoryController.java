package com.echocart.backend.controller;
import com.echocart.backend.service.PriceHistoryService;
import org.springframework.web.bind.annotation.*;
import com.echocart.backend.model.PriceHistory;

import java.util.List;

@RestController
@RequestMapping("/products")
public class PriceHistoryController {
    private final PriceHistoryService priceHistoryService;

    public PriceHistoryController(PriceHistoryService priceHistoryService) {
        this.priceHistoryService = priceHistoryService;
    }

    @GetMapping("/{productId}/prices")
    public List<PriceHistory> getPriceHistory(@PathVariable("productId") Long productId){
        return priceHistoryService.getPriceHistoryForProduct(productId);
    }
}
