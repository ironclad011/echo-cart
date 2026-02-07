package com.echocart.backend.repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.echocart.backend.model.PriceHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriceHistoryRepository {
    private JdbcTemplate jdbcTemplate;
    public PriceHistoryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<PriceHistory> priceHistoryRowMapper = (rs,rowNum) -> new PriceHistory(
                rs.getLong("price_id"),
                rs.getLong("product_id"),
                rs.getBigDecimal("price"),
                rs.getTimestamp("recorded_at").toLocalDateTime(),
                rs.getString("source")
        );

    public List<PriceHistory> findByProductId(Long ProductId){
        String sql = "SELECT price_id,product_id,price,recorded_at,source FROM price_history WHERE product_id = ?";
        return jdbcTemplate.query(sql,priceHistoryRowMapper,ProductId);
    }
}
