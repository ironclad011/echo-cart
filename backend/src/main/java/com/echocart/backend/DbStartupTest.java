package com.echocart.backend;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbStartupTest implements CommandLineRunner {
    private final JdbcTemplate jdbcTemplate;

    public DbStartupTest(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public void run(String... args) {
        Integer count = jdbcTemplate.queryForObject("select count(*) from product",Integer.class);
        System.out.println("✅ Connected to DB. Product count = " + count);
    }
}
