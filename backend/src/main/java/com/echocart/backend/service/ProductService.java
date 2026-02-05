package com.echocart.backend.service;

import com.echocart.backend.model.Product;
import com.echocart.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
