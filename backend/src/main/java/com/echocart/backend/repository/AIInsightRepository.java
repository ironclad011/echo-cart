package com.echocart.backend.repository;
import com.echocart.backend.model.AIInsight;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AIInsightRepository {
    private final JdbcTemplate jdbcTemplate;

    public AIInsightRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveInsight(AIInsight aiInsight) {
        String sql = """
               INSERT INTO ai_insight (product_id, insight_text, confidence_score)
               VALUES (?, ?, ?)
                """;
        jdbcTemplate.update(
                sql,
                aiInsight.getProductId(),
                aiInsight.getInsightText(),
                aiInsight.getConfidenceScore()
        );

    }
}
