package com.echocart.backend.repository;

import com.echocart.backend.model.ExternalSignal;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExternalSignalRepository {
    private final JdbcTemplate jdbcTemplate;
    public ExternalSignalRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveSignal(ExternalSignal externalSignal){
        String sql = """
                INSERT INTO external_signal (product_id, source_type, content, sentiment_score)
                            VALUES (?, ?, ?, ?,?)
                """;
        jdbcTemplate.update(sql,
                externalSignal.getProductId(),
                externalSignal.getSourceType(),
                externalSignal.getContent(),
                externalSignal.getSentimentScore());
    }
}
