package com.demo.shop.entity;

import com.demo.shop.business.ScannerSummary;

public interface Printer extends Product {
    void printRecipt(ScannerSummary scannerSummary);
}
