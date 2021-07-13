package com.demo.shop.business;

import java.util.Optional;

import com.demo.shop.entity.Product;

public class ScannerResultImpl implements ScannerResult {

    private Optional<Product> product;
    private Optional<String> message;
   

    public ScannerResultImpl(Optional<Product> product, Optional<String> message) {
        this.product = product;
        this.message = message;
    }

    @Override
    public Optional<Product> product() {
        return product;
    }

    @Override
    public Optional<String> message() {
        return message;
    }

}
