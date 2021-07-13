package com.demo.shop.business;

import java.util.Optional;

import com.demo.shop.entity.Product;

public interface ScannerResult {
    
    Optional<Product> product();
    Optional<String> message();
    
}
