package com.mak.impaq;

public interface Scanner {
    ScannerResult scanProduct(String barcode);
    ScannerSummary finish();
}
