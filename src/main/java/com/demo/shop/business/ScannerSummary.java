package com.demo.shop.business;

import java.util.List;

import com.demo.shop.entity.Product;

public interface ScannerSummary {
    List<Product> productsList();
    int summaryPrice();
}
