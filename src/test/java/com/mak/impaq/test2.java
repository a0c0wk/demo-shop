package com.mak.impaq;

import com.mak.impaq.ScannerImpl;
import com.mak.impaq.Scanner;
import com.mak.impaq.ProductsDB;
import com.mak.impaq.ScannerSummary;
import com.mak.impaq.ProductImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class test2 {

    @Test
    public void shouldCountSummaryPriceOfScannedProducts() {
        ProductsDB productsDB = Mockito.mock(ProductsDB.class);

        Mockito.when(productsDB.findProductByBarcode("123")).thenReturn(Optional.of(new ProductImpl("123", 2, "milk")));
        Mockito.when(productsDB.findProductByBarcode("345")).thenReturn(Optional.of(new ProductImpl("345", 5, "beer")));
        Mockito.when(productsDB.findProductByBarcode("678")).thenReturn(Optional.of(new ProductImpl("678", 3, "juice")));

        Scanner scanner = new ScannerImpl(productsDB);
        scanner.scanProduct("123");
        scanner.scanProduct("345");
        scanner.scanProduct("678");
      
        
        ScannerSummary scannerSummary = scanner.finish();
        
        int sum = scannerSummary.summaryPrice();

        assertEquals(sum, 10);

    }
}
