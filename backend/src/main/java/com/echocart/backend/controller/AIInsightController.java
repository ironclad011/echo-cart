package com.echocart.backend.controller;

import com.echocart.backend.model.AIInsight;
import com.echocart.backend.service.AIInsightService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class AIInsightController {

    private final AIInsightService aiInsightService;

    public AIInsightController(AIInsightService aiInsightService) {
        this.aiInsightService = aiInsightService;
    }

    @GetMapping("/{productId}/insight")
    public AIInsight getInsight(@PathVariable Long productId) {
        return aiInsightService.generateInsight(productId);
    }
}

