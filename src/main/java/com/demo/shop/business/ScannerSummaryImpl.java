package com.mak.impaq;

import java.util.List;

public class ScannerSummaryImpl implements ScannerSummary {

    private List<Product> productsList;
    private int summaryPrice;
    private Printer print;

    public ScannerSummaryImpl(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public List<Product> productsList() {
        print.printRecipt(this);
        return productsList;
    }

    @Override
    public int summaryPrice() {
        
        productsList.forEach(productsList -> summaryPrice = summaryPrice + productsList.getPrice());
        
        return summaryPrice;
    }

}
