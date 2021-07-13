package com.demo.shop.business;

import java.util.List;

import com.demo.shop.entity.Product;

public class ScannerSummaryImpl implements ScannerSummary {

    private List<Product> productsList;
    private int summaryPrice;
   

    public ScannerSummaryImpl(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public List<Product> productsList() {
        return productsList;
    }

    @Override
    public int summaryPrice() {
        
        productsList.forEach(productsList -> summaryPrice = summaryPrice + productsList.getPrice());
        
        return summaryPrice;
    }

}
