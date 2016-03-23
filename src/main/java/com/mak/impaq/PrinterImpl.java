package com.mak.impaq;

import java.util.ArrayList;
import java.util.List;

public class PrinterImpl implements Printer {
    
    private List<Product> list =  new ArrayList<>();
    
    
    @Override
    public void printRecipt(ScannerSummary scannerSummary) {
        
        list = scannerSummary.productsList();
        
        list.forEach(list -> System.out.println("Product: " + list.getName() + ", price: " + list.getPrice()));
       
    }
    
}
