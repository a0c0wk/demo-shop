package com.demo.shop.business;

public interface Scanner {
    ScannerResult scanProduct(String barcode);
    ScannerSummary finish();
}
