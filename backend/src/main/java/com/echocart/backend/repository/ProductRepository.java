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
                    rs.getLong("product_id"),
                    rs.getString("url"),
                    rs.getString("name"),
                    rs.getBoolean("deleted_flag")
            );

    public List<Product> findAll(){
        String sql = "SELECT product_id, name, url, deleted_flag FROM product WHERE deleted_flag = false";
        return jdbcTemplate.query(sql, productRowMapper);
    }
}
