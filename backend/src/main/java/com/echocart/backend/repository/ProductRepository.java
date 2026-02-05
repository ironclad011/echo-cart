package com.echocart.backend.repository;

import java.util.List;
import com.echocart.backend.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    private final RowMapper<Product> productRowMapper = (rs,rowNum)->
            new Product(
                    rs.getLong("productID"),
                    rs.getString("url"),
                    rs.getString("productName"),
                    rs.getBoolean("deleted_flag")
            );

    public List<Product> findAll(){
        String sql = "SELECT productID, productName, url, deleted_flag FROM product WHERE deleted_flag = false";
        return jdbcTemplate.query(sql, productRowMapper);
    }
}
